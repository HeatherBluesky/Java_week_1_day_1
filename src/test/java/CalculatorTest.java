import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();

    }
//    @Test
//    public void hasResult() {
//        assertEquals(, calculator.getResult());
//    }

    @Test
    public void add2Numbers() {
//
        assertEquals(7,calculator.addNumbers(3, 4));
    }

    @Test
    public void subtract2Numbers() {

        assertEquals(3, calculator.minusNumbers(7,4));
    }
    @Test
    public void multiply2Numbers() {
        ;
        assertEquals(14, calculator.multiply(7, 2));
    }
    @Test
    public void Divide2Numbers() {
        ;
        assertEquals(2.5, calculator.Divide(5, 2) ,.5);
    }


}


