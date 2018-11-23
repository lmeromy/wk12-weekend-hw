package Instruments;

import behaviors.IPlay;
import behaviors.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String type;
    private String brand;
    private double buyPrice;
    private double sellPrice;

    public Instrument(String type, String brand, double buyPrice, double sellPrice) {
        this.type = type;
        this.brand = brand;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getType() {
        return type;
    }


    public String getBrand() {
        return brand;
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
