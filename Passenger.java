public class Passenger{

    /* fields */
    private boolean dirUp;
    private int destination;

    /* constructors */
    public Passenger(){
        int randomDirection = (int) (Math.random()*2);
        if(randomDirection > 1){
            dirUp = true;
        } else {
            dirUp = false;
        }

        int randomDestination = (int) (Math.random()*36);
        destination = randomDestination;
    }


    /* methods */




}