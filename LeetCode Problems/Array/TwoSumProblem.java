import java.util.*;

public class TwoSumProblem {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) { // Avoid self-pair and duplicates
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {}; // No valid pair found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Array size input
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        // Array element input
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Show array input
        System.out.print("Input array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        // Target input
        System.out.println("Enter target value:");
        int target = sc.nextInt();

        // Solve
        TwoSumProblem tsp = new TwoSumProblem();
        int[] result = tsp.twoSum(arr, target);

        // Print result
        if (result.length == 2) {
            System.out.println("Indices of elements that sum to target:");
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No two elements found with the given target sum.");
        }
    }
}
