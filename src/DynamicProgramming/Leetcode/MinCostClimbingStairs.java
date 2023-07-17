package DynamicProgramming.Leetcode;

public class MinCostClimbingStairs {
    // Recursive Top Down - O(2^n) Time Limit Exceeded
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        return Math.min(minCost(cost, n-1), minCost(cost, n-2));
    }
    private int minCost(int[] cost, int n) {
        if (n < 0) return 0;
        if (n==0 || n==1) return cost[n];
        return cost[n] + Math.min(minCost(cost, n-1), minCost(cost, n-2));
    }
}
