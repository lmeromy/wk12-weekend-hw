package Instruments;

public class Oboe extends Instrument {

    public Oboe(String type, String brand, double buyPrice, double sellPrice) {
        super(type, brand, buyPrice, sellPrice);
    }

    public String play() {
        return "Disney forest scene unfolds via a bucolic-sounding oboe trio...";
    }
}
