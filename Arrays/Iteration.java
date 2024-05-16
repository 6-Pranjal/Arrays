import java.util.Arrays;
import java.util.*;

public class Iteration {
    public static void main(String[] args) {
        System.out.println("Printing of array");
        int[] arr = { 5, 7, 9, 0, 4, 1, 4, 6, 8 };
        System.out.println(Arrays.toString(arr));

        System.out.println("Iteration using enhanced for loop in 1D array");
        for (int i : arr) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println(" ");

        System.out.println("-------------------------------------------------");
        int[][] arr2 = { // Area is Bookshelf
                { 56, 6, 78, 8, 7, 3 },
                { 6, 7, 5, 7, 68, 6, 8 }
        };
        System.out.println(Arrays.deepToString(arr2));
        System.out.println("Iteration using enhanced for loop in N-D array");
        for (int[] row : arr2) { // Row are Blocks of bookshelf
            for (int element : row) { // Elements are books
                System.out.print(element);
                System.out.print(" ");
            }
        }

    }
}
