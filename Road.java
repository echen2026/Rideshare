import java.util.ArrayList;
public class Road {
    /* fields */
    private ArrayList<Car> cars;
    private ArrayList<Station> stations;



    /* constructors */
    public Road(int carAmt, int passAmt){
        stations = new ArrayList<Station>();
        for(int i = 0; i < 32; i++){
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
    public String toString(){
        
    }
}
