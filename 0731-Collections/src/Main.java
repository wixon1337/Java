import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5}; //fix méretű, típustól függő, bejárása manuális (irni kell egy fort)
        for (int n : arr1) {
            System.out.println(n);
            // n - a tömb aktuális eleme, nem tudjuk módosítani
        }

        for (int i = 0; i < arr1.length; i++) {
            // int n = arr[i];
            // i - a tömb indexe, arr[i] a tömb adott eleme
        }
        // ----------------------------------------------------------------------------------------------------

        List<String> stringList = new ArrayList<>();
        stringList.add("cica");
        stringList.add("kiscica");
        stringList.add("oroszlán");
        stringList.add("tigris");
        stringList.add("kiscica");
        System.out.println(stringList);
        stringList.clear(); // Minden elem törlése
        System.out.println(stringList);

        stringList.add("cica");
        stringList.add("kiscica");
        stringList.add("oroszlán");
        stringList.add("tigris");
        stringList.add("kiscica");
        String deleted = stringList.remove(0);
        System.out.println(deleted);
        System.out.println(stringList);
        System.out.println("------------------------------------------------------------------------");

        List<Integer> intListOtherWay = Arrays.asList(10, 20, 30, 40);
        System.out.println(intListOtherWay);
        System.out.println(intListOtherWay.get(1) instanceof Integer);
        System.out.println("------------------------------------------------------------------------");

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(3);
        intList.add(2);
        intList.add(4);
        intList.add(5);
        intList.add(7);

        System.out.println(intList);
        // removeOdds(intList);
        removeOddsWithIterator(intList);
        System.out.println(intList);
        System.out.println("------------------------------------------------------------------------");

        Set<Integer> hashInt = new HashSet<>();
        Set<Integer> intSet = new TreeSet<>(); // Halmaz, piros-fekete fa által megvalósítva
        intSet.add(1); // Minden elem csak egyszer szerepelhet a halmazban
        intSet.add(2); // Az elemek rendezetlenek
        intSet.add(1);
        intSet.add(4);
        intSet.add(3);
        intSet.add(-3);
        intSet.add(-15);
        System.out.println(intSet);
        removeNegativNumbers(intSet);
        System.out.println(intSet);
        System.out.println("------------------------------------------------------------------------");

        Map<Integer, String> map = new HashMap<>(); // Kulcs-érték párok tárolása
        map.put(1, "Cica"); // Kulcs-érték pár hozzáadása
        map.put(200, "macska");
        System.out.println(map.get(200)); // A kulcshoz tartozó érték kivétele
        printMapWithIterator(map);
        printMapWithForEach(map);
        System.out.println("------------------------------------------------------------------------");

        Stack<Integer> intStack = new Stack<>(); // LIFO
        intStack.push(1);
        intStack.push(5);
        intStack.push(20);
        System.out.println(intStack);
        int elementPopped = intStack.pop();
        System.out.println(intStack);
        int elementOnTop = intStack.peek();
        System.out.println(elementOnTop);
        System.out.println("------------------------------------------------------------------------");

        Queue<Integer> intQueue = new ArrayDeque<>(); // FIFO
        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(20);
        System.out.println(intQueue);
        System.out.println(intQueue.poll());
        System.out.println(intQueue);
    }

    public static void removeOdds(List<Integer> input) {
/*        for (int i : input) {
            if (i % 2 == 1) input.remove((Object)i);
        }*/

        for (int i = 0; i < input.size(); i++) {
            if (input.get(i) % 2 != 0) {
                input.remove(i);
            }
        }
        System.out.println(input);
    }

    public static void removeOddsWithIterator(List<Integer> input) {
        Iterator<Integer> it = input.iterator(); // Lista iterátorának lekérése
        while (it.hasNext()) { // Ameddig van nem vizsgált elem
            int element = it.next(); // Lekérjük a következő nem vizsgált elemet
            if (element % 2 == 1) {
                it.remove(); // Az éppen mutatott elemet töröljük
            }
        }
    }

    public static void removeNegativNumbers(Set<Integer> input) {
        Iterator<Integer> it = input.iterator();
        while (it.hasNext()) {
            int element = it.next();
            if (element < 0) {
                it.remove();
            }
        }
    }

    public static void printMapWithIterator(Map<Integer, String> input) {
        Iterator it = input.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry element = (Map.Entry) it.next();
            // vagy igy: Map.Entry<Integer, String> element = (Map.Entry<Integer, String>) it.next();
            System.out.println(element.getKey() + ": " + element.getValue());
        }
    }

    public static void printMapWithForEach(Map<Integer, String> input) {
        for (Map.Entry<Integer, String> element : input.entrySet()) {
            System.out.println(element);
        }
    }
}
