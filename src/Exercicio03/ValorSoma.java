package Exercicio03;

public class ValorSoma {
    public static void main(String[] args) {
        int INDICE = 10;
        int SOMA = 0;

        for (int K = 1; K <= INDICE; K++) {
            SOMA = SOMA + K;
        }

        System.out.println("A soma eh " + SOMA);
    }
}
