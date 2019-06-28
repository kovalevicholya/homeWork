import java.util.Scanner;
 
public class taskb122 {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
            System.out.println("Input a: ");
            float a = in.nextFloat();
            float x = 12*a*a+7*a-16; 
            System.out.println(x);
        in.close();
    }
}