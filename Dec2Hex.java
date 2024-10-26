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

// Dec2HexTest for unit testing within the same file
class Dec2HexTest {

    public static void runTests() {
        testNullInput();
        testEmptyInput();
        testNonIntegerInput();
        testValidIntegerInput();
        testZeroInput();
    }

    private static void testNullInput() {
        assert "Error: No input argument provided. Please enter an integer.".equals(Dec2Hex.convertToHex(null))
                : "Failed: Null Input Test";
    }

    private static void testEmptyInput() {
        assert "Error: No input argument provided. Please enter an integer.".equals(Dec2Hex.convertToHex(""))
                : "Failed: Empty Input Test";
    }

    private static void testNonIntegerInput() {
        assert "Error: Input is not a valid integer. Please enter a valid integer.".equals(Dec2Hex.convertToHex("abc"))
                : "Failed: Non-Integer Input Test";
    }

    private static void testValidIntegerInput() {
        assert "The Hex representation is: A".equals(Dec2Hex.convertToHex("10"))
                : "Failed: Valid Integer Input Test";
    }

    private static void testZeroInput() {
        assert "The Hex representation is: 0".equals(Dec2Hex.convertToHex("0"))
                : "Failed: Zero Input Test";
    }
}

// Testrunner class to execute tests
class Testrunner {
    public static void main(String[] args) {
        System.out.println("Running tests...");
        Dec2HexTest.runTests();
        System.out.println("All tests completed.");
    }
}
