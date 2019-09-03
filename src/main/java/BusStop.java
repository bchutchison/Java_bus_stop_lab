import java.util.ArrayList;

public class BusStop {

private ArrayList<Person> queue;
private String name;

public BusStop(String name) {
    this.name = name;
    this.queue = new ArrayList<Person>();
}

    public String getName() {
        return this.name;
    }

    public int queueLength() {
        return this.queue.size();
    }

    public void addPersonToQueue(Person person) {
        this.queue.add(person);
    }

    public Person removePersonFromQueue() {
        return this.queue.remove(0);
    }
}
