import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListOperations {
public static void main(String[] args) {
LinkedList<Integer> linkedList = new LinkedList<>();
linkedList.add(10);
linkedList.add(20);
linkedList.add(30);
linkedList.add(40);
linkedList.add(50);
Scanner scanner = new Scanner(System.in);
System.out.println("Initial List: " + linkedList);
System.out.println("Choose an operation to perform:");
System.out.println("1. Add Node");
System.out.println("2. Add at nth index");
System.out.println("3. Update node at nth index");
System.out.println("4. Delete last node");
System.out.println("5. Delete first node");
System.out.println("6. Delete nth node");
int choice = scanner.nextInt();
switch (choice) {
case 1:
System.out.println("Enter the element to add:");
int elementToAdd = scanner.nextInt();
linkedList.add(elementToAdd);
break;
case 2:
System.out.println("Enter the element to add:");
int elementToAddAtIndex = scanner.nextInt();
System.out.println("Enter the index to add at:");
int indexToAdd = scanner.nextInt();
linkedList.add(indexToAdd, elementToAddAtIndex);
break;
case 3:
System.out.println("Enter the index to update:");
int indexToUpdate = scanner.nextInt();
System.out.println("Enter the new value:");
int newValue = scanner.nextInt();
linkedList.set(indexToUpdate, newValue);
break;
case 4:
linkedList.removeLast();
break;
case 5:
linkedList.removeFirst();
break;
case 6:
System.out.println("Enter the index to delete:");
int indexToDelete = scanner.nextInt();
linkedList.remove(indexToDelete);
break;
default:
System.out.println("Invalid choice!");
break;
}
System.out.println("Updated List: " + linkedList);
}
}