import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


/*
!!! CALL-OUT !!!
MULTI-THREADING
*/
class CheckAnswerWorker extends SwingWorker<Void, Void> {
    private final GUI gui;
    private volatile boolean correctButtonPressed = false; // Use volatile for thread safety

    public CheckAnswerWorker(GUI gui) {
        this.gui = gui;
    }
    public void setCorrectButtonPressed(boolean correctButtonPressed) {
        this.correctButtonPressed = correctButtonPressed;
    }

    @Override
    protected Void doInBackground() throws Exception {
        final boolean[] guess = {false};


        // Use a loop to continuously check if a button is pressed
        while (!correctButtonPressed && !guess[0]) {
            // Check if the correct button is pressed based on the correctButtonIndex
            for (JButton button : gui.selectionButtons) {
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (e.getSource() == button) {
                            try {
                                guess[0] = gui.checkAnswer(button.getText());
                                if (guess[0]) {
                                    correctButtonPressed = true; // Set the flag to stop checking
                                }
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    }
                });
            }
        }
        if (!(guess[0])) {
            gui.gameMessagesTextArea.append("Incorrect!");
        }
        if (guess[0]) {
            gui.gameMessagesTextArea.append("Correct!");
        }


        gui.mainFrame.repaint();

        return null;
    }
}


// When I want to stop checking (for example, when the correct button is pressed) call:
// worker.cancel(true);
