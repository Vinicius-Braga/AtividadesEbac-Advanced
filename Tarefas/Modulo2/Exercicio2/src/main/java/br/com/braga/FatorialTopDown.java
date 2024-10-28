package br.com.braga;

import java.util.HashMap;

public class FatorialTopDown {

    // HashMap para armazenar os resultados intermediários (memorização)
    private static HashMap<Integer, Long> memo = new HashMap<>();

    public static long fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        // Verifica se o fatorial de n já foi calculado e está no memo
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // Calcula o fatorial e armazena no HashMap
        long result = n * fatorial(n - 1);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Fatorial de 3: " + fatorial(3)); // 6
        System.out.println("Fatorial de 7: " + fatorial(7)); // 5040
        System.out.println("Fatorial de 100: " + fatorial(100)); // valor muito grande
    }
}
