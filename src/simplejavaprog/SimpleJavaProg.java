package simplejavaprog;

import java.util.Random;

/**
 *
 * @author Nips
 */
public class SimpleJavaProg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random coolNumber = new Random();
        int x  = coolNumber.nextInt(6) +1;
               
        System.out.println("You rolled a " +x);
    }
    
}
