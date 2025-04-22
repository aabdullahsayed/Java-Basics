
import java.util.Scanner;
public class ComputeQuotientRemainder {
    
    public static void main(String[] args){
        Scanner uin = new Scanner(System.in);

        System.out.println("Enter dividend : ");
        int a = uin.nextInt();

        System.out.println("Enter Divisor : ");
        int b = uin.nextInt();

        float Quotient = a/b;
        float Reminder = a%b ;

        System.out.println("Quotient = "+Quotient);
        System.out.println("Reminder = "+Reminder);


        
    }
}
