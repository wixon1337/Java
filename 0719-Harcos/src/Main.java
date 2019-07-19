import harcosokklubja.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Harcos> klub = new ArrayList<Harcos>();

        try (FileReader reader = new FileReader("harcosok.txt");
             BufferedReader br = new BufferedReader(reader)) {

            // read line by line
            String line;
            while ((line = br.readLine()) != null) {
                String[] array = line.split(";");
                if (array[0].equals("Harcos")) {
                    klub.add(new Harcos(Integer.parseInt(array[1]), Integer.parseInt(array[2])));
                } else if (array[0].equals("Nagydarab")) {
                    klub.add(new Nagydarab(Integer.parseInt(array[1]),Integer.parseInt(array[2]),Integer.parseInt(array[3])));
                }
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

        for (int i = 0; i < klub.size(); i++) {
            for (int j = 0; j < klub.size(); j++) {
                if (i != j && klub.get(i).getHp() > 0 && klub.get(j).getHp() > 0) {
                    match(klub.get(i),klub.get(j));
                }
            }
        }



/*        Harcos[] klub = new Harcos[args.length/3];  //OLD: from args
        int klubIndex = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("Harcos")) {
                klub[klubIndex++] = new Harcos(Integer.parseInt(args[i+1]), Integer.parseInt(args[i+2]));
            } else if (args[i].equals("Nagydarab")) {
                klub[klubIndex++] = new Nagydarab(Integer.parseInt(args[i+1]), Integer.parseInt(args[i+2]), Integer.parseInt(args[i+3]));
            }
        }

      if (klubIndex > 1) {
            for (int i = 0; i < klub.length; i++) {
                for (int j = 0; j < klub.length; j++) {
                    if ( i != j && klub[i] != null && klub[j] != null && klub[i].getHp() > 0 && klub[j].getHp() > 0){
                        match(klub[i], klub[j]);
                    }
                }
            }
        }
    }*/
    }

    public static void match(Harcos h1, Harcos h2) {
        System.out.println(h1);
        System.out.println("\nHarcol:");
        System.out.println(h2);
        System.out.println();
        for (int i = 0; i < 3; i++) {
            if (h1.getHp() <= 0 && h2.getHp() > 0) {
                System.out.println("Won: " + h2.toString());
                System.out.println("-----------------------------------");
                break;
            } else if (h2.getHp() <= 0 && h1.getHp() > 0) {
                System.out.println("Won: " + h1.toString());
                System.out.println("-----------------------------------");
                break;
            } else if (h1.getHp() <= 0 && h2.getHp() <= 0){
                System.out.println("Draw.");
                System.out.println("-----------------------------------");
                break;
            } else {
                h1.hit(h2);
                h2.hit(h1);
            }
        }
        if (h1.getHp() > 0 && h2.getHp() > 0) {
            System.out.println("Draw.");
            System.out.println("-----------------------------------");
        }
    }
}
