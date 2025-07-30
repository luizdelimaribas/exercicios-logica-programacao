

import java.util.Scanner;

public class Vogais {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        int contadorVogais = 0;
        frase = frase.toLowerCase(); // Converter para minúsculas para facilitar a verificação

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contadorVogais++;
            }
        }

        System.out.println("Número de vogais na frase: " + contadorVogais);
    }
}