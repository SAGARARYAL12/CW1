import java.util.Scanner;

public class Dec2Hex {

    // Static method to convert a string input to hexadecimal
    public static String convertToHex(String input) {
        if (input == null || input.isEmpty()) {
            return "Error: No input argument provided. Please enter an integer.";
        }

        try {
            int num = Integer.parseInt(input);
            char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            StringBuilder hexadecimal = new StringBuilder();

            // Conversion logic
            while (num != 0) {
                int rem = num % 16;
                hexadecimal.insert(0, ch[rem]);
                num = num / 16;
            }

            // Return statement indicating the hex representation
            return "The Hex representation is: " + (hexadecimal.length() > 0 ? hexadecimal.toString() : "0");
        } catch (NumberFormatException e) {
            return "Error: Input is not a valid integer. Please enter a valid integer.";
        }
    }

    public static void main(String[] args) {
        String input = (args.length > 0) ? args[0] : "";
        System.out.println(convertToHex(input));
    }
}

