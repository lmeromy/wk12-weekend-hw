import behaviors.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }
    
    public void addItem(ISell iSell){
        this.stock.add(iSell);
    }
    
    public void removeItem(ISell iSell){
        this.stock.remove(iSell);
    }

    public double getPotentialProfit() {
        double calcProfit = 0;
        for(ISell iSell: this.stock){
            calcProfit += iSell.calcMarkup();
        }
        return calcProfit;
    }
}
