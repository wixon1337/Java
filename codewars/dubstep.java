public class Main {
    public static void main(String[] args) {
        String s = "RWUBWUBWUBLWUB";
        String abc = "WUBWUBABCWUB";
        String fk = "FWUBWUBWUBk";
        System.out.println(SongDecoder(s));
        System.out.println(SongDecoder(abc));
        System.out.println(SongDecoder(fk));
    }

    public static String SongDecoder (String song) {
        return song.replaceAll("(WUB)+"," ").trim();
    }
}
