package vehicles;

public class Boat extends Vehicle {
    private boolean isOnSea;

    public Boat(String type, int year, boolean isOnSea) {
        super(type, year);
        this.isOnSea = isOnSea;
    }

    public boolean isOnSea() {
        return this.isOnSea;
    }

    public void setOnSea(boolean isOnSea) {
        this.isOnSea = isOnSea;
    }

    public String toString() {
        return super.toString() + " " + (isOnSea()? "Vizen van":"Nincs vizen");
    }

    public void sound() {
        System.out.println("vííííí");
    }
}
