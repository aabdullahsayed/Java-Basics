import java.util.Scanner;
public class CountDigits{

    static void digits(int a)
    {

        if(a == 0) System.out.print(1);
  int count = 0;
        while(a>0){

            a = a/10;
            count++;

        }
System.out.print("Number of digits :"+count);

    }
    public static void main(String[] args) throws Exception{

        Scanner uin = new Scanner(System.in);

        int n = uin.nextInt();

        digits(n);

    }
}
