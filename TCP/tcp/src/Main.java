//Sqrt of array



// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;
// import java.util.stream.Collectors;

// public class Main {
    
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter a list of numbers (maximum length 10), separated by commas:");
//         String input = scanner.nextLine();
//         List<Integer> numbers = parseInput(input);
//         if (numbers == null) {
//             System.out.println("Error: bad input");
//             return;
//         }
//         List<Integer> squares = numbers.stream()
//                 .map(x -> x * x)
//                 .collect(Collectors.toList());
//         System.out.println("Squared numbers: " + squares);
//     }

//     private static List<Integer> parseInput(String input) {
//         String[] parts = input.split(",");
//         if (parts.length > 10) {
//             return null;
//         }
//         List<Integer> numbers = new ArrayList<>();
//         for (String part : parts) {
//             try {
//                 double number = Double.parseDouble(part.trim());
//                 numbers.add((int) number);
//             } catch (NumberFormatException e) {
//                 return null;
//             }
//         }
//         return numbers;
//     }
// }



import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,2,4,5,10);
        if (input.size() > 10) {
            System.out.println("Error Bad Array");
            return;
        }
        List<Integer> output = input.stream().map(x -> (int) (x * x)).collect(Collectors.toList());
        for (int i = 0; i < output.size(); i++) {
            System.out.print(output.get(i));
            if (i < output.size() - 1) {
                System.out.print(",");
            }
        }
    }
}

