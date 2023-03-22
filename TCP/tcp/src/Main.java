import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of numbers (maximum length 10), separated by commas:");
        String input = scanner.nextLine();
        List<Double> numbers = parseInput(input);
        if (numbers == null) {
            System.out.println("Error: bad input");
            return;
        }
        List<Double> squares = numbers.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
        System.out.println("Squared numbers: " + squares);
    }

    private static List<Double> parseInput(String input) {
        String[] parts = input.split(",");
        if (parts.length > 10) {
            return null;
        }
        List<Double> numbers = new ArrayList<>();
        for (String part : parts) {
            try {
                double number = Double.parseDouble(part.trim());
                numbers.add(number);
            } catch (NumberFormatException e) {
                return null;
            }
        }
        return numbers;
    }
}
