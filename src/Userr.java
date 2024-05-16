import java.util.Scanner;

public class Userr {
    public static void Srray() {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
     // Add a newline for clarity

        // Create a new array and copy elements from arr to arr2
        int[] arr2 =arr.clone();

        arr2[0] = 77;
        arr2[1] = 44;

        // Print the elements of arr2

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }

        // Modify arr2 to demonstrate it's a separate copy

        System.out.println(); // Add a newline for clarity
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String args[]) {
        Srray();
    }
}
