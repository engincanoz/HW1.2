package Assignment2;

import java.util.Arrays;
import java.util.Random;

public class InitialzeArray {
    public static void initArr(String[] args) {

        final int ARRAY_LENGTH = 10;
        int[] intArr = new int[ARRAY_LENGTH];
        Random rand = new Random();
        
        for(int i = 0; i < intArr.length; i++) {
            intArr[i] = rand.nextInt(101); 

        }
        
        System.out.println(Arrays.toString(intArr));
        
    }
}
