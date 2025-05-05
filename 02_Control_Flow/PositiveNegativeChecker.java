 import java.util.Scanner;

public class PositiveNegativeChecker{
    
    static void check(int x){
        
        if(x>0)
        {
            System.out.print("Positive");
}
        else if (x==0){
            System.out.print("Neutral number");
        }
        else {
            System.out.print("Negative");
        }
        }
            
    
    public static void main(String[] args){
        
        Scanner uin = new Scanner(System.in);
        
        int a = uin.nextInt();
        
        check(a);
        
    }
}
