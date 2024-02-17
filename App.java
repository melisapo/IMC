import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {     
        System.out.println("Enter your weight in kilograms and your height in meters separated by renglons");
        Scanner sc = new Scanner(System.in);
        double weight= sc.nextDouble();
        double height =sc.nextDouble();
        System.out.println(CalculateIndexOfCorporalMass(weight,height));
    }
    private static double CalculateIndexOfCorporalMass(double weight, double height){
        return weight/Math.pow(height,2);
    }
}
