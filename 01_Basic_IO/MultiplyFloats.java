import java.util.Scanner;

public class MultiplyFloats {
     
    static void multiply(float a,float b){
        System.out.println(a*b);
    }

    public static void main(String[] args){
      Scanner uin = new Scanner(System.in);

    float x = uin.nextFloat();
    float y = uin.nextFloat();


        multiply(x , y);
        uin.close();

    }
}
