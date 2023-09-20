import java.util.Scanner;

public class menu {

    public static void main(String[] args) {
        
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

            if(choice == 6)
                exit = false;

            if(!exit)
                System.out.println("Goodbye!");  

        }while(exit);
    }
    
}