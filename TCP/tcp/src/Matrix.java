import java.util.Scanner;

public class Matrix {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int[][] matrix = new int[2][2];
for (int i = 0; i < 2; i++) {
    for (int j = 0; j < 2; j++) {
       // System.out.print("Enter element at row " + (i+1) + " column " + (j+1) + ": ");
        System.out.print((i+1) + + (j+1));

        int input = scanner.nextInt();
        if (input < 1 || input > 9) {
            System.out.println("Bad Element");
            return;
        }
        matrix[i][j] = input;
    }
}

System.out.println("Matrix:");
for (int i = 0; i < 2; i++) {
    for (int j = 0; j < 2; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
}
}