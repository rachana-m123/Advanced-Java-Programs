/*Write a Java Program for Counting the number of words in a string using user defined function
countWords()*/




package stringhandlingfunc;
import java.util.Scanner;
public class Countword {

    // User-defined function to count the number of words in a string
    public static int countWords(String str) {
        // Trim the string and split by one or more whitespace characters
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Call the function
        int wordCount = countWords(input);

        // Output the result
        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }
}

