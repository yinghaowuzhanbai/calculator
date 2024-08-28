import org.example.Calculator;
import org.example.Operation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void testAddition() {
        Calculator calculator = new Calculator(0);
        assertEquals(5.0, calculator.apply(Operation.ADD, 5).getResult().doubleValue(), 0.0001);
    }

    @Test
    public void testChaining() {
        Calculator calculator = new Calculator(5);
        assertEquals(16.0, calculator.apply(Operation.ADD, 3)
                .apply(Operation.MULTIPLY, 2)
                .getResult().doubleValue(), 0.0001);
    }

    @Test
    public void testDivisionByZero() {
        Calculator calculator = new Calculator(10);
        assertThrows(ArithmeticException.class, () -> calculator.apply(Operation.DIVIDE, 0));
    }
}
