package Main;

public class Cat extends Animal { // leszármazik az Anmial osztályból. Mindig 1 ős van.

    private int numberOfLifes;

    public Cat(String name, int age, int numberOfLifes) {
        super(name, age, true); // Meghívjuk az ősosztály konstruktorát
        this.numberOfLifes = numberOfLifes;
    }

    @Override
    public String sayHello() { // Method override azaz ősosztály függvényét felülírjuk
        return super.sayHello() + " és életeim száma: " + numberOfLifes;
    }

    public void sound() {   // Megvalósítjuk az abstract függvényt
        System.out.println("Meow");
    }
}
