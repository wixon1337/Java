package penz;

public class Penz {
    private int nevertek;
    private boolean isPapirPenz;

    public Penz(int nevertek, boolean isPapirPenz) {
        this.nevertek = nevertek;
        this.isPapirPenz = isPapirPenz;
    }

    public int getNevertek() {
        return this.nevertek;
    }

    public boolean isPapirPenz() {
        return this.isPapirPenz;
    }

    @Override
    public String toString() {
        return nevertek + " Ft - " + (isPapirPenz?"papirpénz":"apró");
    }
}
