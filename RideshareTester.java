public class RideshareTester {
    


    public static void main(String[] args) {
        System.out.println("Rideshare Project");
        System.out.println();


        Road r = new Road(3, 6);
        System.out.println(r);

        r.move();
        r.move();

        System.out.println(r);
    }


}
