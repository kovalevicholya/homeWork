import java.util.Scanner;

public class taskf115 {
   
    public static void main(String[] args) {
           
                Scanner in = new Scanner(System.in);                            
                System.out.print("Input a: ");
                int a = in.nextInt();
                System.out.print("Input b: ");
                int b = in.nextInt();
                double y;
                y=(5.45*(a+2*b))/(2-a);
                System.out.println(y);
                            
        in.close();       
    }
}