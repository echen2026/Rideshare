import java.util.*;
public class Car {
    /* fields */
    private ArrayList<Passenger> pass;
    private int destination;
    private int location;
    private boolean dirUp;
    private String ID;
    private static int idgen;
    

    /* constructors */
    public Car(){

        pass = new ArrayList<Passenger>();

        int randomDestination = (int) (Math.random()*36);
        destination = randomDestination;

        int randomStart = (int) (Math.random()*36);
        location = randomStart;

        if(destination > location){
            dirUp = true;
        } else {
            dirUp = false;
        }

        ID = "P" + idgen;
        idgen++;

    }
}
