import java.util.ArrayList;
public class Road {
    /* fields */
    private ArrayList<Car> cars;
    private ArrayList<Station> stations;
    private double revenue;
    private int carAmt;



    /* constructors */
    public Road(int myCarAmt, int passAmt){
        carAmt = myCarAmt;
        stations = new ArrayList<Station>();
        for(int i = 0; i <= 31; i++){
            stations.add(new Station());
        }

        cars = new ArrayList<Car>();
        for(int i = 0; i < carAmt; i++){
            cars.add(new Car());
        }

        for(int i = 0; i < passAmt; i++){
            Passenger p = new Passenger((int) (Math.random()*32));
            int randS = (int) (Math.random()*32);
            while(p.getDes()==randS){
                randS = (int) (Math.random()*32);
            }
            stations.get(randS).add(p);
            
        }

        putPassengersInCars();
    }


    /* methods */


    public void putPassengersInCars(){

        for(int s = 0; s < stations.size(); s++){

            ArrayList<Passenger> pass = stations.get(s).getPass();
            for(int c = 0; c < cars.size(); c++){
                if(cars.get(c).getLoc() == s){
                    ArrayList<Passenger> carPass = cars.get(c).getPass();
                    while(carPass.size() < 4 && pass.size() > 0){
                        if(pass.size() > 0){
                            cars.get(c).pickup(pass.get(0));
                            stations.get(s).delete(pass.get(0));
                        }
                    }
                }
            }


        }

    }

    public boolean carIsAtDestination(Car c){

        if(c.getDes()==c.getLoc()){
            return true;
        }

        return false;

    }

    public void deleteCar(Car c){
        int station = c.getLoc();
        ArrayList<Passenger> pass = c.getPass();

        for(int i = 0; i < pass.size(); i++){
            stations.get(station).add(pass.get(i));
        }

        revenue += c.getRev();
        cars.remove(c);
        

    }

    public void move(){

        for(Car c : cars){
            c.move();


            
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
            overall += "\n\n";
        }

        overall += "\n";

        overall += "Total Revenue: " + revenue;
        overall += "\nRevenue per Car: " + revenue/carAmt;

        return overall;
    }
}
