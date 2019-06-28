import java.util.Scanner;
 
public class taska45 {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.print("Input x: ");
        int x = in.nextInt();
        int y;
            if(x<2) {
            y = x;
            }
            else {
            y=2;
            }
 System.out.println(y);
        in.close();
    }
}