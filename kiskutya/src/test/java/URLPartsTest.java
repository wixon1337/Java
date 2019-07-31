import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class URLPartsTest {

    private static Calculator calculator;

    @BeforeAll
    static void init() {
        calculator = new Calculator();
    }

    @Test
    void addPositiveNumbers() {
        Assertions.assertEquals(3, calculator.add(1,2));
        Assertions.assertNotEquals(2, calculator.add(1,2));
    }

    @Test
    void addNegativeNumbers() {
        Assertions.assertEquals(-1, calculator.add(0, -1));
    }

    @Test
    void addStrings() {
        Assertions.assertEquals("ab", calculator.addStrings("a", "b"));
        Assertions.assertEquals("áé", calculator.addStrings("á","é"));
        Assertions.assertEquals("&@", calculator.addStrings("&", "@"));
        Assertions.assertEquals("", calculator.addStrings("", ""));
        Assertions.assertEquals("\n\n", calculator.addStrings("\n", "\n"));
        Assertions.assertNotEquals("12", calculator.addStrings("1", "2"), "Failed to add numbers.");

    }

}
