package Instruments;

public class Trombone extends Instrument{

    private boolean F_attachment;

    public Trombone(String type, String brand, double buy_price, double sell_price, boolean F_attachment) {
        super(type, brand, buy_price, sell_price);
        this.F_attachment = false;
    }

    public boolean getF_attachment() {
        return F_attachment;
    }

    public void setF_attachment(boolean f_attachment) {
        F_attachment = f_attachment;
    }

    public String play() {
        return "Black Trombone....monotone....";
    }
}
