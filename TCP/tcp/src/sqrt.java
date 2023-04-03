import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class SquareArray {
    public void printSquare(Integer[] arr) {
        if (arr.length <= 0) {
            System.out.println("Error: Bad Array");
        } else {
            List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
            List<Integer> squareList = list.stream().map(x -> x * x).collect(Collectors.toList());
            System.out.println(squareList);
        }
    }
}

public class Main {
    public void helperFunction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length:");
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        SquareArray sa = new SquareArray();
        sa.printSquare(arr);
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.helperFunction();
    }
}

