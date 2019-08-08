import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CarTest {
    private Car car;
    private Engine engine;
    private FuelTank fuelTank;

    @BeforeAll
    public void setup() {
        engine = Mockito.mock(Engine.class);
        fuelTank = Mockito.mock(FuelTank.class);

        // car = new Car(engine, fuelTank);
    }

    @Test
    public void isRunning() {
        Mockito.when(engine.isRunning()).thenAnswer(true);
        Assertions.assertTrue(engine.isRunning());
    }
}
