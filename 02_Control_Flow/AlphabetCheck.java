 import java.util.Scanner;

public class AlphabetCheck {
    public static void main(String[] args) {
        
        Scanner uin = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char input = uin.next().charAt(0); 
        /
        if ((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z')) {
            System.out.println(input + " is an alphabet.");
        } else {
            System.out.println(input + " is not an alphabet.");
        }

        
        uin.close();
    }
}

