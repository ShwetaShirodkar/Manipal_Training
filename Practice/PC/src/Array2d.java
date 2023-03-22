import java.util.Arrays;
import java.util.stream.IntStream;

public class Array2d 
{

    int[][] arr = {
        { 1, 2 , 3 }, // 0 th
        { 4, 5, 6 }, // 1 st
        { 7, 8 , 9} // 2 nd 
    };

    int sum = Arrays.stream(arr)
            .flatMapToInt(ar -> Arrays.stream(ar))
            .sum();

    IntStream is = IntStream.of(1, 2, 3);
    System.out.println(is.sum());
    
    IntStream is1 = Arrays.stream(arr[0]);
    IntStream is2 = Arrays.stream(arr[1]);
    IntStream is3 = Arrays.stream(arr[2]);

    System.out.println(is1.sum() + is2.sum() + is3.sum());

    int[] a = Arrays.stream(arr)
    .flatMapToInt(ar -> Arrays.stream(ar))
   .toArray();

   System.out.println(Arrays.toString(a));
} 