import com.darkprograms.speech.translator.GoogleTranslate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Random;

public class GUI implements ActionListener {

    JFrame mainFrame;
    JLabel heading;
    JTextArea gameMessagesTextArea;
    JComboBox<String> langSelector;
    JLabel selectedLang;
    JButton reselectLang;
    JComboBox<String> modeSelector;
    String phrase;
    String translatedWord;
    ArrayList<JButton> selectionButtons;
    JButton button;
    int correctButtonIndex;
    JPanel buttonPanel;
    String playerName = "";
    public GUI() {
        mainFrame = new JFrame("Lang Trainer");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(900, 600);
        mainFrame.setLayout(null);
        int frameWidth = mainFrame.getWidth();
        int frameHeight = mainFrame.getHeight();

         /*
        !!! CALL-OUT !!!
        JLABEL
        */
        // Add heading JLabel to frame
        heading = new JLabel("Lang Trainer: Select a language to begin");
        heading.setFont(new Font("FiraCode", Font.BOLD, 16));
        mainFrame.add(heading);


        // Add JLabel for displaying selected language
        selectedLang = new JLabel("Current Language:");
        selectedLang.setFont(new Font("FiraCode", Font.BOLD, 11));
        mainFrame.add(selectedLang);


        /*
        !!! CALL-OUT !!!
        GIF ANIMATION
        */
        // Add globe.gif to frame
        URL url = this.getClass().getResource("globe.gif");
        Icon globe = new ImageIcon(url);
        JLabel glob = new JLabel(globe);
        mainFrame.add(glob);

        /*
        !!! CALL-OUT !!!
        JTEXTAREA
        */
        // JTextArea to hold all game messages
        gameMessagesTextArea = new JTextArea();
        gameMessagesTextArea.setEditable(false);
        gameMessagesTextArea.setLineWrap(true);         // Enable line wrapping
        gameMessagesTextArea.setWrapStyleWord(true);    // Wrap text at word boundaries
        gameMessagesTextArea.setBorder(BorderFactory.createLineBorder(Color.black));
        /*
        !!! CALL-OUT !!!
        JScrollPane
        */
        JScrollPane scrollPane = new JScrollPane(gameMessagesTextArea);
        scrollPane.setBorder(BorderFactory.createLineBorder(Color.white));
        mainFrame.add(scrollPane);

        /*
        !!! CALL-OUT !!!
        JCOMBOBOX
        */
        // Drop down selector for languages
        String[] choices = {"", "Spanish","French", "German","Italian","Portuguese", "Russian","Arabic", "Chinese", "Japanese"};
        langSelector = new JComboBox<String>(choices);
        mainFrame.add(langSelector);

        // Drop down selector for single or two-player modes
        String[] modes = {"", "Translator","LangGame"};
        modeSelector = new JComboBox<String>(modes);
        modeSelector.setVisible(false);
        mainFrame.add(modeSelector);

        //JButton to go back to make langSelector visible again
        reselectLang = new JButton("Re-select Language");
        reselectLang.setVisible(false);
        mainFrame.add(reselectLang);

        // JButtons for LangGame selections
        selectionButtons = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            button = new JButton();
            selectionButtons.add(button);
            button.setText("bbbb");
            button.addActionListener(this);
            button.setName("selection" + i);
            button.setActionCommand("selection" + i);  // Set action command
        }

        // JPanel to hold selection buttons
        buttonPanel = new JPanel(new GridLayout(2, 2, 30, 30));
        for (JButton btn : selectionButtons) {
            buttonPanel.add(btn);
        }
        buttonPanel.setFont(new Font("FiraCode", Font.BOLD, 12));
        buttonPanel.setVisible(false);
        mainFrame.add(buttonPanel);


        openAboutFile();


        // Register ActionListeners
        langSelector.addActionListener(this);
        reselectLang.addActionListener(this);
        modeSelector.addActionListener(this);

        // Position components
        glob.setBounds(300, 265, 400, 400);
        heading.setBounds(340, 40, 350, 40);
        langSelector.setBounds(400, 150, 180, 30);
        scrollPane.setBounds(10, 45, 200, 500);
        selectedLang.setBounds(10, 20, 300, 30);
        reselectLang.setBounds(710, 40, 150, 20);
        modeSelector.setBounds(400, 150, 180, 30);

        mainFrame.setVisible(true);
    }

    private void openAboutFile() {
        /*
        !!! CALL-OUT !!!
        File Reading
        */
        String filePath = "About.txt";
        try {
            ProcessBuilder processBuilder = new ProcessBuilder();   // Use the ProcessBuilder to execute the default text editor
            processBuilder.command("notepad.exe", filePath);        // Use "notepad.exe" for Windows, adjust for other OS
            processBuilder.start();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void updateSelectedLanguage() {
        selectedLang.setText("Current Language: " + langSelector.getSelectedItem());
    }


    /*
    !!! CALL-OUT !!!
    OVERRIDE METHOD
    */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == langSelector) {
            updateSelectedLanguage();
            langSelector.setVisible(false);
            buttonPanel.setVisible(false);
            modeSelector.setVisible(true);
            if (!langSelector.getSelectedItem().equals("")) {
                heading.setText("Please Select a Game Mode");
                heading.setBounds(388, 30, 350, 40);
                reselectLang.setVisible(true);
                mainFrame.repaint();
            }
        }
        else if (source == reselectLang) {
            reselectLang.setVisible(false);
            buttonPanel.setVisible(false);
            heading.setText("Lang Trainer: Select a language to begin");
            gameMessagesTextArea.append("Host: Select a language to begin" + "\n");
            heading.setBounds(340, 30, 350, 40);
            langSelector.setVisible(true);
        }
        else if (source == modeSelector) {
            if (modeSelector.getSelectedItem().equals("Translator")) {
                heading.setText("Enter a word or phrase to translate");
                heading.setBounds(360, 30, 350, 40);
                phrase = JOptionPane.showInputDialog(mainFrame, "Enter a word or phrase to translate");

                if (phrase != null) {
                    TranslatorMode translator = new TranslatorMode();
                    translator.setTranslation(mainFrame, langSelector, gameMessagesTextArea, phrase);
                } else {
                    phrase = "";
                }
            } else if (modeSelector.getSelectedItem().equals("LangGame")) {
                Single singlePlayer = new Single();
                buttonPanel.setBounds(310, 150, 340, 100);
                playerName = JOptionPane.showInputDialog(mainFrame, "Enter your name to track your score");
                if (playerName != null) {
                    gameMessagesTextArea.append("Current Player: " + playerName + "\n");
                } else {
                    playerName = "";
                }
                Collections.shuffle(selectionButtons);
                buttonPanel.setVisible(true);
                gameMessagesTextArea.append("Host: Select the correct translation" + "\n");
                modeSelector.setVisible(false);
                // Select a random word from a txt file
                Words wordSelector = new Words(Words.filePath);
                String randomWord = wordSelector.getRandomWord();
                // Translate randomWord
                String langName = selectedLang.getText().split("\\s", 3)[2];
                TranslatorMode translator = new TranslatorMode();
                try {
                    translatedWord = translator.setTranslation(langName, randomWord);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                heading.setBounds(390, 30, 350, 40);
                Random random = new Random();
                int indexToSwitch = random.nextInt(randomWord.length());
                // Randomly select a char to change in the randomWord
                if (randomWord != null) {
                    heading.setText("Your word is: " + randomWord);
                } else {
                    System.out.println("No words available in the file.");
                }

                // Assign correct answer to a random button
                correctButtonIndex = random.nextInt(selectionButtons.size());
                selectionButtons.get(correctButtonIndex).setText(translatedWord);
                selectionButtons.get(correctButtonIndex).setFont(new Font("FiraCode", Font.BOLD, 20));

                // Assign incorrect answers to the other buttons
                Alphabet alphabet = new Alphabet();
                for (int i = 0; i < selectionButtons.size(); i++) {
                    if (i != correctButtonIndex) {
                        char charToChange = translatedWord.charAt(random.nextInt(translatedWord.length()));
                        selectionButtons.get(i).setText(String.valueOf(charToChange));
                        // generate a random char to replace one char in translatedWord
                        char changedChar = alphabet.generateChar(langName, charToChange);
                        // create a char array to easily switch out a char
                        char[] charArray = translatedWord.toCharArray();
                        // Replace the letter at the specified index
                        charArray[indexToSwitch] = changedChar;
                        // Create a new string with the modified char array
                        String modifiedTranslatedWord = new String(charArray);
                        selectionButtons.get(i).setText(modifiedTranslatedWord);
                    }
                }

                // Shuffle the buttons so the correct answer is in a random position
                Collections.shuffle(selectionButtons);

                // Worker to lighten load on Swing components
                CheckAnswerWorker worker = new CheckAnswerWorker(this);
                worker.execute();



                mainFrame.repaint();
            }




        }

    }

    boolean checkAnswer(String selectedAnswer) throws IOException {
        return selectedAnswer.equals(translatedWord);
    }

    private void replayLangGame() {
        Collections.shuffle(selectionButtons);
        gameMessagesTextArea.append("Host: Select the correct translation" + "\n");

        // Select a random word from a txt file
        Words wordSelector = new Words(Words.filePath);
        String randomWord = wordSelector.getRandomWord();

        // Translate randomWord
        String langName = selectedLang.getText().split("\\s", 3)[2];
        TranslatorMode translator = new TranslatorMode();
        try {
            translatedWord = translator.setTranslation(langName, randomWord);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Assign correct answer to a random button
        Random random = new Random();
        int correctButtonIndex = random.nextInt(selectionButtons.size());
        selectionButtons.get(correctButtonIndex).setText(translatedWord);
        selectionButtons.get(correctButtonIndex).setFont(new Font("FiraCode", Font.BOLD, 20));

        // Randomly select a char to change in the randomWord
        int indexToSwitch = random.nextInt(randomWord.length());
        if (randomWord != null) {
            heading.setText("Your word is: " + randomWord);
        } else {
            System.out.println("No words available in the file.");
        }

        // Assign incorrect answers to the other buttons
        Alphabet alphabet = new Alphabet();
        for (int i = 0; i < selectionButtons.size(); i++) {
            if (i != correctButtonIndex) {
                char charToChange = translatedWord.charAt(random.nextInt(translatedWord.length()));
                selectionButtons.get(i).setText(String.valueOf(charToChange));
                // generate a random char to replace one char in translatedWord
                char changedChar = alphabet.generateChar(langName, charToChange);
                // create a char array to easily switch out a char
                char[] charArray = translatedWord.toCharArray();
                // Replace the letter at the specified index
                charArray[indexToSwitch] = changedChar;
                // Create a new string with the modified char array
                String modifiedTranslatedWord = new String(charArray);
                selectionButtons.get(i).setText(modifiedTranslatedWord);
            }
        }

        // Shuffle the buttons so the correct answer is in a random position
        Collections.shuffle(selectionButtons);
    }
    public static void main(String[] args) {
        GUI gui = new GUI();
        Alphabet alphabet = new Alphabet();
    }

}

