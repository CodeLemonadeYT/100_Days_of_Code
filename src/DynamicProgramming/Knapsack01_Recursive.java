package DynamicProgramming;

public class Knapsack01_Recursive {
    static int knapsack(int [] wt, int [] val, int W, int n){
        //1. Base condition
        //if either arrays are empty (no items available) || capacity of bag is 0 (W=0, we can't store
        // anything)
        if(n==0 || W == 0) return 0;

        //2. Implementing recursion from last to start
        // Now two cases arise, either we keep the (n-1)st element or reject it
        //Accepting condition is value of knapsack is greater when we decide to include than when reject
        //Hence we call the knapsack() method for both cases and return the max of the two
        if(wt[n-1]<=W){
            return Math.max(val[n-1]+knapsack(wt, val, W-wt[n-1], n-1), knapsack(wt, val, W, n-1));
        }
        //In between if the weight of item exceeds the current capacity of bag, we return simply
        else return knapsack(wt, val, W, n - 1);
    }
    public static void main(String[] args) {
        int [] weight = {1,3,5,4};
        int [] val = {1,4,5,7};
        int weight_bag = 7;
        int n = weight.length;


        System.out.println(knapsack(weight, val, weight_bag, n));
    }
}
