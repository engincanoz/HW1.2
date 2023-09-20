import java.util.Arrays;

public class averageFinder{

    public static double avgfinder(int[] arr){
        
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++){
            
            sum += arr[i];
        }

        double average = (double)sum / arr.length;

        return average;
    }


    public static void arrayConstructor(int[] arr, double average){

        double[] newArray = new double[arr.length];

        for(int i = 0; i < arr.length; i++){

            newArray[i] = average - arr[i];
        }

        System.out.println(Arrays.toString(newArray));
    }

    
    
}