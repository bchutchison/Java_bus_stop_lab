import java.util.ArrayList;

public class Bus {


    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;


    public Bus (String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
    }

    public String destination() {
        return this.destination;
    }

    public int capacity() {
        return this.capacity;
    }
}
