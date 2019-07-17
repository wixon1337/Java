package Butorgyar;

public class Butor {
    private int lap;
    private Butorlap[] butorlapok;

    public Butor() {
        this.lap = 0;
        this.butorlapok = new Butorlap[100];
    }

    public Butorlap[] getButorlapok() {
        return this.butorlapok;
    }

    public void lapHozzaad (Butorlap butorlap) {
        for (int i = 0; i < 100; i++) {
            if (this.butorlapok[i] == null) {
                this.butorlapok[i] = butorlap;
                this.lap++;
                break;
            }
        }
    }

    public double arSzamol () {
        double sum = 0;
        for (int i = 0; i < this.lap; i++) {
            sum += this.butorlapok[i].arSzamol();
        }
        return sum;
    }

    public String toString() {
        return "Butor - lapok: " + this.lap + ", ár: " + this.arSzamol() + " FT";
    }

}
