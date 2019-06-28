import java.util.Scanner;
 
public class task41 {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.print("Input x: ");
        double x = in.nextDouble();
        double y;
        double z = Math.cos(2*x);
        double c = Math.sin(x*x);
                if(x>0) {
                y=(1-z)/2;
                System.out.println(y);
                             }
            else {
                y=1-2*c;
                System.out.println(y);
                 }
        in.close();
    }
}