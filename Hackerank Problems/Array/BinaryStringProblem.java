import java.util.*;

public class BinaryStringProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            int maxCoins = 0;

            for (int zeroCount = 0; zeroCount <= N; zeroCount++) {
                int oneCount = N - zeroCount;

                // Option 1: all 0s first then all 1s → only 01 pairs
                int value01 = zeroCount * A + oneCount * B + zeroCount * oneCount * C;

                // Option 2: all 1s first then all 0s → only 10 pairs
                int value10 = zeroCount * A + oneCount * B + zeroCount * oneCount * D;

                maxCoins = Math.max(maxCoins, Math.max(value01, value10));
            }

            System.out.println(maxCoins);
        }
        sc.close();
    }
}
