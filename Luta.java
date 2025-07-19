 /*lembrete utilizar => continue; quando a entrada e inválida 
 para Voltar para o início do loop */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Luta{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
        int golpe;
 
        int vidaEnimigo = 100;

 System.out.println("Escolha um golpe:");
 System.out.println("1 - Soco de direita");
 System.out.println("2 - Soco de esquerda");
 System.err.println("3 - Chute direita");
 System.err.println("4 - Chute esquerda");
 
  while (true) {
    
     try{
     golpe =  sc.nextInt();

     }
     catch(InputMismatchException e){
          System.out.println("Entrada inválida! Por favor, um golpe valido.");
            sc.next(); // Limpa o buffer do scanner 
            continue; // Volta para o início do loop 
     }

      switch (golpe) {
        case 1:
            System.out.println("Você deu um soco de direita!");
            vidaEnimigo -= 10;
            break;
            case 2:
            System.out.println("Você deu um soco de esquerda!");
            vidaEnimigo -= 10;
            break;
            case 3:
            System.out.println("Você deu um chute de direita!");
            vidaEnimigo -= 10;
            break;
            case 4:
            System.out.println("Você deu um chute de esquerda!");
            vidaEnimigo -= 10;
            break;
        default:
            System.out.println("Opção inválida, tente novamente.");
            continue; // Volta para o início do loop
            
      }
    
        if (vidaEnimigo <= 0) {
           System.out.println("Você venceu a luta!");
           break; // Encerra o loop se o inimigo for derrotado            
        }
  }

 sc.close();
        System.out.println("Fim do jogo!");
}
}
