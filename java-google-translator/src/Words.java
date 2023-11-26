
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Words {
    private ArrayList<String> words;
    static final String filePath = "src/words.txt";

    public Words(String filePath) {
        words = new ArrayList<>();
        loadWordsFromFile(filePath);
    }

    /*
    !!! CALL-OUT !!!
    File Reading
    */
    private void loadWordsFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getRandomWord() {
        if (words.isEmpty()) {
            return null; // No words available
        }

        Random random = new Random();
        int randomIndex = random.nextInt(words.size());
        return words.get(randomIndex);
    }

    public static void main(String[] args) {
        Words wordSelector = new Words(filePath);

        String randomWord = wordSelector.getRandomWord();
        if (randomWord != null) {
            System.out.println(randomWord);
        } else {
            System.out.println("No words available in the file.");
        }
    }
}
