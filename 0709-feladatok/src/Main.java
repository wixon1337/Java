public class Main {
    public static void main(String[] args) {
        System.out.println("szia!");
        int Aliz = 18;
        korSzamolas(Aliz);
        int alma = 30;
        bevasarloLista(alma);
        int celsius = 5;
        homerseklet(celsius);
        randomNagyobb();
        oszthatoE();
        paratlanE();
        csokkeno();
        minOf5();
        szamjegyOsszeg();
        szamKiir();
        parosKiir();
        paratlanKiir();
        haromTobbszoros();
        csokkenoSzamKiir();
        otosSorozat();
        feladat13();
        feladat14();
        feladat15();
        feladat16();
    }

    public static void korSzamolas(int Aliz) {
        int Bobo = Aliz + 2;
        int Csilla = Aliz - 5;
        int sumKor = Aliz + Bobo + Csilla;
        System.out.println("Aliz " + Aliz + " éves.\nBoborján " + Bobo + " éves.\nCsilla pedig " + Csilla + " éves\nÖsszesen: " + sumKor + " évesek.\n");

    }

    public static void bevasarloLista(int alma) {
        int banan = 2 * alma;
        int citrom = 3 * alma;
        double osszes = (alma + banan + citrom) / 100.0;
        System.out.println(alma + "dkg almát.\n" + banan + "dkg banánt.\n" + citrom + "dkg citromot.\nÖsszesen: " + osszes + "kg.\n");
    }

    public static void homerseklet(int celsius) {
        int kelvin = celsius + 273;
        double fahrenheit = celsius * 18 / 10 + 32;
        System.out.println("Celsius: " + celsius + "\nKelvin: " + kelvin + "\nFahrenheit: " + fahrenheit + "\n");
    }

    public static void randomNagyobb() {
        double duplax = Math.floor(Math.random() * 9 + 1);
        double duplay = Math.floor(Math.random() * 9 + 1);
        int x = (int) duplax;
        int y = (int) duplay;
        if (x > y) {
            System.out.println(x + " a nagyobb.");
        } else if (y > x) {
            System.out.println(y + " a nagyobb.");
        } else {
            System.out.println("Egyenlő.");
        }
        System.out.println("x: " + x + ", y: " + y + "\n");
    }

    public static void oszthatoE() {
        double duplax = Math.floor(Math.random() * 99 + 1);
        double duplay = Math.floor(Math.random() * 99 + 1);
        int x = (int) duplax;
        int y = (int) duplay;
        if (x % y == 0) {
            System.out.println("Osztható.");
        } else {
            System.out.println("Nem osztható.");
        }
        System.out.println("x: " + x + ", y: " + y + "\n");
    }

    public static void paratlanE() {
        double duplax = Math.floor(Math.random() * 200 - 100);
        int x = (int) duplax;
        if (x % 2 != 0) {
            System.out.println(x + " az paratlan.\n");
        } else {
            System.out.println(x + " az paros.\n");
        }
    }

    public static void csokkeno() {
        double duplax = Math.floor(Math.random() * 100) - 50;
        double duplay = Math.floor(Math.random() * 100) - 50;
        double duplaz = Math.floor(Math.random() * 100) - 50;
        int x = (int) duplax;
        int y = (int) duplay;
        int z = (int) duplaz;
        System.out.println("x: " + x + ", y: " + y + ", z: " + z);
        if (x > y && x > z) {
            if (y > z) {
                System.out.println(x + " > " + y + " > " + z);
            } else {
                System.out.println(x + " > " + z + " > " + y);
            }
        } else if (y > x && y > z) {
            if (x > z) {
                System.out.println(y + " > " + x + " > " + z);
            } else {
                System.out.println(y + " > " + z + " > " + x);
            }
        } else if (z > x && z > y) {
            if (x > y) {
                System.out.println(z + " > " + x + " > " + y);
            } else {
                System.out.println(z + " > " + y + " > " + x);
            }
        }
        System.out.print("\n");
    }

    public static void minOf5() {
        double duplaa = Math.floor(Math.random() * 430) - 110;
        double duplab = Math.floor(Math.random() * 430) - 110;
        double duplac = Math.floor(Math.random() * 430) - 110;
        double duplad = Math.floor(Math.random() * 430) - 110;
        double duplae = Math.floor(Math.random() * 430) - 110;
        int a = (int) duplaa;
        int b = (int) duplab;
        int c = (int) duplac;
        int d = (int) duplad;
        int e = (int) duplae;
        int[] tomb = new int[5];
        tomb[0] = a;
        tomb[1] = b;
        tomb[2] = c;
        tomb[3] = d;
        tomb[4] = e;
        int min = tomb[0];
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(tomb[i] + " ");
            if (tomb[i] < min) {
                min = tomb[i];
            }
        }
        System.out.println("Minimum: " + min + ".\n");
    }

    public static void szamjegyOsszeg() {
        double duplax = Math.floor(Math.random() * 201);
        int x = (int) duplax;
        System.out.println("Az x: " + x);
        if (x == 200) {
            System.out.println("2 + 0 + 0 = 2");
        }
        if (x > 9 && x < 100) {
            duplax = Math.floor(duplax / 10);
            System.out.print((int) duplax);
            while (x > 9) {
                x -= 10;
            }
            System.out.println(" + " + x + " = " + (int) (duplax + x));
            int parosSzamjegy = 0;
            if (x % 2 == 0 && duplax % 2 == 0) {
                parosSzamjegy = 2;
            } else if (x % 2 == 0 && duplax % 2 != 0) {
                parosSzamjegy = 1;
            } else if (x % 2 != 0 && duplax % 2 == 0) {
                parosSzamjegy = 1;
            } else {
                parosSzamjegy = 0;
            }
            System.out.println("Paros számjegyek száma: " + parosSzamjegy);
        } else if (x >= 100) {
            duplax = Math.floor(duplax / 10);
            double elso = 0;
            double masodik = 0;
            while (x > 9) {
                x -= 10;
            }
            elso = 1;
            masodik = duplax - 10;
            System.out.println((int) elso + " + " + (int) masodik + " + " + x + " = " + (int) (elso + masodik + x));
        } else {
            System.out.println(x);
        }
    }

    public static void szamKiir() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void parosKiir() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void paratlanKiir() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void haromTobbszoros() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void csokkenoSzamKiir() {
        for (int i = 100; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    public static void otosSorozat() {
        double a = Math.floor(Math.random()*11) + 1;
        for (int i = 1; i <= a; i++) {
            System.out.print((5*i) + " ");
        }
        System.out.println("\n");
    }

    public static void feladat13() {
        double x = Math.floor(Math.random() * 3) + 1;
        double y = Math.floor(Math.random() * 6) + 5;
        System.out.println("x: " + x + ", y: " + y);
        for (int i = (int)x; i <= y; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    public static void feladat14() {
        double x = Math.floor(Math.random() * 3) + 1;
        double y = Math.floor(Math.random() * 6) + 5;
        System.out.println("x: " + x + ", y: " + y);
        for (int i = (int)x + 1; i < y; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    public static void feladat15() {
        double a = Math.floor(Math.random() * 6) + 5;
        double b = Math.floor(Math.random() * 4) + 1;
        double c = Math.floor(Math.random() * 3) + 10;
        for (int i = 0; i < a; i++) {
            System.out.print((int)(Math.floor(Math.random() * c) + b) + " ");
        }
        System.out.println("\n");
    }

    public static void feladat16() {
        double alapar = (Math.floor(Math.random() * 10) + 10) * 100;
        System.out.println("Alapár: " + alapar);
        int nezo = 5;
        double x = 0;
        for (int i = 0; i < nezo; i++) {
            x = Math.floor(Math.random()*99) + 1;
            if (x <= 5) {
                System.out.println("Kor: " + x + " Fizet: 0");
            } else if ((x > 5 && x < 18) || x > 65) {
                System.out.println("Kor: " + x + " Fizet: " + alapar/2);
            } else {
                System.out.println("Kor: " + x + " Fizet: " + alapar);
            }
        }
    }
}
