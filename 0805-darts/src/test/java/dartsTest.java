import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class dartsTest {

    private Darts d;

    @BeforeEach
    void setUpGame() {
        d = new Darts();
    }

    @Test
    public void aGameShouldStartAt301(){
        Assertions.assertEquals(301, d.getScore(), "The game should start at 301 points.");
        Assertions.assertFalse(d.isFinished());
    }

    @Test
    public void shouldCorrectlyCalculateNormalThrow(){
        d.dart(20, Darts.Multiplier.DOUBLE);
        d.dart(20);
        Assertions.assertEquals(241, d.getScore());
    }

    @Test
    public void shouldCorrectlyCalculateDoubleThrow()  {
        d.dart(20, Darts.Multiplier.DOUBLE);
        Assertions.assertEquals(261, d.getScore());
    }

    @Test
    public void shouldCorrectlyCalculateTripleThrow()  {
        d.dart(10, Darts.Multiplier.DOUBLE);
        d.dart(20, Darts.Multiplier.TRIPLE);
        Assertions.assertEquals(221, d.getScore());
    }

    @Test
    public void shouldCountFirstTurn(){
        Assertions.assertEquals(3, d.getDartsLeft());
        Assertions.assertEquals(1, d.getRound());
    }

    @Test
    public void shouldCalculateTheTurn() {
        d.dart(10, Darts.Multiplier.DOUBLE);
        d.dart(20, Darts.Multiplier.TRIPLE);
        d.dart(20);
        Assertions.assertEquals(2, d.getRound());
    }

    @Test
    public void shouldStartWithDouble() {
        d.dart(20, Darts.Multiplier.DOUBLE);
        Assertions.assertEquals(261, d.getScore());
    }


    @Test
    public void shouldFinishWithDouble() {
        d.dart(10, Darts.Multiplier.DOUBLE);
        d.dart(20, Darts.Multiplier.TRIPLE);
        d.dart(20, Darts.Multiplier.TRIPLE);
        d.dart(20, Darts.Multiplier.TRIPLE);
        d.dart(20, Darts.Multiplier.TRIPLE);
        d.dart(1);
        d.dart(20, Darts.Multiplier.DOUBLE);
        Assertions.assertTrue(d.isFinished());
    }

/*    shouldCalculateTheTurn();
    shouldStartWithDouble();
    shouldFinishWithDouble();*/
}