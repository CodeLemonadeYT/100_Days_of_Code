package DynamicProgramming.Problems;

import java.util.Arrays;

public class SubsetSum {
    public static boolean equalSubsetSum(int[] val, int W){
        boolean[][] t = new boolean[val.length+1][W+1];

        boolean result = false;

        for(int i=0; i<val.length; i++){
            t[i][0] = true;
        }

        for(int i=1; i<=val.length; i++){
            for(int j=1; j<=W; j++){
                    if(val[i-1]<=j){
                        t[i][j] = t[i-1][j-val[i-1]] || t[i-1][j];
                    }else{
                        t[i][j] = t[i-1][j];
                    }
                    result = t[i][j];
                }
            }
        return result;
    }
    public static void main(String[] args) {


        int [] val = {1,4,5,7};
        int W = 19;

        System.out.println(equalSubsetSum(val, W));

    }
}
