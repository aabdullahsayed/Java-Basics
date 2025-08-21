import java.util.Scanner;
public class MultiplicationTable{
    
    static void table(int n){
        
        for(int i=1; i<=10;i++){
            
            System.out.print(n+" + "+i+" = "+i*n);
        }
    }
    
    public static void main(String[] args){
        
        Scanner uin = new Scanner(System.in);
        
        int a = uin.nextInt();
        table(a);
        
    }
}
