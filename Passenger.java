public class Passenger{

    /* fields */
    private boolean dirUp;
    private int destination;
    private int location;
    private String ID;
    private static int idgen;

    /* constructors */
    public Passenger(){

        int randomDestination = (int) (Math.random()*32);
        destination = randomDestination;

        int randomStart = (int) (Math.random()*32);
        location = randomStart;

        if(destination > location){
            dirUp = true;
        } else {
            dirUp = false;
        }


        ID = "P" + idgen;
        idgen++;

    }


    /* methods */

    public int getDes(){
        return destination;
    }

    public int getLoc(){
        return location;
    }

    public boolean getDir(){
        return dirUp;
    }

    public String getID(){
        return ID;
    }

    public String toString(){
        String directiontext = "";
        if(dirUp == false){
            directiontext = "Down";
        } else {
            directiontext = "Up";
        }

        return "Passenger ID: " + ID + " | Destination: " + destination + " | Direction: " + directiontext;
    }



}