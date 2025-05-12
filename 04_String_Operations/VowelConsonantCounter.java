import java.util.Scanner;

public class VowelConsonantCounter{
    Scanner uin = new Scanner(System.in);
    String a;
    
     void input(){
       
         System.out.println("Enter the String: ");
       a = uin.nextLine();
        
        
         uin.close();
    }
     
     void display(){
         
         System.out.println("User Input of a string :"+a);
     }
     
    
   public static void main(String[] args){
       
       VowelConsonantCounter obj = new VowelConsonantCounter();
      
       obj.input();
        obj.display();
   }
    
}
