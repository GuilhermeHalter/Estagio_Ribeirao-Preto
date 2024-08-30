package Exercicio02;

import java.util.Scanner;

public class VerificarString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um texto: ");
        String texto = sc.nextLine();

        texto = texto.toLowerCase();

        String letra = "a";
        int quantidade = 0;


        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == letra.charAt(0)) {
                quantidade++;
            }
        }
        System.out.println("A letra '" + letra + "' aparece " + quantidade + " vezes no texto.");
    }
}
