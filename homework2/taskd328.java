import java.util.Scanner;
 
public class taskd328 {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.print("Input A: ");
        int A = in.nextInt();
        System.out.print("Input B: ");
        int B = in.nextInt();
        System.out.print("Input C: ");
        int C = in.nextInt();
                if(A<50&&B>50&&C>50||A>50&&B<50&&C>50||A>50&&B>50&&C<50) {
                System.out.println("TRUE");
                             }
            else {
                System.out.println("FALSE");
                 }
        in.close();
    }
}