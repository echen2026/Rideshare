public class Passenger{
    //simple class, passenger only knows destination (and ID for tostring)

    /* fields */
    private int destination;
    private int ID;
    private static int idgen;

    /* constructors */
    public Passenger(int mydestination){

        destination = mydestination;

        ID = idgen;
        idgen++;

    }

    /* methods */
    public int getDes(){
        return destination;
    }

    public int getID(){
        return ID;
    }

    public String toString(){
        return "Passenger " + ID + " | Destination: " + destination;
    }

}