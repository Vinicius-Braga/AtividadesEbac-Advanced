package br.com.braga;

import java.math.BigInteger;

public class FatorialBottomUp {

    public static BigInteger fatorial(int n) {
        BigInteger[] dp = new BigInteger[n + 1];
        dp[0] = BigInteger.ONE; // Caso base
        dp[1] = BigInteger.ONE;

        // Calcula o fatorial de 2 até n iterativamente
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1].multiply(BigInteger.valueOf(i));
        }

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println("Fatorial de 3: " + fatorial(3)); // 6
        System.out.println("Fatorial de 7: " + fatorial(7)); // 5040
        System.out.println("Fatorial de 100: " + fatorial(100)); // valor muito grande
    }
}
