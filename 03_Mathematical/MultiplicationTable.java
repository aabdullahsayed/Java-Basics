import java.util.Scanner;
public class MultiplicationTable{
    
    
        
      public static Scanner uin = new Scanner(System.in); //global Scanner
    
    static void table(int n){
        
        for(int i=1; i<=10;i++){
            
            System.out.println(n+" X "+i+" = "+i*n);
        }
    }
    
    public static void main(String[] args){
        
       
        
        int a = uin.nextInt();
        table(a);
        
    }
}
