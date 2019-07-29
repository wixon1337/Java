public class Main {
    public static void main(String[] args) {
        String szoveg = "Indul a gorog aludni";
        forditvaString(szoveg);
        szavankentKulonSorba(szoveg);
        String szoveg2 = "Indul a gorog aludni.";
        utolsoSzo(szoveg2);
        atere(szoveg);
        otNagyOra(szoveg);
        utolsoSzo2(szoveg);
    }

    public static void forditvaString(String s) {
        for (int i = s.length()-1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }

    public static void szavankentKulonSorba(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                System.out.println();
            } else {
                System.out.print(s.charAt(i));
            }
        }
        System.out.println();
    }

    public static void utolsoSzo(String s) {
        if (s.charAt(s.length()-1) == '.') {
            String result = "";
            for (int i = s.length()-2; i >= 0 ; i--) {
                if (s.charAt(i) == ' ') {
                    break;
                } else {
                    result += (s.charAt(i));
                }
            }
            forditvaString(result);
        }
    }

    public static void atere(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                System.out.print('e');
            } else {
                System.out.print(s.charAt(i));
            }
        }
        System.out.println();
    }

    public static void otNagyOra(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'o') {
                System.out.print('O');
            } else {
                System.out.print(s.charAt(i));
            }
        }
        System.out.println();
    }

    public static void utolsoSzo2(String s) {
        String result = "";
        for (int i = s.length()-1; i >= 0 ; i--) {
            if (s.charAt(i) == ' ') {
                break;
            } else {
                result += (s.charAt(i));
            }
        }
        forditvaString(result);
    }
}
