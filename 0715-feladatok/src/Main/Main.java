package Main;


import vehicles.Boat;
import vehicles.Car;

public class Main {
    public static void main(String[] args) {
        Boat b = new Boat("fasza", 1910, true);
        Car c = new Car("kurvajó", 1990, 4);
        System.out.println(b.toString());
        System.out.println(c.toString());
        b.sound();
        c.sound();
    }
}
