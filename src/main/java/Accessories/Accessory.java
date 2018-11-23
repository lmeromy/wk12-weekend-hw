package Accessories;

import behaviors.ISell;

public abstract class Accessory implements ISell {

    private String item;
    private double buyPrice;
    private double sellPrice;

    public Accessory(String item, double buyPrice, double sellPrice) {
        this.item = item;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getItem() {
        return item;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double calcMarkup(){
        double profit = (this.sellPrice - this.buyPrice);
//        double margin = (profit/this.buyPrice) * 100;
//        return margin;
        return profit;
    }
}
