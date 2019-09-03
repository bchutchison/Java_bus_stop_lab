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

    public void addPassengerFromStop(BusStop busStop) {
        if(this.passengers.size() < this.capacity) {
            Person person = busStop.removePersonFromQueue();
            this.passengers.add(person);
        }
    }

    public void removePassenger() {
        this.passengers.remove(0);
    }







}
