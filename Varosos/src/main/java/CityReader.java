import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CityReader {
    public static List<City> readCities(String path) throws IOException {
        List<City> list = new ArrayList<>();
        try {
            Files.lines(Paths.get(path)).forEach(s -> {
                String[] array = s.split("\\t");
                list.add(new City(Integer.parseInt(array[0]), array[1], new Location(array[3], array[4]), Integer.parseInt(array[8])));

            });
        } catch (FileNotFoundException e) {
            System.err.format("FileNotFoundException: %s%n", e);
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

        return list;
    }
}
