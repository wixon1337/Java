import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RandomTest {
    static Random r;

    @BeforeAll
    static void setup() {
        r = new Random();
    }

    @Test
    void shouldRandomMethodReturn() {
        Assertions.assertEquals(1, r.randomMethod());
        Assertions.assertNotEquals(2, r.randomMethod());
    }
}
