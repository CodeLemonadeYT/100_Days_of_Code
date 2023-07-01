package Maths;

import java.util.Arrays;

//Sieve of Arestosthenes
public class PrimeNumber {
    public static void SieveOfEratosthenes(int srt, int n)
    {
        // Create a boolean array "prime[srt to n]" and
        // initialize all entries it as true. A value in
        // prime[i] will finally be false if i is Not a
        // prime, else true.
        boolean[] prime = new boolean[n + 2];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;

        for (int p = 2; p * p <= n; p++) {
            // If prime[p] is not changed, then it is a
            // prime
            if (prime[p] == true) {
                // Update all multiples of p greater than or
                // equal to the square of it numbers which
                // are multiple of p and are less than p^2
                // are already been marked.
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }

        // Print all prime numbers
        for (int p = srt; p <= n; p++) {
            if (prime[p]) {
                System.out.print(p + " ");
            }
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        int srt = 1;
        int end = 10;
        SieveOfEratosthenes(srt, end);
    }
}
