//Use Queue<String> (LinkedList) para simular fila de atendimento.

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaDeAtendimento {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Queue<Integer> fila = new LinkedList<>();

        int escolhaAtendimento, atendimento = 0;

      while (true) {

        System.out.println("Qual opção você escolhe: ");
        System.out.println("1 - Adicionando um atendimento");
        System.out.println("2 - Mostrar a fila");
        System.err.println("3 - Proximo numero para atender");
        System.err.println("4 - Remover atendimento atual da fila");

        try{
         escolhaAtendimento = sc.nextInt();
        }
        catch(InputMismatchException e ){
            System.out.println("Entrada inválida! Por favor, um golpe valido.");
           sc.next();
           continue;
        }

        switch (escolhaAtendimento) {
            case 1:
               System.out.println("Adicionando um atendimento a fila :");    
               atendimento += 1;  
               fila.add(atendimento);          
                break;
            case 2:
            System.out.println(fila);
            break;
            case 3:
            int atendido = fila.peek();
            System.out.println("Proximo numero [" + atendido + "] comparecer ao balcão para atendimento");
            break;
            case 4:
            int removidoAtendimento = fila.poll();
            System.out.println("O atendimento numero " + removidoAtendimento + " foi removido da fila");
            break;

        default:
            System.out.println("Opção inválida, tente novamente.");
            continue; // Volta para o início do loop
        }

        if (fila.size() <= 0) {
            System.out.println("Fila zerada parabens!");
            break;
        }
      }

     
      sc.close();
    }
    
}
