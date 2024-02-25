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

    public void move(){
        if(destination != location){
            if(dirUp){
                location++;
            } else {
                location--;
            }
        }

        //calculate revenue
        revenue+=pass.size();
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

    public void pickup(Passenger p){
        pass.add(p);
    }

    public int getDes(){
        return destination;
    }

    public int getLoc(){
        return location;
    }

    public boolean getDir(){
        return dirUp;
    }

    public int getRev(){
        return revenue;
    }

    public int getOccupancy(){
        return pass.size();
    }

    public String listPass(){

        String directiontext = "";
        if(dirUp == false){
            directiontext = "Down";
        } else {
            directiontext = "Up";
        }

        String overall = "Car " + ID + " at Station " + location + " | Direction: " +  directiontext + " | " + "Passengers in Car " + ID + ":";
        for(int i = 0; i < pass.size(); i++){
            overall += "\n" + pass.get(i).toString();
        }
        return overall;
    }

}
