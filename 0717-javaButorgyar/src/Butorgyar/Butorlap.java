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
        return (double)(length * width) / 10000 * (isTartolap? tartolapPrice : hatlapPrice);
     }



}
