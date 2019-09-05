
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
/*
        CityFinder cf = new CityFinder("telepulesek.txt");
        System.out.println(cf.getCityByName("Szentendre"));
        System.out.println(cf.getCityByPopulation(5000, 60000));
*/
        List<Integer> lList = new LinkedList<>();
        lList.add(2);
        lList.add(3);
        lList.add(123);
        lList.add(5);
        System.out.println(lList);
        ListIterator iterator = lList.listIterator();
        while (iterator.hasNext()) {
            int i = (Integer)iterator.next();
            if (i == 3) {
                iterator.remove();
            }
        }
        System.out.println(lList);
        while (iterator.hasPrevious()) {
            int i = (Integer)iterator.previous();
            if (i == 123) {
                iterator.set(321);
            }
        }
        System.out.println(lList);

        System.out.println("--------------------------------------------------");

        List<Integer> aList = new ArrayList<>();
        aList.addAll(lList);
        System.out.println(aList);
        aList.add(420);
        System.out.println(aList);
        Iterator alIterator = aList.iterator();
        while (alIterator.hasNext()) {
            if ((int)alIterator.next() < 6 ) {
                alIterator.remove();
            }
        }
        System.out.println(aList);
        aList.removeIf(i -> i == 321);
        System.out.println(aList);

        System.out.println("--------------------------------------------------");

        HashSet<List> hSet = new HashSet<>();
        hSet.add(lList);
        hSet.add(aList);
        System.out.println(hSet);
        Iterator hsIt = hSet.iterator();
        while (hsIt.hasNext()) {
            System.out.println(hsIt.next());
        }

        System.out.println("--------------------------------------------------");

        TreeSet<Integer> tSet = new TreeSet<>(lList);
        Iterator tsIt = tSet.iterator();
        while (tsIt.hasNext()) {
            System.out.println(tsIt.next());
        }

        System.out.println("--------------------------------------------------");

        HashMap<Integer, String> hMap = new HashMap<>();
        hMap.put(13, "kecske");
        hMap.put(32, "macska");
        hMap.put(69, "nagyonkecske");
        Iterator hmIt = hMap.entrySet().iterator();
        while (hmIt.hasNext()) {
            System.out.println(hmIt.next());
        }

        System.out.println("--------------------------------------------------");

        TreeMap<Character, String> tMap = new TreeMap<>();
        tMap.put('a', "azhát");
        tMap.put('z', "fasdas");
        tMap.put('\t', "kecske");
        Iterator tmIt = tMap.entrySet().iterator();
        while (tmIt.hasNext()) {
            System.out.println(tmIt.next());
        }
    }
}
