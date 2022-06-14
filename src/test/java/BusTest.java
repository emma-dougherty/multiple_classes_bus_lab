import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;
    private Person person;
    private BusStop busStop;
    
    @Before
    public void before(){
        bus = new Bus ("Paris", 5);
        person = new Person();
        busStop = new BusStop("Louvre");
        busStop.addPerson(person);
        
    }
    
    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }
    
    @Test
    public void busCanAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }
    
    @Test
    public void busCannotAddPassengerIfFull(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(5, bus.passengerCount());
    }
    
    @Test
    public void busCanRemoveAPassenger(){
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(0, bus.passengerCount());
    }
    
    @Test
    public void canPickUpPerson(){
        bus.pickUp(busStop);
        assertEquals(1, bus.passengerCount());
        assertEquals(0, busStop.queueCount());
    }
    
}
    

