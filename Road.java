import java.util.ArrayList;
public class Road {
    /* fields */
    private ArrayList<Car> cars;
    private ArrayList<Station> stations;
    private int revenue;



    /* constructors */
    public Road(int carAmt, int passAmt){
        stations = new ArrayList<Station>();
        for(int i = 0; i <= 31; i++){
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

        for(int i = 0; i < cars.size(); i++){
            int p = cars.get(i).needDropoff();
            Passenger dropped = cars.get(i).dropoff(p);
            if(dropped != null){
                stations.get(dropped.getLoc()).getFromCar(dropped);
            }

            revenue += cars.get(i).getRev();

            if(cars.get(i).getDes() == cars.get(i).getLoc()){
                cars.remove(i);
                
            }
            

            for(int s = 0; s < stations.size(); s++){
                if((Integer.toString(cars.get(i).getLoc()).equals(stations.get(s).getID())) && cars.get(i).getOccupancy()<3){
                    if(cars.get(i).getDir()){
                        for(int pass = 0; p < stations.get(s).getDirUp().size(); p++){
                            stations.get(s).getFromCar(stations.get(s).getDirUp().get(pass));
                        }
                    } else {
                        for(int pass = 0; p < stations.get(s).getDirDown().size(); p++){
                            stations.get(s).getFromCar(stations.get(s).getDirDown().get(pass));
                        
                    }
                    
                }
            
            }
                        cars.get(i).move();

        }
    }

        
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

        overall += "\n";

        overall += "Total Revenue: " + revenue;

        return overall;
    }
}
