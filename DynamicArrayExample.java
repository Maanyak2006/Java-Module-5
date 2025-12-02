import java.util.Scanner;

public class DynamicArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] arr = new int[size];
            System.out.println("Array of size " + size + " created successfully!");
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            }
            System.out.println("Array elements are:");
            for (int i = 0; i < size; i++) {
                System.out.println("Element " + (i + 1) + ": " + arr[i]);
            }

        } catch (NegativeArraySizeException e) {
            System.out.println("Error: Array size cannot be negative.");
        } finally {
            scanner.close();
        }
    }
}
