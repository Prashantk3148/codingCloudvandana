import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        // Create a map to store Roman numeral values
        Map<Character, Integer> romanMap = createRomanMap();

        // Input a Roman numeral
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();

        // Convert the Roman numeral to an integer or display an error message
        int integerValue = romanToInteger(romanNumeral, romanMap);
        if (integerValue != -1) {
            System.out.println("Integer value of the Roman numeral: " + integerValue);
        } else {
            System.out.println("Invalid Roman numeral input.");
        }
    }

    public static Map<Character, Integer> createRomanMap() {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        return romanMap;
    }

    public static int romanToInteger(String s, Map<Character, Integer> romanMap) {
        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            if (!romanMap.containsKey(currentChar)) {
                return -1; // Invalid input
            }

            int value = romanMap.get(currentChar);

            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }

            prevValue = value;
        }

        return result;
    }
}
