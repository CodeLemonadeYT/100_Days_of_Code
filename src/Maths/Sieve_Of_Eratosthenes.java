package Maths;

public class Sieve_Of_Eratosthenes {
    public static void primeNumbers(int n){
        boolean [] x = new boolean[n+1];

        for(int i=0; i<=n; i++){
                x[i] = true;
        }
        for(int i = 2; i*i<=n; i++){
            if(x[i] == true)
                for(int j=i*i; j<=n; j+=i){
                        x[j] = false;
                }
        }

        for(int i=0; i<n+1; i++){
            if(x[i]==true)
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int n = 30;
        primeNumbers(n);
    }


}
