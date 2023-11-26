import java.util.*;

class HelloWorld {
    public static void main(String[] args) {

        // Input string containing space-separated numbers
        String s = "998 999 23 1";

        // Number of digits to consider
        int digit = 3;

        // Variable to store the result
        int ans = -1;

        // Split the input string into an array of numbers
        String[] numbers = s.split(" +");

        // Iterate through each number in the array
        for (int i = 0; i < numbers.length; i++) {
            // Parse the current string into an integer
            int number = Integer.parseInt(numbers[i]);

            // Get the length of the current number
            int length = numbers[i].length();

            // Check if the current number meets the conditions:
            // 1. Greater than the current result
            // 2. Has the specified number of digits
            // 3. Is an even number
            if (number > ans && length == digit && (number % 2 == 0)) {
                // Update the result
                ans = number;
            }
        }

        // Print the final result
        System.out.print(ans);
    }
}
