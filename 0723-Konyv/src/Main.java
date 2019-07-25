import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Main {
    static ArrayList<CD> cdList = new ArrayList<>();
    static ArrayList<Konyv> konyvList = new ArrayList<>();

    public static void main(String[] args) {
        rendelesFelvesz("./rendeles.txt");
        System.out.println(konyvList);
        rendel();
    }

    public static void rendelesFelvesz(String path) {
        String[] array;
        try (FileReader reader = new FileReader(path);
             BufferedReader br = new BufferedReader(reader)) {

            String line;
            int index = 0;
            while ((line = br.readLine()) != null) {
                array = line.split(";");
                for (int i = 0; i < array.length; i++) {
                    System.out.println(array[i]);
                    if (array[i].equals("cd")) {
                        cdList.add(new CD(array[i+1], array[i+2]));
                    } else if (array[i].equals("peldatar")) {
                        konyvList.add(new Peldatar(array[i+1], array[i+2], Integer.parseInt(array[i+3])));
                    } else if (array[i].equals("regeny")) {
                        konyvList.add(new Regeny(array[i+1], array[i+2], array[i+3]));
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.err.format("FileNotFoundException: %s%n", e);
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }

    public static void rendel() {
        for (int i = 0; i < cdList.size(); i++) {
            cdList.get(i).rendel(1);
        }

        for (int i = 0; i < konyvList.size(); i++) {
            if (konyvList.get(i) instanceof Regeny) {
                ((Regeny) konyvList.get(i)).rendel(1);
            }
        }
    }
}
