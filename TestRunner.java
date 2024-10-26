import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
//Test Runner Class
public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Dec2HexTest.class);
        //Display if the test failed or passed
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
