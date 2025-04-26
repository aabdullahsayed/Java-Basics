import java.util.Scanner;

public class LeapYearChecker{
    
    
    static void check( int a){
        
        if((a%4 == 0)&&(a%100 != 0)||(a%400 == 0)){
            System.out.print(a+" is a Leap year");            
        }
        
        else {
            System.out.print(a+" is not a Leap year");
        }
    }
    public static void main(String[] args){
        
        Scanner uin = new Scanner(System.in);
        int x = uin.nextInt();
        
        check(x);
        
    }
}
