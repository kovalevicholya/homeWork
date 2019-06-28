import java.util.Scanner;
 
public class taska122 {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.println("Input x: ");
        float x = in.nextFloat();
        float y = 7*x*x-3*x+6; 
        System.out.println(y);
            
        in.close();
    }
}