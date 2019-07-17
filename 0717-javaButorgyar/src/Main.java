import Butorgyar.Butorlap;
import Butorgyar.Butor;

public class Main {

    public static void main(String[] args) {
        Butorlap b = new Butorlap(20, 20, true);
        System.out.println(b.arSzamol());
        Butorlap c = new Butorlap(20, 20, false);
        System.out.println(c.arSzamol());

        Butor butorka = new Butor();
        butorka.lapHozzaad(b);
        butorka.lapHozzaad(c);
        System.out.println(butorka.arSzamol());
        System.out.println(butorka.toString());
    }
}
