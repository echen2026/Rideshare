import java.util.*;
public class Station {
    //this class is kept simple - only has an arraylist of passengers waiting, simple methods to add and remove passengers from that as well.

    /* fields */
    private ArrayList<Passenger> pass;
    private int ID;
    private static int idgen;

    /* constructors */
    public Station(){
        pass = new ArrayList<Passenger>();

        ID = idgen;
        idgen++;        
    }


    /* methods */

    public void delete(Passenger p){
        pass.remove(p);
    }

    public void add(Passenger p){
        pass.add(p);
    }
        

    public ArrayList<Passenger> getPass(){
        return pass;
    }

    public String listPass(){
        String overall = "Passengers waiting at Station " + ID + ":";
        for(int i = 0; i < pass.size(); i++){
            overall += "\n" + pass.get(i).toString();
        }
        return overall;
    }
    
}
