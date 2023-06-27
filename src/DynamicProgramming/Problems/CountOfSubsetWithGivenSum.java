package DynamicProgramming.Problems;

public class CountOfSubsetWithGivenSum {
    public static int countSubset(int [] val, int W){
        int count = 0;

        int [][] t = new int[val.length+1][W+1];

        for(int i=0; i<val.length; i++){
            t[i][0] = 1;
        }

        for(int i=1; i<=val.length; i++){
            for(int j=1; j<=W; j++){
                if(val[i-1] <= j){
                    t[i][j] = t[i-1][j-val[i-1]] + t[i-1][j];
                }else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t[val.length][W];
    }
    public static void main(String[] args) {
        int [] val = {1,4,5,7};
        int W = 12;

        System.out.println(countSubset(val, W));

    }
}
