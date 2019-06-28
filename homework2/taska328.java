import java.util.Scanner;
 
public class taska328 {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.print("Input A: ");
        int A = in.nextInt();
        System.out.print("Input B: ");
        int B = in.nextInt();
            if(A>100&&B>100) {
                System.out.println("TRUE");
                             }
            else {
                System.out.println("FALSE");
                 }
        in.close();
    }
}