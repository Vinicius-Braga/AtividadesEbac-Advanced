package br.com.braga;

public class Fatorial {

    // Método recursivo para calcular o fatorial
    public static long fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

    public static void main(String[] args) {

        System.out.println("Fatorial de 3: " + fatorial(3));
        System.out.println("Fatorial de 7: " + fatorial(7));

        // Testando o fatorial de um número maior (acima de 100)
        System.out.println("Fatorial de 100: " + fatorial(100)); // Isso irá causar uma exceção
    }
}
