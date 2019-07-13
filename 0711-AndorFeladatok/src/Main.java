public class Main {

    public static void main(String[] args) {
/*        feladat1(args);
        feladat2(args);
        feladat3(args);
        feladat4(args);
        feladat5(args);
        feladat6(args);
        feladat7(args);
        feladat8(args);
        feladat9(args);
        feladat10("2", "5");
        feladat11("1", "22", "8");
        feladat12("1", "2", "10");
        feladat13("12");
        feladat14("szia", "tefasz", "jómár?");
        feladat15("3", "4", "5");
        feladat16("10");
        feladat17("3","2","1");
        feladat18("1","2","2","2","3","4");
        feladat19("6", "2");
        feladat20("kecske", "malac", "veréb", "szia");*/
        feladat21("4","x","2");
        feladat22("3","1","+","2","x","2","-","1");

    }

    public static void feladat1(String[] arr) {
        if (arr.length < 2) {
            System.out.println("Több paramétert psl.");
        } else {
            int min = Integer.parseInt(arr[0]);
            for (int i = 0; i < arr.length; i++) {
                if (Integer.parseInt(arr[i]) < min) {
                    min = Integer.parseInt(arr[i]);
                }
            }
            System.out.println(min);
        }
    }

    public static void feladat2(String[] arr) {
        if (arr.length < 2) {
            System.out.println("Több paramétert psl.");
        } else {
            int max = Integer.parseInt(arr[0]);
            for (int i = 0; i < arr.length; i++) {
                if (Integer.parseInt(arr[i]) > max) {
                    max = Integer.parseInt(arr[i]);
                }
            }
            System.out.println(max);
        }
    }

    public static void feladat3(String[] arr) {
        if (arr.length < 2) {
            System.out.println("Több paramétert psl.");
        } else {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += Integer.parseInt(arr[i]);
            }
            System.out.println(sum);
        }
    }

    public static void feladat4(String[] arr) {
        if (arr.length < 2) {
            System.out.println("Több paramétert psl.");
        } else {
            double sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += Double.parseDouble(arr[i]);
            }
            System.out.println(sum/arr.length);
        }
    }

    public static void feladat5(String[] arr) {
        if (arr.length < 2) {
            System.out.println("Több paramétert psl.");
        } else {
            int min = 0;
            int max = 0;
            for (int i = 0; i < arr.length; i++) {
                if (Integer.parseInt(arr[i]) > 0) {
                    min = Integer.parseInt(arr[i]);
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (Integer.parseInt(arr[i]) < 0) {
                    max = Integer.parseInt(arr[i]);
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (Integer.parseInt(arr[i]) > 0 && min > Integer.parseInt(arr[i])) {
                    min = Integer.parseInt(arr[i]);
                } else if (Integer.parseInt(arr[i]) < 0 && max < Integer.parseInt(arr[i])){
                    max = Integer.parseInt(arr[i]);
                }
            }
            System.out.println("Pozitiv min: " + min + "\nNegativ max: " + max + "\n");
        }
    }

    public static void feladat6(String[] arr) {
        if (arr.length < 1) {
            System.out.println("Adj meg paramétert.");
        } else {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (Integer.parseInt(arr[i]) > 0) {
                    count++;
                }
            }
            System.out.println("Pozitiv számok száma: " + count);
        }
    }

    public static void feladat7(String[] arr) {
        if (arr.length < 1) {
            System.out.println("Adj meg paramétert.");
        } else {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (Integer.parseInt(arr[i]) < 0) {
                    count++;
                }
            }
            System.out.println("Negativ számok száma: " + count);
        }
    }

    public static void feladat8(String[] arr) {
        if (arr.length < 1) {
            System.out.println("Adj meg paramétert.");
        } else {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (Integer.parseInt(arr[i]) == 0) {
                    count++;
                }
            }
            System.out.println("Nullák száma: " + count);
        }
    }

    public static void feladat9(String[] arr) {
        if (arr.length < 2) {
            System.out.println("Adj meg legalább 2 paramétert.");
        } else {
            int sumParos = 0;
            int sumParatlan = 0;
            for (int i = 0; i < arr.length; i++) {
                if (Integer.parseInt(arr[i]) % 2 == 0) {
                    sumParos += Integer.parseInt(arr[i]);
                } else {
                    sumParatlan += Integer.parseInt(arr[i]);
                }
            }
            System.out.println("Páros számok összege: " + sumParos + "\nParatlan számok összege: " + sumParatlan);
        }
    }

    public static void feladat10(String... arr) {
        if (arr.length != 2) {
            System.out.println("Két paramétert adj meg!");
        } else if (Integer.parseInt(arr[0]) > Integer.parseInt(arr[1])) {
            System.out.println("Az első legyen kisebb mint a második!");
        } else {
            for (int i = Integer.parseInt(arr[0]); i <= Integer.parseInt(arr[1]); i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void feladat11(String... arr) {
        if (arr.length != 3) {
            System.out.println("3 paramétert várok! (kezdőelem, diff, meddig");
        } else {
            int[] array = new int[Integer.parseInt(arr[2])];
            array[0] = Integer.parseInt(arr[0]);
            for (int i = 1; i < array.length; i++) {
                array[i] = array[i-1] + Integer.parseInt(arr[1]);
            }
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }

    public static void feladat12(String... arr) {
        if (arr.length != 3) {
            System.out.println("3 paramétert várok! (kezdőelem, kvóciens, meddig");
        } else {
            int[] array = new int[Integer.parseInt(arr[2])];
            array[0] = Integer.parseInt(arr[0]);
            for (int i = 1; i < array.length; i++) {
                array[i] = array[i-1] * Integer.parseInt(arr[1]);
            }
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }

    public static void feladat13(String... arr) {
        if (arr.length != 1) {
            System.out.println("Egy paramétert adj meg bástya ty");
        } else {
            int[] array = new int[Integer.parseInt(arr[0])];
            array[0] = 0;
            array[1] = 1;
            for (int i = 2; i < array.length; i++) {
                array[i] = array[i-1] + array[i-2];
            }
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }

    public static void feladat14(String... arr) {
        if (arr.length == 0) {
            System.out.println("Adj meg szavakat");
        } else {
            int[] array = new int[255];
            for (int i = 0; i < array.length; i++) {
                array[i] = 0;
            }
            for (int i = 0; i < arr.length; i++) {
                array[arr[i].length()]++;
            }
            for (int i = 0; i < array.length; i++) {
                if (array[i] != 0) {
                    System.out.println(i + " hosszú szó " + array[i] + " db.");
                }
            }
        }
    }

    public static void feladat15(String... arr) {
        if (arr.length != 3) {
            System.out.println("3 paramétert adj meg bástya");
        } else if (Integer.parseInt(arr[0]) > Integer.parseInt(arr[1]) + Integer.parseInt(arr[2]) || Integer.parseInt(arr[1]) > Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) || Integer.parseInt(arr[2]) > Integer.parseInt(arr[0]) + Integer.parseInt(arr[1])){
            System.out.println("Nem háromszög tetya!");
        } else {
            int ker = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]) + Integer.parseInt(arr[2]);
            double ter = Math.sqrt(ker/2*(ker/2-Double.parseDouble(arr[0]))*(ker/2-Double.parseDouble(arr[1]))*(ker/2-Double.parseDouble(arr[2])));
            System.out.println("Kerület: " + ker + "\nTerület: " + ter);
        }
    }

    public static void feladat16(String... arr) {
        if (arr.length == 0) {
            System.out.println("Adj meg egy számot paraméternek bástya!");
        } else {
            double[] array = new double[6];
            for (int i = 0; i < Integer.parseInt(arr[0]); i++) {
                array[(int)(Math.floor(Math.random() * 6))]++;
            }
            for (int i = 0; i < array.length; i++) {
                System.out.println((i+1) + " dobás: " + ((array[i]/Integer.parseInt(arr[0]))*100) + "%");
            }
        }
    }

    public static void feladat17(String... arr) {
        if (arr.length < 2) {
            System.out.println("Legalább 2 számot tetya!");
        } else {
            int nov = 0;
            int csok = 0;
            for (int i = 1; i < arr.length; i++) {
                if (Integer.parseInt(arr[i]) < Integer.parseInt(arr[i-1]) ) {
                    csok++;
                } else {
                    nov++;
                }
            }
            if (nov == arr.length-1) {
                System.out.println("Növekvő.");
            } else if (csok == arr.length-1) {
                System.out.println("Csökkenő.");
            } else {
                System.out.println("Egyik sem.");
            }
        }
    }

    public static void feladat18(String... arr) {
        if (arr.length == 0) {
            System.out.println("Nincs bemenet!");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (Integer.parseInt(arr[i]) > 4 || Integer.parseInt(arr[i]) < 1) {
                    System.out.println("Rossz sorszám.");
                    System.exit(0);
                }
            }
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                switch(Integer.parseInt(arr[i])) {
                    case 1: sum+= 1000;
                    break;
                    case 2: sum+= 5000;
                    break;
                    case 3: sum+= 7000;
                    break;
                    case 4: sum+= 9000;
                }
            }
            System.out.println("Összeg: " + sum);

        }
    }

    public static void feladat19(String... arr) {
        if (arr.length != 2) {
            System.out.println("2 paramétert vérok");
        } else {
            int ker = 0;
            for (int i = 0; i < Integer.parseInt(arr[0]); i++) {
                ker += Integer.parseInt(arr[1]);
            }
            System.out.println("Kerület: " + ker);
        }
    }

    public static void feladat20(String... arr) {
        if (arr.length == 0) {
            System.out.println("Adjál meg paramétert!");
        } else {
            int length = 0;
            String word = "";
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length() > length) {
                    length = arr[i].length();
                    word = arr[i];
                }
            }
            System.out.println(word);
        }
    }

    public static void feladat21(String... arr) {
        if (arr.length != 3) {
            System.out.println("3 paramétert adj meg. (elsőszám, operátor, másodikszám");
        } else {
            switch(arr[1]) {
                case "+": System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]));
                break;
                case "-": System.out.println(Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]));
                break;
                case "x": System.out.println(Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]));
                break;
                case "/": System.out.println(Integer.parseInt(arr[0]) / Integer.parseInt(arr[2]));
                break;
            }
        }
    }

    public static void feladat22(String... arr) {
        double reszeredm = Double.parseDouble(arr[1]);
        for (int i = 2; i <= Integer.parseInt(arr[0])*2; i+=2) {
            switch(arr[i]) {
                case "+": reszeredm += Double.parseDouble(arr[i+1]);
                    break;
                case "-": reszeredm -= Double.parseDouble(arr[i+1]);
                    break;
                case "x": reszeredm *= Double.parseDouble(arr[i+1]);
                    break;
                case "/": reszeredm /= Double.parseDouble(arr[i+1]);
                    break;
            }
        }
        System.out.println(reszeredm);
    }

    public static void feladat23(String... arr) {

    }
}
