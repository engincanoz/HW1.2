package Assignment2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InitialzeArray {
    public static void initArr(String[] args) {
        
        Scanner scan = new Scanner( System.in );
        System.out.println("Please enter the array length: ");
        int arrLen = scan.nextInt();

        int[] intArr = new int[arrLen];
        Random rand = new Random();


        for(int i = 0; i < intArr.length; i++) {
            intArr[i] = rand.nextInt(101); 

        }
        
        System.out.println(Arrays.toString(intArr));



        scan.close();

    }
}
