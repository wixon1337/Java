import hu.flowacademy.Parking;
import hu.flowacademy.Vehicle;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ParkingTest {

    @BeforeAll
    static void init() {
        Parking<Vehicle> p = new Parking<Vehicle>(5);
    }

    @Test
    void addSomething() {

    }
}
