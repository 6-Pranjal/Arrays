import java.util.Arrays;

public class ArrayEquality {
    // Example of polymorphism.

    public static void equality(int a[], int b[]) {
        if (a.equals(b)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void equality(int a[][], int b[][]) {
        if (a.equals(b)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        System.out.println("Checking equality of two arrays");
        System.out.println("-----------------------------------------------------");

        int arr[] = { 3, 5, 7, 8, 9 };
        int brr[] = { 5, 3, 55, 3, 4 };

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));
        equality(arr, brr);

        int crr[][] = {
                { 4, 5, 6, 7 },
                { 6, 5, 3, 2 }
        };

        int drr[][] = {
                { 4, 5, 6, 7 },
                { 6, 5, 3, 2 }
        };

        System.out.println(Arrays.deepToString(crr));
        System.out.println(Arrays.deepToString(drr));
        equality(crr, drr);

    }
}
