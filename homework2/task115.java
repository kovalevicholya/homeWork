import java.util.Scanner;

public class task115 {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.print("Input x: ");
        int x = in.nextInt();
        float y;
        y=(-1)/(x*x);
        System.out.println(y);
            
        in.close();       
    }
}