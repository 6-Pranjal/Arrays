import java.util.Arrays;

public class ElementCopying {
    public static void main(String[] args) {
        System.out.println("Printing of array");
        int[] arr = { 5, 7, 9, 0, 4, 1, 4, 6, 8 };
        System.out.println("Array_1");
        System.out.println(Arrays.toString(arr));

        System.out.println("-------------------------------------------------");
        int[][] arr2 = { // Area is Bookshelf
                { 56, 6, 78, 8, 7, 3 },
                { 6, 7, 5, 7, 68, 6, 8 }
        };
        System.out.println("Array_2");
        System.out.println(Arrays.deepToString(arr2));

        System.out.println("----------------------------------------------------");
        System.out.println("copying an element of array to another array");
        int brr[];
        brr = Arrays.copyOf(arr, 6);
        System.out.println(Arrays.toString(arr));
        System.out.println("copying Array_1 to create new array");
        System.out.println(Arrays.toString(brr));

        brr = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(brr));

        System.out.println("--------------------------------------------------");
        System.out.println("Copy of array element in range last element excluded");
        int crr[];
        crr = Arrays.copyOfRange(arr, 2, 8);
        System.out.println(Arrays.toString(crr));

    }
}
