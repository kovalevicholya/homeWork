import java.util.Scanner;
 
public class taskv328 {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.print("Input A: ");
        int A = in.nextInt();
        System.out.print("Input B: ");
        int B = in.nextInt();
            if(A>0||B>0) {
                System.out.println("TRUE");
                             }
            else {
                System.out.println("FALSE");
                 }
        in.close();
    }
}