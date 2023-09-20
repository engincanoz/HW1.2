import java.util.Arrays;

public class averageFinder{

    public static int avgfinder(int[] arr){
        
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++){
            
            sum += arr[i];
        }

        int average = sum / arr.length;

        return average;
    }


    public static void arrayConstructor(int[] arr, int average){

        int[] newArray = new int[arr.length];

        for(int i = 0; i < arr.length; i++){

            newArray[i] = arr[i] - average;
        }

        System.out.println(Arrays.toString(newArray));
    }

    
    
}