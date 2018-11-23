import Accessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic brahms;

    @Before
    public void setUp() throws Exception {
        brahms = new SheetMusic("Brahms Requiem Score", 20, 50);
    }

    @Test
    public void canGetDescription() {
        assertEquals("Brahms Requiem Score", brahms.getItem());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(20, brahms.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(50, brahms.getSellPrice(), 0.01);
    }

    @Test
    public void canSetSellPrice(){
        brahms.setSellPrice(55);
        assertEquals(55, brahms.getSellPrice(), 0.01);
    }

    @Test
    public void canCalcMarkup() {
        assertEquals(30, brahms.calcMarkup(), 0.01);
    }
}
