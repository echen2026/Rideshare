public class RideshareTester {
    


    public static void main(String[] args) {
        System.out.println("Rideshare Project");
        System.out.println();


        Road r = new Road(10, 40);
        System.out.println(r);

        while(r.getCars().size()>0){
            r.move();
        }

        System.out.println(r);

        /*
        int totalrevenue = 0;

        
        for(int i = 0; i < 100; i++){
            Road r = new Road(10, 40);
            while(r.getCars().size()>0){
            r.move();
            }
            totalrevenue += r.getRev();
        }
        
        System.out.println(totalrevenue/100);
        */
    }


}
