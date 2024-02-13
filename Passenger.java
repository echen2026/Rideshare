public class Passenger{

    /* fields */
    private boolean dirUp;
    private int destination;
    private int location;

    /* constructors */
    public Passenger(){

        int randomDestination = (int) (Math.random()*36);
        destination = randomDestination;

        int randomStart = (int) (Math.random()*36);
        location = randomStart;

        if(destination > location){
            dirUp = true;
        } else {
            dirUp = false;
        }

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





}