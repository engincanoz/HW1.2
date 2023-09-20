import java.util.Arrays;
import java.util.Random;

public class InitializeArray {
    public static int[] initArr() {

        final int ARRAY_LENGTH = 10;
        int[] intArr = new int[ARRAY_LENGTH];
        Random rand = new Random();
        
        for(int i = 0; i < intArr.length; i++) {
            intArr[i] = rand.nextInt(101); 

        } 
        return intArr;
        
    }
}
