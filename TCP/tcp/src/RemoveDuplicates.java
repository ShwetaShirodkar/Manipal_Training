import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array elements separated by commas: ");
        String[] input = scanner.nextLine().split(",");
        List<String> list = Arrays.asList(input);
        List<String> result = removeDuplicates(list);
        if (result.size() == input.length) {
            System.out.println("Error: No duplicates found in the array");
        } else {
            System.out.print("Array with unique elements: ");
            for (String s : result) {
                System.out.print(s + " ");
            }
        }
    }
    
    private static List<String> removeDuplicates(List<String> list) {
        Set<String> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }
}
