package hu.flowacademy;

public class Main {

    public static void main(String[] args) {
        Parking<Vehicle> p = new Parking<Vehicle>(5);
        Car c = new Car();
        Car c2 = new Car();
        Motorcycle m = new Motorcycle();
        p.addSomething(c);
        p.addSomething(c2);
        p.addSomething(m);
        p.addSomething(new Motorcycle());
        p.addSomething(new Motorcycle());

/*        System.out.println(c.getClass());
        System.out.println(c.getClass().equals(c2.getClass()));
        System.out.println(c.getType());
        System.out.println(c.getType().equals(c2.getType()));*/
        p.getAll();

    }
}
