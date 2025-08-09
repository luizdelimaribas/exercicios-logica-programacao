//Conte frequência de palavras com HashMap.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequenciaPalavras {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        String texto = null;
        Map<String, Integer> contadorPalavras = new HashMap<>();

          System.out.println("O texto a analisar");
          texto = sc.nextLine();

          // Converte para minúsculas e divide em palavras
          String[] palavras = texto.toLowerCase().split("\\s+");

          for(String palavra : palavras){
             // Se a palavra já existe no HashMap, incrementa a contagem.
            // Caso contrário, adiciona a palavra com contagem 1.
            contadorPalavras.put(palavra, contadorPalavras.getOrDefault(palavra, 0) + 1);
          }
           
          System.out.println( contadorPalavras);

        sc.close();
    }
}
