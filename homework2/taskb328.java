import java.util.Scanner;
 
public class taskb328 {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.print("Input A: ");
        int A = in.nextInt();
        System.out.print("Input B: ");
        int B = in.nextInt();
        int A1 = A%2;
        int B1 = B%2;
            if(A1==0||B1==0) {
                System.out.println("TRUE");
                             }
            else {
                System.out.println("FALSE");
                 }
        in.close();
    }
}