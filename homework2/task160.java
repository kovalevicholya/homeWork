import java.util.Scanner;
 
public class task160 {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
            System.out.println("Input a: ");
            int a = in.nextInt();
                System.out.println("Input b: ");
                int b = in.nextInt();
                    System.out.println("Input c: ");
                    int c = in.nextInt();
                    b=c;
                    a=b;
                    c=a;
            System.out.println("a=" + a + " b=" + b + " c=" + c);
            
        in.close();
    }
}