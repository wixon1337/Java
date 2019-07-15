package Main;

public class Main {
    public static void main(String... args) {
        /*for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }*/
        /*printArray(args);
        printThreeDotArray(args);
        printThreeDotArray("1", "2", "3");*/

        parancssor(args);
        feladat2(args);
        feladat3(args);
        for (int i = 0; i < 10; i++) {
            System.out.print(fiboStep(i) + " ");
        }
        System.out.println();

        Animal cica = new Animal("Cirmi", 10, true); // Példányosítás
        System.out.println(cica.name);
        System.out.println(cica.age);
        System.out.println(cica.isMammal + "\n");

        Animal luna = new Animal("Luna", 1, true);
        System.out.println("Legjobb kutya a világon: " + luna.name);
        luna.sayHello();
        System.out.println(luna);
    }

    public static void printArray(String[] arr) {
        for (String element : arr) {
            System.out.println(element);
        }
    }

    public static void printThreeDotArray(String... arr) {
        for (String element : arr) {
            System.out.print(element + " ");
        }
    }

    public static void parancssor(String[] arr) {
        for (String ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.print("\n");
    }

    public static void feladat2(String[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Double.parseDouble(arr[i]);
        }
        System.out.println("Összeg: " + sum);
        System.out.println("Átlag: " + (sum / arr.length));
    }

    public static void feladat3(String... arr) {
        double diff = Double.parseDouble(arr[1]) - Double.parseDouble(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (diff != Double.parseDouble(arr[i]) - Double.parseDouble(arr[i - 1])) {
                break;
            } else if (i == arr.length - 1) {
                System.out.println("Számtani.");
            }
        }

        double kvocient = Double.parseDouble(arr[1]) / Double.parseDouble(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (kvocient != Double.parseDouble(arr[i]) / Double.parseDouble(arr[i - 1])) {
                break;
            } else if (i == arr.length - 1) {
                System.out.println("Mértani.");
            }

        }

        for (int i = 2; i < arr.length; i++) {
            if (Double.parseDouble(arr[i]) != Double.parseDouble(arr[i - 1]) + Double.parseDouble(arr[i - 2])) {
                break;
            } else if (i == arr.length - 1) {
                System.out.println("Fibonacci sorozat.");
            }
        }
    }

    public static int fiboStep(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        if (n > 1) {
            return fiboStep(n - 1) + fiboStep(n - 2);
        }

        return 0;
    }
}
