package Instruments;

public class Guitar extends Instrument{

    private int numStrings;

    public Guitar(String type, String brand, double buyPrice, double sellPrice, int numStrings) {
        super(type, brand, buyPrice, sellPrice);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public String play() {
        return "Wes Montgomery works his magic...";
    }
}
