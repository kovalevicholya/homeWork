import java.util.Scanner;
 
public class taske328 {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.print("Input A: ");
        int A = in.nextInt();
        System.out.print("Input B: ");
        int B = in.nextInt();
        System.out.print("Input C: ");
        int C = in.nextInt();
                if(A<0||B<0||C<0) {
                System.out.println("TRUE");
                             }
            else {
                System.out.println("FALSE");
                 }
        in.close();
    }
}