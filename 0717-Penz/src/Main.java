import penz.*;

public class Main {

    public static void main(String[] args) {
        Penz p = new Penz(100,false);
        Penz p2 = new Penz(1000, true);
        Penz p3 = new Penz(1000, true);
        Penz p4 = new Penz(100, false);

        Penztarca pt = new Penztarca();
        pt.penzBetesz(p);
        pt.penzBetesz(p2);
        pt.penzBetesz(p3);
        pt.penzBetesz(p4);

        for (int i = 0; i < pt.getPenzek().length; i++) {
            if(pt.getPenzek()[i] != null) {
                System.out.println(pt.getPenzek()[i].toString());
            }
        }

        System.out.println("1000-esek összege: " + pt.penzSzamol(1000));
        System.out.println("Aprók száma: " + pt.penzSzamol(false));


    }
}
