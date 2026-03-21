package Day10;
import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        String result = "";

        for (String word : words) {
            String reversedWord = "";

            // Reverse each word
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }

            result += reversedWord + " ";
        }

        System.out.println("Output: " + result.trim());

        sc.close();
    }
}