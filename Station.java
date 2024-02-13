import java.util.*;
public class Station {

    /* fields */
    private ArrayList<Passenger> pass;
    private String ID;
    private static int idgen;

    /* constructors */
    public Station(){
        pass = new ArrayList<Passenger>();

        ID = "S" + idgen;
        idgen++;        
    }


    /* methods */
    public String getID(){
        return ID;
    }

    public String listPass(){
        String overall = "Passengers at Station " + ID + ":";
        for(int i = 0; i < pass.size(); i++){
            overall += "\n" + pass.get(i).toString();
        }
        return overall;
    }
    
}
