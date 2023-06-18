package DynamicProgramming;

import java.util.Arrays;

public class Knapsack01_Memoized {
    //we store each recursive-function-return-value in a matrix so that if needed further
    //the value is directly picked from the matrix for use rather than running the recursive function again

    static int knapsack(int[] wt, int [] val, int W, int n, int [][] t){
        //1. Base condition
        //if either arrays are empty (no items available) || capacity of bag is 0 (W=0, we can't store
        // anything)
        if(n==0 || W == 0) return 0;

        //If this recursion value is already available, directly return from matirx
        if(t[n][W] != -1) return t[n][W];

        //else need to perform recursion and store the value at corresponding index
        //Same code as recursion, just storing the value in matrix
        if(wt[n-1]<=W){
            return t[n][W] = Math.max(val[n-1]+knapsack(wt, val, W-wt[n-1], n-1, t), knapsack(wt, val, W, n-1, t));
        }
        //In between if the weight of item exceeds the current capacity of bag, we return simply
        else return t[n][W] = knapsack(wt, val, W, n - 1, t);
    }

    public static void main(String[] args) {

        int [] weight = {1,3,5,4};
        int [] val = {1,4,5,7};
        int weight_bag = 7;
        int n = weight.length;
        int[][] t = new int[n+1][weight_bag+1];

        //Filling array with value '-1'. two ways:
        //-----------------------------------------------
        for(int[] row :t){
            Arrays.fill(row,-1);
        }
        //Arrays.stream(t).forEach(a -> Arrays.fill(a, -1));
        //-----------------------------------------------

        System.out.println(knapsack(weight, val, weight_bag, n, t));

    }

}
