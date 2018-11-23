import Instruments.Cello;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CelloTest {

    Cello cello;

    @Before
    public void setUp() throws Exception {
        cello = new Cello("String", "Merano", 3000, 4500);
    }

    @Test
    public void canGetType() {
        assertEquals("String", cello.getType());
    }

    @Test
    public void canGetBrand() {
        assertEquals("Merano", cello.getBrand());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(3000, cello.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(4500, cello.getSellPrice(), 0.01);
    }

    @Test
    public void canSetSellPrice() {
        cello.setSellPrice(5000);
        assertEquals(5000, cello.getSellPrice(), 0.01);
    }

    @Test
    public void canCalcMarkup() {
        assertEquals(1500, cello.calcMarkup(), 0.01);
    }
}
