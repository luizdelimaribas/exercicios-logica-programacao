//Remova valores maiores que 100 em List<Integer> via removeIf.
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class FiltrarLista {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        int valor;
         
      while (true) {
        System.out.println("Digite um valor para colocar na lista ou stop para encerrar:");
        try{
            valor = sc.nextInt();
            lista.add(valor);
        }
        catch(InputMismatchException e){
          String stop = sc.nextLine();
          if (stop.equalsIgnoreCase(stop)) {
            break;
          }
        }
      }

     // Remove todos os números menores que 100
     lista.removeIf(numero -> numero > 100);

      System.out.println(lista);
  
        sc.close();    
        
    }
}
