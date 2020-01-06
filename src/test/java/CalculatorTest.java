import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

//import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(10.5, calculator.add(5.5, 5), 0.01);
    }

    @Test
    public void canSubtract() {
        assertEquals(10.4, calculator.subtract(15.5, 5.1));
    }
}
