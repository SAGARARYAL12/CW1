import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class Dec2HexTest {

    // This variable could represent any setup resources required by tests
    private Dec2Hex dec2Hex;

    @Before
    public void setUp() {
        // Initialize any resources needed for the tests
        dec2Hex = new Dec2Hex();
        System.out.println("Starting a test case...");
    }

    @After
    public void tearDown() {
        // Clean up resources after each test if needed
        dec2Hex = null;
        System.out.println("Finished a test case.");
    }

    @Test
    public void testValidIntegerInput() {
        assertEquals("7B", Dec2Hex.convertToHex("123"));
        assertEquals("0", Dec2Hex.convertToHex("0")); // Edge case for zero
    }

    @Test
    public void testNoInput() {
        assertEquals("Error: No input argument provided. Please enter an integer.", Dec2Hex.convertToHex(""));
    }

    @Test
    public void testNonIntegerInput() {
        assertEquals("Error: Input is not a valid integer. Please enter a valid integer.", Dec2Hex.convertToHex("ABC"));
    }
}
