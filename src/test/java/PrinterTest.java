import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(500, 0, 50);
    }

    @Test
    public void hasPaper() {
        assertEquals(500, printer.getStock());
    }

    @Test
    public void hasToner() {
        assertEquals(50, printer.getToner());
    }

    @Test
    public void readyToPrint() {
        printer.readyToPrint(50);
        assertEquals(450, printer.getStock());
    }

    @Test
    public void Toner() {
        printer.reduceToner(47);
        assertEquals(3, printer.getToner());
    }



}
