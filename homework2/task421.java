import java.util.Scanner;
 
public class task421 {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = in.nextInt();
        System.out.print("Input b: ");
        int b = in.nextInt();
        int c=b%a;
            if(c==0) {
            System.out.println("TRUE");
            }
            else {
            System.out.println("FALSE");
            }
         in.close();
    }
}