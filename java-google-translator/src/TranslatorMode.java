import com.darkprograms.speech.translator.GoogleTranslate;

import javax.swing.*;
import java.io.IOException;
import java.util.Objects;

public class TranslatorMode {
    /*
    !!! CALL-OUT !!!
    CHILD CLASS
    */
    public void setTranslation(JFrame frame, JComboBox<String> langSelectorBox, JTextArea textArea, String phrase) {
        if (langSelectorBox.getSelectedItem().equals("Spanish")) {
            try {
                textArea.append("Translation: " +GoogleTranslate.translate("es", phrase) + "\n");
            } catch (IOException ex) {
                ex.printStackTrace();
                /*
                !!! CALL-OUT !!!
                ERROR HANDLING
                */
                JOptionPane.showInputDialog(frame, "Please enter different a word or phrase to translate");
            }
        } else if (langSelectorBox.getSelectedItem().equals("French")) {
            try {
                textArea.append("Translation: " + GoogleTranslate.translate("fr", phrase) + "\n");
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showInputDialog(frame, "Please enter different a word or phrase to translate");
            }
        } else if (langSelectorBox.getSelectedItem().equals("German")) {
            try {
                textArea.append("Translation: " + GoogleTranslate.translate("de", phrase) + "\n");
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showInputDialog(frame, "Please enter different a word or phrase to translate");
            }
        } else if (langSelectorBox.getSelectedItem().equals("Italian")) {
            try {
                textArea.append("Translation: " + GoogleTranslate.translate("it", phrase) + "\n");
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showInputDialog(frame, "Please enter different a word or phrase to translate");
            }
        } else if (langSelectorBox.getSelectedItem().equals("Portuguese")) {
            try {
                textArea.append("Translation: " + GoogleTranslate.translate("pt", phrase) + "\n");
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showInputDialog(frame, "Please enter different a word or phrase to translate");
            }
        } else if (langSelectorBox.getSelectedItem().equals("Russian")) {
            try {
                textArea.append("Translation: " + GoogleTranslate.translate("ru", phrase) + "\n");
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showInputDialog(frame, "Please enter different a word or phrase to translate");
            }
        } else if (langSelectorBox.getSelectedItem().equals("Arabic")) {
            try {
                textArea.append("Translation: " + GoogleTranslate.translate("ar", phrase) + "\n");
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showInputDialog(frame, "Please enter different a word or phrase to translate");
            }
        } else if (langSelectorBox.getSelectedItem().equals("Chinese")) {
            try {
                textArea.append("Translation: " + GoogleTranslate.translate("zh", phrase) + "\n");
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showInputDialog(frame, "Please enter different a word or phrase to translate");
            }
        } else if (langSelectorBox.getSelectedItem().equals("Japanese")) {
            try {
                textArea.append("Translation: " + GoogleTranslate.translate("ja", phrase) + "\n");
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showInputDialog(frame, "Please enter different a word or phrase to translate");
            }
        }
    }

    public String setTranslation(String langSelectorBox, String phrase) throws IOException {
        try {

            if (langSelectorBox.equals("Spanish")) {
                return GoogleTranslate.translate("es", phrase);
            } else if (langSelectorBox.equals("French")) {
                return GoogleTranslate.translate("fr", phrase);
            } else if (langSelectorBox.equals("German")) {
                return GoogleTranslate.translate("de", phrase);
            } else if (langSelectorBox.equals("Italian")) {
                return GoogleTranslate.translate("it", phrase);
            } else if (langSelectorBox.equals("Portuguese")) {
                return GoogleTranslate.translate("pt", phrase);
            } else if (langSelectorBox.equals("Russian")) {
                return GoogleTranslate.translate("ru", phrase);
            } else if (langSelectorBox.equals("Arabic")) {
                return GoogleTranslate.translate("ar", phrase);
            } else if (langSelectorBox.equals("Chinese")) {
                return GoogleTranslate.translate("zh", phrase);
            } else if (langSelectorBox.equals("Japanese")) {
                return GoogleTranslate.translate("ja", phrase);
            } else if ((phrase == null)) {
                return "null phrase";
            } else {
                return "empty phrase";
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
            return "";
        }
    }

        public String getTranslation() {

            return null;
        }

}
