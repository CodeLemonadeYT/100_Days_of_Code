package DynamicProgramming;

public class Knapsack01_TopDown {
    static int knapsack_topDown(int [] wt, int [] val, int W, int  n, int [][] t){
        for (int i= 1; i<n+1; i++) {
            for (int j = 1; j < W + 1; j++) {
                if (i == 0 || j == 0) t[i][j] = 0;

                if (wt[i - 1] <= j) {
                    t[i][j] = Math.max(val[i - 1] + t[i - 1][j - wt[i - 1]], t[i - 1][j]);
                } else
                    t[i][j] = t[i - 1][j];
            }
        }
        return t[n][W];
    }

    public static void main(String[] args) {
        int [] weight = {1,3,5,4};
        int [] val = {1,4,5,7};
        int weight_bag = 7;
        int n = weight.length;

        int [][] t = new int[n+1][weight_bag+1];
        System.out.println(knapsack_topDown(weight, val, weight_bag, n, t));
    }
}




































































































































