import java.util.*;

class MajorityElementsOfArray {
    public List<Integer> findMajority(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int n = nums.length;

        // Count frequency of each element
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Collect elements with frequency > n/3
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > n / 3) {
                result.add(entry.getKey());
            }
        }

        return result;
    }

    public static void main(String[] args) {
        MajorityElementsOfArray sol = new MajorityElementsOfArray();
        int[] nums = {1, 2, 3, 1, 1};
        List<Integer> majority = sol.findMajority(nums);
        System.out.println("Majority Elements (> n/3): " + majority);  // Output: [1]
    }
}
