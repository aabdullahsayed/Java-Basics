import java.util.scanner;

 public class EvenOddChecker{

    public static void main(string[] args){
        Scanner uin = new Scanner(System.in);
        int a = uin.nextInt();

        if (a%2 == 0){
            system.out.print(a+"is Even");
        }

        else if(a==0){System.out.print(a+"is not even/odd");}

        else {System.out.print(a+" is odd");}


        uin.close();
    }

  
 }
