import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        boolean isPangram = checkIfPangram(sentence);
        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }

    private static boolean checkIfPangram(String sentence) {
        // Remove spaces and convert all letters to lowercase
        sentence = sentence.replaceAll(" ", "").toLowerCase();

        boolean[] alphabet = new boolean[26]; // Array to track presence of each letter
        int count = 0; // Number of unique letters found

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (Character.isLetter(c)) {
                int index = c - 'a'; // Get the corresponding index in the alphabet array
                if (!alphabet[index]) {
                    alphabet[index] = true; // Mark the letter as present
                    count++;
                }
            }
            if (count == 26) {
                return true; // All letters have been found
            }
        }

        return false; // Not all letters have been found
    }
}
