import java.util.*;
public class Car {
    /* fields */
    private ArrayList<Passenger> pass;
    private int destination;
    private int location;
    private boolean dirUp;
    private String ID;
    private static int idgen;
    private int revenue;
    

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

        ID = "C" + idgen;
        idgen++;

    }

    /* methods */

    public String listPass(){
        String overall = "Passengers in Car " + ID + ":";
        for(int i = 0; i < pass.size(); i++){
            overall += "\n" + pass.get(i).toString();
        }
        return overall;
    }

    public void move(){
        if(destination != location){
            if(dirUp){
                location++;
            } else {
                location--;
            }
        }
    }


    public int needDropoff(){
        for(int i = 0; i < pass.size(); i++){
            if (pass.get(i).getDes() == destination){
                return i;
            }
        }
        return -1;
    }

    public Passenger dropoff(int pos){
        if(pos != -1){
            Passenger temp = pass.get(pos);
            pass.remove(pos);
            return temp;
        }
        return null;
    }

}
