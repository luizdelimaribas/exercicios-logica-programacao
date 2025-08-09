//Use stream().max() e stream().min() para encontrar valores.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class EncotrarMaxEMin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
  List<Integer> lista = new ArrayList<>();
 
 int valor;


 while (true) {
     System.out.println("Digite um valor ou stop para encerrar:");
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

 Optional<Integer> maximo = lista.stream()
 .max(Comparator.naturalOrder());  
 //Comparator.naturalOrder() usa a ordem natural dos números (crescente).

 Optional<Integer> minimo = lista.stream()
 .min(Comparator.naturalOrder());

 System.out.println(maximo);
 //Se o Optional contém um valor, ele é extraído com get().
 System.out.println(maximo.get());

 System.out.println(minimo);
 //Se o Optional contém um valor, ele é extraído com get().
 System.out.println(minimo.get());

 sc.close();
    }
}

/*É importante verificar se o Optional retornado contém um valor 
antes de tentar acessar o elemento com get(), pois se o fluxo estiver
 vazio, get() lançará uma NoSuchElementException. */