public class RideshareTester {
    


    public static void main(String[] args) {

        //refer to README to understand the codeblock
        /* 
        System.out.println("Rideshare Project");
        System.out.println();


        Road r = new Road(20, 50);
        System.out.println(r);

        while(r.getCars().size()>0){
            r.move();
        }

        System.out.println(r);
        */
        



        /*  */ //codeblock the following code to run the first bit that is already commentblocked
        double totalrevenue = 0;

        
        for(int i = 0; i < 100; i++){
            Road r = new Road(10, 40); //change the car and passenger amount here (myCarAmt, passAmt)
            while(r.getCars().size()>0){
            r.move();
            }
            totalrevenue += (r.getRev())/20; //change the 20 here to reflect the carAmt
        }
        
        System.out.println("Rideshare Project ");
        System.out.print("The revenue per car is: ");
        System.out.println(totalrevenue/100);
        
    }


}
