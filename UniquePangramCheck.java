import java.util.Scanner;

public class UniquePangramCheck {
    public static void main(String[] args) {
        // Input a string
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check if the input is a pangram
        boolean isPangram = isPangram(input);

        // Display the result
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String s) {
        // Create a boolean array to track the presence of each letter
        boolean[] isPresent = new boolean[26]; // 26 letters in the English alphabet

        // Convert the input to lowercase to make it case-insensitive
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                isPresent[c - 'a'] = true;
            }
        }

        // Check if all letters are present
        for (boolean letterPresent : isPresent) {
            if (!letterPresent) {
                return false; // If any letter is missing, it's not a pangram
            }
        }

        return true; // All letters are present, it's a pangram
    }
}
