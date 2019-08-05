import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> l1 = List.of("asdad","aasdas", "ezszerintemtöbbmint8");
        System.out.println(getLongNames(l1));
        System.out.println(randomSzamok("Természetes"));
    }

    public static List<String> getLongNames(List<String> list) {
        return list.stream().filter(s -> s.length() > 8).sorted().collect(Collectors.toList());
    }

    public static List<Szam> randomSzamok(String type) {
        List<Szam> l = new ArrayList<>();
        if (type.equals("Természetes")) {
            for (int i = 0; i < 10; i++) {
                double d = (Math.floor(Math.random() * 1000));
                l.add(new TermeszetesSzam(Double.toString(d)));
            }
        }
        return l;
    }
}
