import java.util.Scanner;

public class taskh115 {
   
    public static void main(String[] args) {
           
                Scanner in = new Scanner(System.in);                            
                System.out.print("Input a: ");
                int a = in.nextInt();
                System.out.print("Input b: ");
                int b = in.nextInt();
                System.out.print("Input c: ");
                int c = in.nextInt();
                double y;
                y=(-b+1/a)/(2/c);
                System.out.println(y);
                                     
        in.close();       
    }
}