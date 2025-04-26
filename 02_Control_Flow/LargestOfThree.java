import java.util.Scanner;

public class LargestOfThree{
    
   static void largest(int x,int y, int z){
        
        if(x>y && x>z){
            System.out.print("The largest number is: X ");
        }
        
        else if(y>x && y>z){
            System.out.print("The largest number is: Y");
        }
        
        else{
            System.out.print("The largest number is: Z");
        }
    }
    
    public static void main(String[] args){
        
        Scanner uin = new Scanner(System.in);
        
        int a = uin.nextInt();
        int b = uin.nextInt();
        int c = uin.nextInt();
        
        largest(a,b,c);
        
        
    }
}
