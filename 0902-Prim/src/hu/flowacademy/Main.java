package hu.flowacademy;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        int j = 2;

        while (i < 100) {
            boolean isPrim = true;
            for (int k = 2; k < j; k++) {
                if (j % k == 0) {
                    isPrim = false;
                    break;
                }
            }

            if (isPrim) {
                System.out.println(j);
                i++;
            }
            j++;
        }

        System.out.println(cezarCypher("gabiv", 5));
    }

    public static String cezarCypher(String s, int x) {
        var cypheredString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ((int)s.charAt(i)+x > 122){
                cypheredString.append((char)((int)s.charAt(i) + x - 26));
            } else {
                cypheredString.append((char)((int)s.charAt(i) + x));
            }
        }

        return cypheredString.toString();
    }
}

