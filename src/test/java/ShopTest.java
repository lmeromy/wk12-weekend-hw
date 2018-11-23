import Instruments.Instrument;
import Instruments.Oboe;
import behaviors.ISell;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShopTest {

    Shop shop;
    ArrayList<ISell> stock;
    Instrument oboe;
    Instrument oboe2;

    @Before
    public void setUp() throws Exception {
        stock = new ArrayList<ISell>();
        shop = new Shop(stock);
        oboe = new Oboe("Woodwind","Yamaha", 1000, 3000);
        oboe2 = new Oboe("Woodwind","Cassandra", 2000, 4000);

    }

//    add items to stock.
//    remove items from stock.
//    Using the calculateMarkup method for each item in stock, create a
//    method which gives the total potential profit for the shop.

    @Test
    public void canGetStock(){
        assertTrue(stock instanceof ArrayList);
    }


    @Test
    public void canAddItemToStock() {
        shop.addItem(oboe);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canRemoveItemFromStock(){
        shop.addItem(oboe);
        shop.addItem(oboe2);
        shop.removeItem(oboe);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canGetPotentialProfit(){
        shop.addItem(oboe);
        shop.addItem(oboe2);
        assertEquals(4000, shop.getPotentialProfit(), 0.01);
    }
}
