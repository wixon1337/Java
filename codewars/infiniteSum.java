public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        for (int i = 1; i <= 30; i++) {
            System.out.println(findDigit(i));
        }
        System.out.println(findDigit(1000));
        System.out.println(findDigit(10000));
        System.out.println(findDigit(100000));
        System.out.println(findDigit(1000000));
        System.out.println(findDigit(10000000));
        //System.out.println(findDigit(100000000));
        //System.out.println(findDigit(1000000000));
        // String s = "9223372036854775807";
        // System.out.println(s.length());

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Total time: " + (totalTime/1000)/1000);
    }

    public static int findDigit(int n) {
        String s = "";
        String s2 = "";
        String sumString = "";

        for (int i = 1; s.length() < n+5; i++) {
            s += i;
            s2 += i * i;
        }

        s = s.substring(0, n+5);
        s2 = s2.substring(0, n+5);
        // System.out.println(s + "\n" + s2);

        int carry = 0;
        int c = 0;
        for (int i = n+4; i >= 0 ; i--) {
            int a = Character.getNumericValue(s.charAt(i));
            int b = Character.getNumericValue(s2.charAt(i));
            c = a + b + carry;
            if (a + b + carry > 9) {
                carry = 1;
                c -= 10;
            } else {
                carry = 0;
            }
            sumString += c;
        }

        // System.out.println(sumString);

        String reversed = "";
        for (int i = sumString.length()-1; i >= 0 ; i--) {
            reversed += Character.getNumericValue(sumString.charAt(i));
        }

        // System.out.println(reversed);

        return Character.getNumericValue(reversed.charAt(n));


    }
}
