import java.util.Scanner;
 
public class task485 {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.print("Input x: ");
        float x = in.nextFloat();
            float y;
            if(x<-1) {
            y=-1;
                     }
            else {
                if(x>-1) {
                y=x;
                         }
            else {
            y=1;
                 }
                 }
            System.out.print(y);

            in.close();
    }
}