import java.util.ArrayList;
public class Road {
    /* fields */
    private ArrayList<Car> cars;
    private ArrayList<Station> stations;



    /* constructors */
    public Road(int carAmt, int passAmt){
        stations = new ArrayList<Station>();
        for(int i = 0; i < 36; i++){
            stations.add(new Station());
        }

        cars = new ArrayList<Car>();
        for(int i = 0; i < carAmt; i++){
            cars.add(new Car());
        }

        for(int i = 0; i < passAmt; i++){
            Passenger p = new Passenger();
            stations.get(p.getLoc()).getFromCar(p);
        }
    }


    /* methods */

    public void move(){

    }


    
    public String toString(){
        String overall = "";

        for(int i = 0; i < stations.size(); i++){
            overall += stations.get(i).listPass();
            overall += "\n\n";
        }

        overall += "\n";

        for(int i = 0; i < cars.size(); i++){
            overall += cars.get(i).listPass();
            overall += "\n";
        }

        return overall;
    }
}
