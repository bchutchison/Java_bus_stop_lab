import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

BusStop busStop;
Person person;

@Before
    public void before() {
    busStop = new BusStop("Constitution Street");
    person = new Person();
}

@Test
    public void hasName() {
    assertEquals("Constitution Street", busStop.getName());
}

@Test
    public void checkQueueIsEmpty() {
    assertEquals(0, busStop.queueLength());
}

@Test
    public void addPersonToQueue() {
    busStop.addPersonToQueue(person);
    assertEquals(1, busStop.queueLength());
}

@Test
    public void removePersonFromQueue() {
    busStop.addPersonToQueue(person);
    busStop.addPersonToQueue(person);
    busStop.removePersonFromQueue();
    assertEquals(1, busStop.queueLength());
}



}
