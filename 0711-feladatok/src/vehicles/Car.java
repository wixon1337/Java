package vehicles;

public class Car extends Vehicle {
    private int numberOfTires;

    public Car(String type, int year, int numberOfTires) {
        super(type, year);
        this.numberOfTires = numberOfTires;
    }

    public int getNumberOfTires() {
        return this.numberOfTires;
    }

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    @Override
    public String toString() {
        return super.toString() + " Kerekek száma: " + numberOfTires;
    }

    public void sound() {
        System.out.println("tűűtűűű");
    }
}
