import Accessories.Reed;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReedTest {

    Reed reed;

    @Before
    public void setUp() throws Exception {
        reed = new Reed("Oboe reed", 5, 8);
    }

    @Test
    public void canGetDescription() {
        assertEquals("Oboe reed", reed.getItem());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(5, reed.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(8, reed.getSellPrice(), 0.01);
    }

    @Test
    public void canSetSellPrice(){
        reed.setSellPrice(6);
        assertEquals(6, reed.getSellPrice(), 0.01);
    }

    @Test
    public void canCalcMarkup() {
        assertEquals(3, reed.calcMarkup(), 0.01);
    }
}
