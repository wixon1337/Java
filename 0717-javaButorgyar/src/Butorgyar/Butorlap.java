package Butorgyar;

public class Butorlap {
    private int length;
    private int width;
    private boolean isTartolap;
    final int tartolapPrice = 5000;
    final int hatlapPrice = 500;

    public Butorlap(int length, int width, boolean isTartolap) {
        this.length = length;
        this.width = width;
        this.isTartolap = isTartolap;
    }

    public int arSzamol() {
        if(this.isTartolap) {
            return (this.length * this.width) / 10000 * this.tartolapPrice;
        } else {
            return (this.length * this.width) / 10000 * this.hatlapPrice ;
        }
     }



}
