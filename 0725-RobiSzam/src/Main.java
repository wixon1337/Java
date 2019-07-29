public class Main {
    public static void main(String[] args){
        Szam szamocska = new Szam("-1234");
        System.out.println("negativ: " + szamocska.isNegativ());
        System.out.println("pozitiv: " + szamocska.isPozitiv());
        System.out.println("paros: " + szamocska.isParos());
        System.out.println("paratlan: " + szamocska.isParatlan());
        Parosos parosSzam = new Szam("13");
        System.out.println(parosSzam);
    }
}
