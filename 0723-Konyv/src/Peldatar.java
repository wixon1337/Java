public class Peldatar extends Konyv {
    private int feladatSzam;

    public Peldatar(String szerzo, String cim, int feladatSzam) {
        super.szerzo = szerzo;
        super.cim = cim;
        this.feladatSzam = feladatSzam;
    }


    @Override
    public boolean dedikalASzerzo() {
        return false;
    }

    @Override
    public String toString() {
        return szerzo + ": " + cim;
    }
}
