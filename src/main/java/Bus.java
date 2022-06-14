import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;
    
    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }
    
    public int passengerCount() {
        return this.passengers.size();
    }
    
    public void addPassenger(Person person) {
        if (this.passengerCount() < this.capacity) {
            this.passengers.add(person);
        }
    }
    
    public Person removePassenger() {
        return this.passengers.remove(0);
    }
    
    public void pickUp(BusStop busStop) {
        Person person = busStop.removePerson();
        this.passengers.add(person);
    }
    
}
    
