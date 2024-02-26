public class RideshareTester {
    


    public static void main(String[] args) {
        System.out.println("Rideshare Project");
        System.out.println();


        Road r = new Road(3, 6);
        System.out.println(r);

        for(int i = 1; i < 100; i++){
            r.move();

        }        

        System.out.println(r);
    }


}
