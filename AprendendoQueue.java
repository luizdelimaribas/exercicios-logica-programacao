import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AprendendoQueue {
    public static void main(String [] args){ 
 Queue<String> fila = new LinkedList<>();
 Scanner sc = new Scanner(System.in);


 while (true) {
    System.out.println("Digite um nome a fila de atendimento:");
  String nome = sc.nextLine();
  if (nome.equalsIgnoreCase("stop")) {
    break;
  }
  else {
    fila.add(nome);
  }

 }

 System.out.println(fila);

 // Remove o primeiro da fila
  String primeiro = fila.remove();

  System.out.println("Elemento removido: " + primeiro);

 //Remove  (sem lançar exceção)
 String proximo = fila.poll();

 System.out.println("Próximo elemento: " + proximo);

 // Exibe o elemento da frente sem removê-lo
 String elementoAtual = fila.peek();

 System.out.println("Elemento atual: " + elementoAtual);

 // Verifica se a fila está vazia dando resposta false ou true
 System.out.println("A fila está vazia? " + fila.isEmpty());

 System.out.println(fila);

 // Limpa a fila
        fila.clear();
        System.out.println("Tamanho da fila após limpar: " + fila.size());

  System.out.println(fila);

 sc.close();
    }
}
