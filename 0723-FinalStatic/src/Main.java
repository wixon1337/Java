import java.util.ArrayList;
import java.util.List;

public class Main {
    enum cell {
        MINE,
        FIELD,
        EMPTY_FIELD
    }

    public static void main(String[] args) {
        System.out.println(Car.numberOfCars); //Statikus változót az Osztálynév.változónév -ként érünk el
        Car.printSomething();
        // Polimorfizmus: a leszármazott osztály objektuma kezelhető ősosztály típusú objektumként is
        Audi a1 = new Audi("A5", 2010);
        Citroen c1 = new Citroen("I5", 2003);
        Car[] arr = new Car[2];  // ős típusú tömb
        arr[0] = a1;
        arr[1] = c1;

        if (arr[0] instanceof Audi) { //instanceof: megvizsgálja, hogy az adott osztály objektuma-e
            System.out.println("AUDI");
            Audi at = (Audi)arr[0]; // Típuskonverzió; 1sorban ugyanez: ((Audi)arr[0]).audiSign();
            at.audiSign();
        }

        List<Car> cars = new ArrayList();
        cars.add(a1);
        cars.add(c1);

        for(Car c : arr) {

        }

        cell[][] array = new cell[2][2];
        array[0][0] = cell.MINE;
        array[0][1] = cell.FIELD;
        array[1][0] = cell.MINE;
        array[1][1] = cell.FIELD;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                switch (array[i][j]) {
                    case MINE:
                        System.out.print("M");
                        break;
                    case FIELD:
                        System.out.print("F");
                        break;
                    case EMPTY_FIELD:
                        System.out.println(" ");
                        break;
                }
            }
            System.out.println();
        }
    }
}
