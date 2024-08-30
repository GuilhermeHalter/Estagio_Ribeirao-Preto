package Exercicio01;

public class Fibonacci {
    public static void main(String[] args) {

        int a, b, auxiliar, i;

        a = 0;
        b = 1;

        System.out.println("Serie de Fibonacci: ");

        for (i = 1; i <= 11; i++) {
            auxiliar = a + b;
            a = b;
            b = auxiliar;

            System.out.println(auxiliar);
        }
    }
}
