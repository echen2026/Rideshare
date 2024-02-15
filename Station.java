import java.util.*;
public class Station {

    /* fields */
    private ArrayList<Passenger> passDirUp;
    private ArrayList<Passenger> passDirDown;
    private String ID;
    private static int idgen;

    /* constructors */
    public Station(){
        passDirUp = new ArrayList<Passenger>();
        passDirDown = new ArrayList<Passenger>();

        ID = "S" + idgen;
        idgen++;        
    }


    /* methods */
    public String getID(){
        return ID;
    }

    public Passenger putIntoCar(Passenger p){
        Passenger temp = p;
        if(p.getDir()){
            passDirUp.remove(p);
        } else {
            passDirDown.remove(p);
        }
        return temp;
    }

    public void getFromCar(Passenger p){
        if(Integer.toString(p.getDes())==ID){

        } else {
            if(p.getDir()){
                passDirUp.add(p);
            } else {
                passDirDown.add(p);
            }
        }
        
    }

    public String listPass(){
        String overall = "Passengers waiting at Station " + ID + ":";
        for(int i = 0; i < passDirUp.size(); i++){
            overall += "\n" + passDirUp.get(i).toString();
        }
        for(int i = 0; i < passDirDown.size(); i++){
            overall += "\n" + passDirDown.get(i).toString();
        }
        return overall;
    }
    
}
