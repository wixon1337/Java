public class Car extends Vehicle implements Go, Sound{
    private int wheels;
    public static int numberOfCars; //Static: osztály szinten létezik, teljes futásidő alatt egy változó (osztályhoz tatrtozik, nem a példányhoz)

    public Car(String type, int year, int wheels){
        super(type, year);
        this.wheels = wheels;
        numberOfCars++;
    }

    public int getNumberOfCars() { // objektum szintű függvény
        return numberOfCars; // osztály szintű változó
    }

    public static void printSomething() { // Osztály szintű függvény
        System.out.println("Something");
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

/*    @Override // final miatt nem lehet overrideolni
    public String print() {
        return super.print() + " valami";
    }*/

    public void doSomething(int num) {
        System.out.println("Do something: " + num);
    }

    @Override
    public void goSomewhere(int a, int b) {
        System.out.println("Start: " + a + " End: " + b);
    }

    @Override
    public void saySomething() {
        System.out.println(BASIC);
    }

    @Override
    public String horn() {
        return null;
    }
}
