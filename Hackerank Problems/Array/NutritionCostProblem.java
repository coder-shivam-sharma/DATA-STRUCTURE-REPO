import java.util.*;

public class NutritionCostProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int C = sc.nextInt();

            int[] A = new int[N];
            int[] B = new int[N];

            for (int i = 0; i < N; i++) A[i] = sc.nextInt();
            for (int i = 0; i < N; i++) B[i] = sc.nextInt();

            // Get minimum cost for each distinct vitamin
            Map<Integer, Integer> minCost = new HashMap<>();
            for (int i = 0; i < N; i++) {
                int vit = A[i];
                int cost = B[i];
                minCost.put(vit, Math.min(minCost.getOrDefault(vit, Integer.MAX_VALUE), cost));
            }

            // Get all distinct vitamin costs and sort them
            List<Integer> costs = new ArrayList<>(minCost.values());
            Collections.sort(costs);

            int maxVal = 0;
            int totalCost = 0;
            for (int i = 0; i < costs.size(); i++) {
                totalCost += costs.get(i);
                int x = i + 1; // number of vitamins
                int value = C * x - totalCost;
                maxVal = Math.max(maxVal, value);
            }

            System.out.println(maxVal);
        }

        sc.close();
    }
}
