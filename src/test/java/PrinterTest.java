import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before (){
        printer = new Printer(1000, 100);
    }

    @Test
    public void hasSheets() {
        assertEquals(1000, printer.getSheets());
    }

    @Test
    public void canPrint() {
        printer.print(2, 10);
        assertEquals(980, printer.getSheets());
    }

    @Test
    public void wontPrintIfNotEnoughPaper() {
        printer.print(2, 1000);
        assertEquals(1000, printer.getSheets());
    }

    @Test
    public void hasToner() {
        assertEquals(100, printer.getToner());
    }



}
