import java.util.*;

public class TwoSumProblemUsingHashMap {
    // Optimized twoSum using HashMap
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // value -> index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }

        return new int[] {}; // No pair found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Show input array
        System.out.print("Input array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        // Input target value
        System.out.println("Enter target value:");
        int target = sc.nextInt();

        // Solve
        TwoSumProblemUsingHashMap tsp = new TwoSumProblemUsingHashMap();
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
