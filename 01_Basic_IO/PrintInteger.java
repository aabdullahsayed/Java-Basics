import java.util.Scanner;

/**
 * Java Program to Print an Integer Entered by the User
 * 
 * This program demonstrates basic input/output operations in Java by:
 * 1. Prompting the user to enter an integer
 * 2. Reading the integer input
 * 3. Printing the entered integer back to the console
 * 
 */

public class PrintInteger {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner uin = new Scanner(System.in);
        
        // Prompt the user to enter an integer
        System.out.print("Please enter an integer: ");
        
        // Read the integer input
        int number = uin.nextInt();
        
        // Print the entered integer
        System.out.println("You entered: " + number);
        
        // Close the scanner to prevent resource leak
        uin.close();
    }
}

/* Example Usage:

1. Compile:
javac PrintInteger.java

2. Run:
java PrintInteger

3. Sample Input/Output:
Please enter an integer: 42
You entered: 42

*/