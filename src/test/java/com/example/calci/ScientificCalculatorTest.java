import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ScientificCalculatorTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setIn(originalIn);
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void testSquareRoot() {
        String input = "25\n5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        calculator.squareRoot();
        assertEquals("Square root of 25.0 is 5.0\n", outContent.toString());
    }

    @Test
    public void testFactorial() {
        String input = "5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        calculator.factorial();
        assertEquals("Factorial of 5 is 120\n", outContent.toString());
    }

    @Test
    public void testNaturalLog() {
        String input = "10\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        calculator.naturalLog();
        assertEquals("Natural logarithm of 10.0 is 2.302585092994046\n", outContent.toString());
    }

    @Test
    public void testPowerFunction() {
        String input = "2\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        calculator.powerFunction();
        assertEquals("Enter the base: Enter the exponent: 2.0 raised to the power of 3.0 is 8.0\n", outContent.toString());
    }
}
