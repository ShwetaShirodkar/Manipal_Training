// DerivativeOfCosine 

// import java.util.Scanner;

// public class DerivativeOfCosine {
//     public double findDerivative(double x) {
//         // Convert degrees to radians
//         double radians = Math.toRadians(x);

//         // Calculate the derivative of cos(x)
//         double derivative = -1 * Math.sin(radians);

//         return derivative;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("x= ");
//         double x = scanner.nextDouble();
//         scanner.close();

//         DerivativeOfCosine doc = new DerivativeOfCosine();
//         double derivative = doc.findDerivative(x);

//         System.out.printf("The derivative of cos(%.2f) is %.2f", x, derivative);
//     }
// }



import java.util.Scanner;

public class DerivativeOfCosine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.print("Enter the value of x (in degrees): ");
        //System.out.print("x= ");
        double x = input.nextDouble();
        input.close();
        double radians = Math.toRadians(x);
        double derivative = -1 * Math.cos(radians);
        System.out.printf(" %.2f",derivative);
    }
}
