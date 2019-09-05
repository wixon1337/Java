public class City {
    private final int zipCode;
    private final String name;
    private final Location location;
    private final int population;

    public City(int zipCode, String name, Location location, int population) {
        this.zipCode = zipCode;
        this.name = name;
        this.location = location;
        this.population = population;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "City{" +
                "zipCode=" + zipCode +
                ", name='" + name + '\'' +
                ", location=" + location +
                ", population=" + population +
                '}';
    }
}
