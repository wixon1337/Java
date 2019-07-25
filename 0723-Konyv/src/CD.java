public class CD implements Rendelheto {
    private String eloado;
    private String albumCim;

    public CD(String eloado, String albumCim) {
        this.eloado = eloado;
        this.albumCim = albumCim;
    }

    @Override
    public String toString() {
        return eloado + ": " + albumCim;
    }

    @Override
    public void rendel(int darab) {
        System.out.println("Rendelni kell " + darab + " CDt az alabbibol: " + this.toString());
    }
}
