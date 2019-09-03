import java.util.ArrayList;

public class Bus {


    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;


    public Bus (String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public String destination() {
        return this.destination;
    }

    public int capacity() {
        return this.capacity;
    }


    public int numberOfPassengers() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        this.passengers.add(person);
    }
}
