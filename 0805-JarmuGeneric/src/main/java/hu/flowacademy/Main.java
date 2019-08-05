package hu.flowacademy;

public class Main {

    public static void main(String[] args) {
        Parking<Vehicle> p = new Parking<Vehicle>(3);
        Car c = new Car();
        Car c2 = new Car();
        Motorcycle m = new Motorcycle();
        p.addSomething(c);
        p.addSomething(m);
        p.addSomething(c2);
/*        System.out.println(c.getClass());
        System.out.println(c.getClass().equals(c2.getClass()));
        System.out.println(c.getType());
        System.out.println(c.getType().equals(c2.getType()));*/
        p.getAll();

    }
}
