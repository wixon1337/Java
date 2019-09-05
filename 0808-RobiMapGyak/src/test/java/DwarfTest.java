import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class DwarfTest {

    private final static String[] DWARF_NAMES = {"Hapci", "Kuka", "Morgó", "Vidor", "Szundi", "Tudor", "Szende"};

    private String getRandomDwarfName() {
        return DWARF_NAMES[new Random().nextInt(DWARF_NAMES.length)];
    }

    @Test
    public void testHashSetPerformance() {
        long start = System.currentTimeMillis();
        System.out.println(new Date(start));

        Set<Object> set = new HashSet<>();
        for (int i = 0; i < 1_000_000; i++) {
            set.add(new Dwarf(getRandomDwarfName()));
        }
    }

    @Test
    public void testTreeSetPerformance() {

    }
}