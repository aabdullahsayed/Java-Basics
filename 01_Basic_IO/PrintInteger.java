
import java.util.Scanner;


public class PrintInteger {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner uin = new Scanner(System.in);
        
        
        System.out.print("Please enter an integer: ");
        
        // Read the integer input
        int number = uin.nextInt();
        
        // Print the entered integer
        System.out.println("You entered: " + number);
        
        // Close the scanner to prevent resource leak
        uin.close();
    }
}

