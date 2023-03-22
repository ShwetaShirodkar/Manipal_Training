import java.util.Scanner;

class ArrayAccess {

    public void FindPositions()

    {

        int[] arr = { 2, 4, 6, 8, 10 }; // Initialize an integer array
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index to access: ");
        int index = scanner.nextInt(); // Index to access

        
        if (index >= 0 && index < arr.length) {
            int data = arr[index]; // Access the data at the given index
            System.out.println("Data at index " + index + " is: " + data);
        } else {
            System.out.println("Invalid index.");
        }

    }

}

public class ArrayAccessMain {
public static void main(String[] args) {
    ArrayAccess a = new ArrayAccess();
    a.FindPositions();
}
}
