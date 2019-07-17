package Butorgyar;

public class Butorlap {
    private int length;
    private int width;
    private boolean isTartolap;
    private final int tartolapPrice = 5000;
    private final int hatlapPrice = 500;

    public Butorlap(int length, int width, boolean isTartolap) {
        this.length = length;
        this.width = width;
        this.isTartolap = isTartolap;
    }

    public double arSzamol() {
        if(this.isTartolap) {
            return (double)(this.length * this.width) / 10000 * this.tartolapPrice;
        } else {
            return (double)(this.length * this.width) / 10000 * this.hatlapPrice ;
        }
     }



}
