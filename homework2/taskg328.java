import java.util.Scanner;
 
public class taskg328 {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.print("Input A: ");
        int A = in.nextInt();
        System.out.print("Input B: ");
        int B = in.nextInt();
        System.out.print("Input C: ");
        int C = in.nextInt();
        int A1=A%3;
        int B1=B%3;
        int C1=C%3;
            if(A1==0&&B1==0&&C1==0) {
                System.out.println("TRUE");
                             }
            else {
                System.out.println("FALSE");
                 }
        in.close();
    }
}