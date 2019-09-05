import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CityFinder {
    private List<City> list;

    public CityFinder(String path) throws IOException {
        this.list = CityReader.readCities(path);
    }

    public City getCityByName(String cityName) {
        for (City c: this.list) {
            if (c.getName().equals(cityName)) {
                return c;
            }
        }
        return null;
    }

    public Set<City> getCityByPopulation(int lowerLimit, int upperLimit) {
        Set<City> set = new HashSet<>();
        for (City c: this.list) {
            if (c.getPopulation() < upperLimit && c.getPopulation() > lowerLimit) {
                set.add(c);
            }
        }
        return set;
    }
}
