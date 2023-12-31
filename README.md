# LangTrainer


My app includes a graphical user interface (GUI) built with Swing components, allowing users to select a language and game mode for language learning. The game has two modes: "Translator" and "LangGame." Here's an overview of the Translator mode:

The TranslatorMode in my Lang Trainer game serves as a component for translating words or phrases between different languages. This mode allows players to engage, reinforcing language learning in an interactive way. The class utilizes the Google Translate API through the com.darkprograms.speech.translator.GoogleTranslate library to perform the translations.
In the game's graphical user interface (GUI), when the user selects the "Translator" mode, the TranslatorMode class is invoked. The user is prompted to enter a word or phrase, and based on the selected target language, the translation is displayed in the JTextArea. The supported languages include Spanish, French, German, Italian, Portuguese, Russian, Arabic, Chinese, and Japanese.
The TranslatorMode class encapsulates the translation logic, abstracting it from the main GUI class. This modular approach enhances code readability and maintainability. The class also handles potential errors gracefully, displaying informative messages through JOptionPane if an exception occurs during the translation process.

Here's an overview of the Translator mode:

In the LangGame mode, the user is presented with a word in a selected language, and they need to choose the correct translation from a set of options. The game uses a graphical interface with buttons for the user to make selections. The LangGame mode is initiated when the user selects "LangGame" from the modeSelector JComboBox.
The LangGame mode involves several key components:

Selection Buttons:
Four buttons are created to represent the possible translations.
These buttons are added to a JPanel (buttonPanel) arranged in a 2x2 grid.

Random Word Selection:
A random word is selected from a text file using the Words class.
The selected word is then translated into the chosen language using the TranslatorMode class.

Displaying the Word:
The selected word is displayed to the user in the heading JLabel.

Shuffling and Displaying Options:
The correct translation is assigned to a randomly chosen button.
Incorrect translations are generated by changing one character in the correct translation.
The buttons are shuffled to present the options in a random order.

User Input:
The user interacts with the GUI by clicking on one of the selection buttons.

Checking the Answer:
The correctness of the user's answer is determined by comparing it with the correct translation.

Alphabet Class:
The Alphabet class is used to generate random characters for modifying incorrect translations.
It provides different sets of characters based on the selected language.

User Interface Updates:
The GUI is updated based on user interactions, such as selecting a language, mode, or replaying the LangGame.
