public class Main {
    public static void main(String[] args) {
        String a = "fksfjafa"; // String literál
        String b = new String("dkasdas"); // példányosítás
        char[] ch = {'a', 'b', 'c'};
        String c = new String(ch); // karakter tömbből String
        char[] back =  c.toCharArray(); // Stringből -> char[]
    }
}
