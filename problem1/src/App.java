/*
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class App {
    public static void main(String[] args) throws Exception {

        int multiplesSum = 0;
        
        for (int i = 0; i < 1000; i++){
            
            if(i % 3 == 0 || i % 5 == 0){
                multiplesSum += i;
            }
        }
        
        System.out.println(multiplesSum);
    }
}
