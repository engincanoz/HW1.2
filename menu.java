import java.util.Scanner;

public class menu {

    public static void displayMenu(int[] array) {
        
        boolean exit = true;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Menu options:\n" + 
                                "1) Find min value of the array.\n" +
                                "2) Find max value of the array.\n" +
                                "3) Find the average of the array.\n" +
                                "4) Find the sum of elements with odd-numbered indexes.\n" +
                                "5) Find the sum of elements with even-numbered indexes.\n" +
                                "6) Quit.");
            int choice = scan.nextInt();

            if(choice == 1){
                findMinMax.findMin(array);
            }
            else if(choice == 2){
                findMinMax.findMax(array);
            }


            if(choice == 4){
                findOddEvenSum.sumOdd(array);
            }
            else if(choice == 5){
                findOddEvenSum.sumEven(array);
            }

            else if(choice == 6)
                exit = false;

            if(!exit)
                System.out.println("Goodbye!");  

        }while(exit);
    }
    
}