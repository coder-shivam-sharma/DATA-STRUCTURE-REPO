 import java.util.*;

public class DistinctTwoSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // number of test cases

        while (T-- > 0) {
            int N = sc.nextInt(); // size of array
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            int minLength = Integer.MAX_VALUE;

            // Check all subarrays
            for (int i = 0; i < N; i++) {
                Set<Integer> set = new HashSet<>();
                for (int j = i; j < N; j++) {
                    set.add(A[j]);
                    if (set.size() > 2) break; // too many distinct elements
                    if (set.size() == 2) {
                        minLength = Math.min(minLength, j - i + 1);
                        break; // no need to go further from this i
                    }
                }
            }

            if (minLength == Integer.MAX_VALUE) {
                System.out.println(-1);
            } else {
                System.out.println(minLength);
            }
        }

        sc.close();
    }
}
