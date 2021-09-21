// Benjamin A. Worthington
// September 18th, 2021
// Test Runner for JUnit Tests
// TestRunner.java

// Import Statements
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

    public static void main(String[] args) {

        Result modelTestResult = JUnitCore.runClasses(ModelTest.class);

        for (Failure failure : modelTestResult.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println("ModelTestResult = " + modelTestResult.wasSuccessful());

    }

}
