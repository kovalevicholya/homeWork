import java.util.Scanner;

public class taskc115 {
   
    public static void main(String[] args) {
           
                Scanner in = new Scanner(System.in);                     
                System.out.print("Input a: ");
                int a = in.nextInt();
                System.out.print("Input b: ");
                int b = in.nextInt();
                System.out.print("Input c: ");
                int c = in.nextInt();
                float y;
                y=(a/b)*c;
                System.out.println(y);            
                    
        in.close();       
    }
}