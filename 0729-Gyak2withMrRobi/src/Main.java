public class Main {
    public static void main(String[] args) {
        String szoveg = "aáeéiíoóöőuúűü";
        ekezetNelkul(szoveg);
        String szamrendszer = "12A34B";
        szamrendszer(szamrendszer);
        szamrendszer("1010101");
        szamrendszer("9");
        lemer(100000);
        lemer(1000000);
    }

    public static void ekezetNelkul(String s) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'á') {
                sb.append('a');
            } else if (s.charAt(i) == 'é') {
                sb.append('e');
            } else if (s.charAt(i) == 'í') {
                sb.append('i');
            } else if (s.charAt(i) == 'ó' || s.charAt(i) == 'ő' || s.charAt(i) == 'ö') {
                sb.append('o');
            } else if (s.charAt(i) == 'ű' || s.charAt(i) == 'ú' || s.charAt(i) == 'ü') {
                sb.append('u');
            } else {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }

    public static void szamrendszer(String s) {
        boolean kettes = true, nyolcas = true, tizes = true, tizenhatos = true;
        StringBuilder sb = new StringBuilder("");
        String[] hexaArray = {"A", "B", "C", "D", "E","F"};
        for (int i = 0; i < hexaArray.length; i++) {
            if (s.contains(hexaArray[i])) {
                kettes = false;
                nyolcas = false;
                tizes = false;
                break;
            }
        }
        if (tizes) {
            int max = 0;
            for (int i = 0; i < s.length(); i++) {
                if (Character.getNumericValue(s.charAt(i)) > max) {
                    max = Character.getNumericValue(s.charAt(i));
                }
            }
            if (max > 7 ) {
                nyolcas = false;
            }
            if (max > 1) {
                kettes = false;
            }
        }
        System.out.println("Kettes: " + kettes + ", nyolcas: " + nyolcas + ", tizes: " + tizes + ", tizenhatos: " + tizenhatos);
    }

    public static void lemer(int n) {
        long before = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < n; i++) {
            s += 'a';
        }
        long after = System.currentTimeMillis();
        System.out.println("+= diff: " + (after - before));

        before = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append('a');
        }
        after = System.currentTimeMillis();
        System.out.println("Builder diff: " + (after - before));

        before = System.currentTimeMillis();
        StringBuffer sbuffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbuffer.append('a');
        }
        after = System.currentTimeMillis();
        System.out.println("Buffer diff: " + (after - before));


    }
}
