package DynamicProgramming.Problems;

import static DynamicProgramming.Problems.SubsetSum.equalSubsetSum;

public class EqualSumPartition {
    public static boolean equalSumPartition(int [] arr){
        boolean op = false;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        if(sum%2 !=0){
            return false;
        }else{
            //Now this has been converted to SubSetSum variation, where required sum is target.
            int target = sum/2;

            return equalSubsetSum(arr, target);
        }

    }
    public static void main(String[] args) {
        int [] arr = {1,5,5,1,7};

        System.out.println(equalSumPartition(arr));
    }
}
