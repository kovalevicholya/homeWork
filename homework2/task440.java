import java.util.Scanner;
 
public class task440 {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.print("Input x: ");
        float x = in.nextFloat();
            float y;
            if(x>=-2.4&&x<=5.7) {
            y=x*x;
                 }
            else {
            y=4;
                 }
            System.out.println(y);
         in.close();
    }
}