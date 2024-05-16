import java.util.Arrays;

public class ArraynD {
    public static void main(String[] args) {
        int[][] arr2 = {
                { 3, 5, 7, 5, 7 },
                { 7, 9, 2, 3, 5 },
                { 6, 3, 5, 2, 2 }
        };
        System.out.println(" ");
        System.out.println(Arrays.deepToString(arr2)); // For printing array with[]

        // For printing elements of array
        // arr2=Library row=shelf e=book

        for (int[] row : arr2) {
            System.out.println("Row");
            System.out.println(Arrays.toString(row));
            for (int e : row) {

                System.out.print(e);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    }
}
