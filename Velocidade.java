import java.util.InputMismatchException;
import java.util.Scanner;

public class Velocidade {
    public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
        int velocidade = 0, acao;

    System.out.println("Digite 1 para acelerar ou 2 para frear:");
    while (true) {
        
       try{ acao = sc.nextInt();
       }
        catch(InputMismatchException e){
            System.out.println("Entrada inválida! Por favor, digite 1 para acelerar ou 2 para frear.");
            sc.next(); // Limpa o buffer do scanner 
            continue; // Volta para o início do loop 
        }
        
        switch (acao) {
            case 1:
            System.out.println("Você acelerou!");
            velocidade += 10;
             break;    
             case 2:
            System.out.println("Você desacelerou!");
            velocidade -= 10;
             break;
        
            default:
               System.out.println("Opção inválida, tente novamente.");
               continue; // Volta para o início do loop
        }

          System.out.println(null + "Velocidade atual: " + velocidade + " km/h" );

    }




    }
    
}
