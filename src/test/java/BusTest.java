import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Bus smallBus;
    Person person;

    @Before
    public void before() {
        bus = new Bus("Leith", 20);
        smallBus = new Bus("Leith", 2);
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

    @Test //check that Person cannot be added to passenger array
    public void doesNotAddPersonAsPassenger() {
        smallBus.addPassenger(person);
        smallBus.addPassenger(person);
        smallBus.addPassenger(person);
        assertEquals(2, smallBus.numberOfPassengers());
    }

    @Test //check removal of passenger
    public void removesPassengerFromBus() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(1, bus.numberOfPassengers());
    }



}
