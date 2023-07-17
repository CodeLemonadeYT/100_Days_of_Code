package Maths;


//Multiple methods like sliding window/two pointers, recursion, two variables etc are available.
//Most efficient in terms of time complexity is DP.
public class Fibonacci {
    public static int printFibonacci(int n, int [] fib){

        if(n==0) return n;
        if(n==1) return n;

        fib[0] = 0;
        fib[1] = 1;

        for(int i=2; i<=n; i++){
            fib[n] = fib[n-1]+fib[n-2];
        }
        return fib[n];
    }
    public static void main(String[] args) {
        int n = 10;
        int [] fib = new int[n+1];

        for (int i=0; i<n; i++){
            System.out.print(printFibonacci(i,fib)+" ");
        }
    }
}
