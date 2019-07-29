public class Main {
    public static void main(String[] args) {
        String a = "fksfjafa"; // String literál
        String b = new String("dkasdas"); // példányosítás
        char[] ch = {'a', 'b', 'c'};
        String c = new String(ch); // karakter tömbből String
        char[] back = c.toCharArray(); // Stringből -> char[]
        c += "kiscica"; // String bővítése - ilyenkor új String jön létre
        System.out.println(c + " " + countLetter('i', c));
        String input = "Feri;29;Szeged";
        String[] arr = input.split(";"); // String darabolása reguláris kifejezés mentén
        int age = Integer.parseInt(arr[1]);
        compareStrings();
        System.out.println(compareToHomeMade("alma", "almaasdasdasdasd"));
        StringBuilder sb = new StringBuilder("asda");
        sb.append("ads");
        sb.toString();
        appendTest();

    }

    public static int countLetter(char letter, String s) {
        int out = 0;
        for (int i = 0; i < s.length(); i++) { // String hossza .length()
            if (s.charAt(i) == letter) out++; // Adott indexen lévő karakter .charAt(index)
        }
        return out;
    }

    public static void compareStrings() {
        String a = "alma";
        String b = new String("blma");
        if (a == b) { //ilyet ne (mert memória cimet ellenőrzi, hogy egyezik e)
            System.out.println("Equal==");
        }

        if (a.equals(b)) {
            System.out.println("Equal");
        }

        if (a.compareTo(b) == 0)
            System.out.println("EqualCompared"); // 0 - megegyezik, -1 - kisebb(az első mint a második), 1 - nagyobb
        System.out.println(a.compareTo(b));
    }

    // Készítsünk egy compareTo függvényt, mely 2 Stringet vár paraméterül,
    // és karakterenként összehasonlítja őket. Ha az adott karakter nagyobb,
    // mint a másik String ugyanazon indexű karaktere, térjen vissza 1 értékkel.
    // Ha a másik String adott karaktere nagyobb, -1 értékkel, ha nem volt sehol
    // eltérés, akkor 0-val!
    public static int compareToHomeMade(String a, String b) {
        int length;
        if (a.length() > b.length()) {
            length = b.length();
        } else {
            length = a.length();
        }
        for (int i = 0; i < length; i++) {
            if (a.charAt(i) > b.charAt(i)) {
                return 1;
            } else if (a.charAt(i) < b.charAt(i)) {
                return -1;
            } else if (a.length() > b.length() && a.substring(0, b.length()).equals(b)) {
                return a.substring(b.length()).length();
            } else if (b.length() > a.length() && b.substring(0, a.length()).equals(a)) {
                return b.substring(a.length()).length() * -1;
            }
        }
        return 0;
    }

    public static int compareToPinterMade(String a, String b) {
        for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
            if (a.charAt(i) > b.charAt(i)) return 1;
            else if (a.charAt(i) < b.charAt(i)) return -1;
        }
        return a.length() - b.length();
    }

    public static void appendTest() {
        long before = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 100000; i++) {
            s += 'a';
        }
        long after = System.currentTimeMillis();
        System.out.println("+= diff: " + (after - before));

        before = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append('a');
        }
        after = System.currentTimeMillis();
        System.out.println("Builder diff: " + (after - before));

    }
}
