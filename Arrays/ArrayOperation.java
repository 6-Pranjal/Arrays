import java.util.*;
import java.util.Arrays;

public class ArrayOperation {
    public static void main(String[] args) {
        System.out.println("Operations on array");
        System.out.println(" ");
        System.out.println("--------------------------------------------");
        System.out.println("Array to string conversion 1-D");
        int[] arr = { 5, 7, 9, 0, 4, 1, 4, 6, 8 };
        String S_arr = Arrays.toString(arr);
        System.out.println(S_arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("----------------------------------------------");

        System.out.println("Arrays to string conversion N-D");
        int[][] arr2 = {
                { 56, 6, 78, 8, 7, 3 },
                { 6, 7, 5, 7, 68, 6, 8 }
        };
        String S_arr2 = Arrays.deepToString(arr2);
        System.out.println(S_arr2);
        System.out.println(Arrays.deepToString(arr2));

        System.out.println("------------------------------------------------");
        System.out.println("Sorting of array");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("--------------------------------------------------");
        System.out.println("Filling an entire array with a particular number");
        Arrays.fill(arr, 98);
        System.out.println(Arrays.toString(arr));
    }
}
