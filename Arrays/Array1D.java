import java.util.*;
import java.util.Arrays;

public class Array1D {
    public static void main(String[] args) {
        int[] arr = { 7, 8, 9, 7, 3, 4 };
        System.out.println(arr); // garbage values
        System.out.println(Arrays.toString(arr)); // original array in []

        for (int p : arr) {
            System.out.print(p); // printing value of each element
            System.out.print(" ");
        }
        System.out.println(" ");

    }

}
