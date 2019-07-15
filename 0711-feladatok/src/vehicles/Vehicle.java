package vehicles;

public abstract class Vehicle {
    private String type;
    private int year;

    public Vehicle() {
        this.type = "gecijó";
        this.year = 1800;
    }

    public Vehicle(String type, int year) {
        this.type = type;
        this.year = year;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        if (year < 1800 || year > 2019) {
            System.out.println("Hiba: 1800 és 2019 között lehet csak.");
        } else {
            this.year = year;
        }
    }

    public String toString() {
        return "Jármű típusa: " + this.type + ", év: " + this.year + ".\n";
    }

    public abstract void sound();
}
