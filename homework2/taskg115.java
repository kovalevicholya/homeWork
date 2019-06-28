import java.util.Scanner;

public class taskg115 {
   
    public static void main(String[] args) {
           
                Scanner in = new Scanner(System.in);                            
                System.out.print("Input a: ");
                int a = in.nextInt();
                System.out.print("Input b: ");
                int b = in.nextInt();
                System.out.print("Input c: ");
                int c = in.nextInt();
                float z;
                z=b*b-4*a*c;
                double y;
                y=(-b+Math.sqrt(z))/2*a;
                System.out.println(y);
                                 
        in.close();       
    }
}