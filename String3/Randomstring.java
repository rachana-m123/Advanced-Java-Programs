/*Write a Java Program for Creating a random string of a specified length using user defined
function generateRandomString()
*/




package stringhandlingfunc;
import java.util.Random;
import java.util.Scanner;
public class Randomstring {
	// User-defined function to generate a random string of given length
    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            result.append(characters.charAt(index));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter the length of the random string: ");
        int length = scanner.nextInt();

        // Generate and display the random string
        String randomString = generateRandomString(length);
        System.out.println("Generated Random String: " + randomString);

        scanner.close();
    }
}

