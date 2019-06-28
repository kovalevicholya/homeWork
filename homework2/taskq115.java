import java.util.Scanner;

public class taskq115 {
   
    public static void main(String[] args) {
           
                Scanner in = new Scanner(System.in);                            
                System.out.print("Input m: ");
                int m = in.nextInt();
                System.out.print("Input n: ");
                int n = in.nextInt();
                double x;
                x=Math.pow(m,n);
                double y;
                y=Math.pow(2,x);
                System.out.println(y);
        in.close();       
    }
}