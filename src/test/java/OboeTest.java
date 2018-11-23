import Instruments.Oboe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OboeTest {

    Oboe oboe;

    @Before
    public void setUp() throws Exception {
        oboe = new Oboe("Woodwind", "Yamaha", 1800, 2500);
    }

    @Test
    public void canGetType() {
        assertEquals("Woodwind", oboe.getType());
    }

    @Test
    public void canGetBrand() {
        assertEquals("Yamaha", oboe.getBrand());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(1800, oboe.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(2500, oboe.getSellPrice(), 0.01);
    }

    @Test
    public void canSetSellPrice() {
        oboe.setSellPrice(3000);
        assertEquals(3000, oboe.getSellPrice(), 0.01);
    }
}
