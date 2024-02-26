public class Passenger{

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

}