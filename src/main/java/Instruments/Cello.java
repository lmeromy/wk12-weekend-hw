package Instruments;

public class Cello extends Instrument {
    public Cello(String type, String brand, double buyPrice, double sellPrice) {
        super(type, brand, buyPrice, sellPrice);
    }

    public String play() {
        return "Yo Yo Ma works his magic....";
    }
}
