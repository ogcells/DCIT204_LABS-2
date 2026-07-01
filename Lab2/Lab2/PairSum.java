import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Target Sum: ");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n && !found; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("\n--- Pair Found ---");
                    System.out.println("Index " + i + " (Value: " + arr[i] + ") + Index " + j + " (Value: " + arr[j] + ") = " + target);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("\nNo matching pair found for target sum " + target + ".");
        }

        sc.close();
    }
}
