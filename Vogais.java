//um programa que conte o número de vogais em uma frase fornecida pelo usuário.

//import java.util.ArrayList;
//import java.util.Scanner;

//public class Vogais {
 //public static void main( String args[]){
   // Scanner sc = new Scanner(System.in);

 //int contador = 0;
 //String palavra;
 
 
 //System.out.println();
 //palavra = sc.nextLine();
 
 
  // Converter a palavra em um array de char
        //char[] arrayChar = palavra.toCharArray();

        // Converter o array em uma lista de char
        //ArrayList<Character> listaChar = new ArrayList<>();
        //for (char c : arrayChar) {
        //    listaChar.add(c);
      //  }

    //for (c in palavra){
       // if(listaChar in ("aeiou"))
     //   contador++;
   // }
 
 

 //System.out.println("Essa palavra tem " + contador + " letras.");
 
// }
//}


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