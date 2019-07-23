public abstract class Vehicle { // absztrakt kell hogy legyen ha van benne absztrakt függvény
    //final: -osztályra: nem lehet származtatni(extends)
    //final: -adattagra: konstans
    private final String type;
    private int year;

    public Vehicle(String type, int year) {
        this.year = year;
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public String getType() {
        return type;
    }

/*    public void setType(String type) {  // final a type
        this.type = type;
    }*/

    public final String print() { // nem lehet overrideolni / felülirni
        return "Vehicle" + type + " year: " + year;
    }

    public abstract void doSomething(int num); // absztrakt függvény -> leszármazottban implementáljuk

}
