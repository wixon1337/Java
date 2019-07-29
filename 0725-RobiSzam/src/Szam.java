public class Szam implements Parosos{
    protected String szam;

    public Szam(String szam) {
        this.szam = szam;
    }
    public boolean isParos() {
        return Double.parseDouble(this.szam) % 2 == 0;
    }

    public boolean isParatlan() {
        return Double.parseDouble(this.szam) % 2 != 0;
    }

    public boolean isPozitiv() {
        return Double.parseDouble(this.szam) > 0;
    }

    public boolean isNegativ() {
        return Double.parseDouble(this.szam) < 0;
    }

    @Override
    public String toString() {
        return szam;
    }
}
