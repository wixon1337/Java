package penz;

public class Penztarca {
    private int penzSzama;
    private Penz[] penzek;

    public Penztarca() {
        penzSzama = 0;
        penzek = new Penz[100];
    }

    public Penz[] getPenzek() {
        return this.penzek;
    }

    public void penzBetesz (Penz penz) {
        if (penzSzama < 100) penzek[penzSzama++] = penz;
    }

    public double penzSzamol(int penznevertek) {
        double sum = 0;
        for (int i = 0; i < penzSzama; i++) {
            if (penzek[i].getNevertek() == penznevertek) {
                sum += penzek[i].getNevertek();
            }
        }
        return sum;
    }

    public int penzSzamol(boolean isPapirpenz) {
        int count = 0;
        for (int i = 0; i < penzSzama; i++) {
            if (penzek[i].isPapirPenz() == isPapirpenz) {
                count++;
            }
        }
        return count;
    }
}
