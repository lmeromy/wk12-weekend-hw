import Instruments.Trombone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TromboneTest {

    Trombone bone;

    @Before
    public void setUp() throws Exception {
        bone = new Trombone("Brass", "Getzen", 2000, 2800, true);
    }

    @Test
    public void canGetType() {
        assertEquals("Brass", bone.getType());
    }

    @Test
    public void canGetBrand(){
        assertEquals("Getzen", bone.getBrand());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(2000, bone.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(2800, bone.getSellPrice(), 0.01);
    }

    @Test
    public void canSetSellPrice(){
        bone.setSellPrice(3000);
        assertEquals(3000, bone.getSellPrice(), 0.01);
    }

    @Test
    public void canSetFAttachment(){
        bone.setF_attachment(true);
        assertEquals(true, bone.getF_attachment());
    }

    @Test
    public void canCalcMarkup() {
        assertEquals(800, bone.calcMarkup(), 0.01);
    }
}
