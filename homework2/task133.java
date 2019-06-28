import java.util.Scanner;
 
public class task133 {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
            System.out.println("Input population: ");
            int population = in.nextInt();
            System.out.println("Input area: ");
            float area = in.nextFloat();
            float populationDensity = population/area; 
            System.out.println("Population Density = "+ populationDensity);
        in.close();
    }
}