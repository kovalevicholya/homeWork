import java.util.Scanner;
 
public class task18 {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number1: ");
        int num1 = in.nextInt();
        System.out.println("Input a number2: ");
        int num2 = in.nextInt();
        System.out.println("Input a number3: ");
        int num3 = in.nextInt();
        System.out.println("Input a number4: ");
        int num4 = in.nextInt();
        
        System.out.printf("Your number:" + num1 + " " + num2 + " " + num3 + " " + num4);
        in.close();
    }
}