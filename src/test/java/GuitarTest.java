import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar("String", "Fender", 6000, 8500, 6);
    }

    @Test
    public void canGetType() {
        assertEquals("String", guitar.getType());
    }

    @Test
    public void canGetBrand() {
        assertEquals("Fender", guitar.getBrand());
    }

    @Test
    public void canGetNumStrings() {
        assertEquals(6, guitar.getNumStrings());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(6000, guitar.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(8500, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void canSetSellPrice() {
        guitar.setSellPrice(9000);
        assertEquals(9000, guitar.getSellPrice(), 0.01);
    }
}
