package Butorgyar;

public class Butor {
    private int lap;
    private Butorlap[] butorlapok;

    public Butor() {
        lap = 0;
        butorlapok = new Butorlap[100];
    }

    public Butorlap[] getButorlapok() {
        return this.butorlapok;
    }

    public void lapHozzaad (Butorlap butorlap) {
            if (lap < 100)  butorlapok[lap++] = butorlap;
    }

    public double arSzamol () {
        double sum = 0;
        for (int i = 0; i < this.lap; i++) {
            sum += this.butorlapok[i].arSzamol();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Butor - lapok: " + this.lap + ", ár: " + this.arSzamol() + " FT";
    }

}
