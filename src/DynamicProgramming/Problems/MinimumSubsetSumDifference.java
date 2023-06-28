package DynamicProgramming.Problems;

import java.util.ArrayList;

public class MinimumSubsetSumDifference {
    public static void subsetSum(int [] arr){

        ArrayList<Integer> li = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            li.add(sum);
            sum+=arr[i];
        }
        System.out.println(minSum(li,sum));
    }
    static int minSum(ArrayList<Integer> li, int range){
        int minsum = Integer.MAX_VALUE;

        for (int i=0; i<li.size(); i++){
            minsum = Math.min(minsum, range-(2*li.get(i)));
        }
        return minsum;
    }

    public static void main(String[] args) {

        int [] arr = {1,2,7};
        subsetSum(arr);

    }
}
