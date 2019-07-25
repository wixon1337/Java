public class Regeny extends Konyv implements Rendelheto {
    private String osszefoglalo;

    public Regeny(String szerzo, String cim, String osszefoglalo) {
        super.szerzo = szerzo;
        super.cim = cim;
        this.osszefoglalo = osszefoglalo;
    }

    @Override
    public boolean dedikalASzerzo() {
        return true;
    }

    @Override
    public String toString() {
        return szerzo + ": " + cim;
    }

    @Override
    public void rendel(int darab) {
        System.out.println("Rendelni kell " + darab + " regényt az alabbibol: " + this.toString());
    }
}
