import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;

    @Before
    public void before() {
        bus = new Bus("Leith", 20);
        person = new Person();
    }

    @Test
    public void hasDestination() {
        assertEquals("Leith", bus.destination());
    }

    @Test
    public void hasCapacity() {
        assertEquals(20, bus.capacity());
    }

    @Test
    public void numberOfPassengers() {
        assertEquals(0, bus.numberOfPassengers());
    }

    @Test //check that Person can be added to passenger array
    public void addPersonAsPassenger() {
        bus.addPassenger(person);
        assertEquals(1, bus.numberOfPassengers());
    }



}
