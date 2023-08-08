import java.util.Scanner;
import java.util.Map;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.regex.Pattern;

public class Word_counter {
    public static void main(String[] args) {
        String inputText = getInputText();
        Map<String, Integer> wordCount = countWords(inputText);
            displayWordCount(wordCount);
    }

    public static String getInputText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text: ");
            return scanner.nextLine();
    }

    public static Map<String, Integer> countWords(String text) {
        // Preprocess the text: remove punctuation and convert to lowercase
        text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        String[] words = text.split("\\s+");

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            // You can add a list of common words or stop words to ignore here.
            // For example: String[] commonWords = {"the", "and", "is", "a", "an"};
            // if (Arrays.asList(commonWords).contains(word)) {
            //     continue;
            // }

            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        return wordCount;
    }

    public static void displayWordCount(Map<String, Integer> wordCount) {
        int totalWords = 0;
        int uniqueWords = wordCount.size();

        System.out.println("\nWord frequencies:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            totalWords += count;

            System.out.println(word + ": " + count);
        }

        System.out.println("\nTotal number of words: " + totalWords);
        System.out.println("Number of unique words: " + uniqueWords);
    }
}

