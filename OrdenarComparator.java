//Ordene objetos (Comparator).

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class OrdenarComparator {
public static void main(String[] args){
List<Integer> lista = new ArrayList<Integer>();
Scanner sc =new Scanner(System.in);


//pede os valores e coloca na lista
while (true) {
    System.out.println("Digite um valor para a lista ou stop para encerrar:");
    try{
        int valor = sc.nextInt();
        lista.add(valor);
    }
    catch(InputMismatchException e){
      
    String stop = sc.nextLine().trim();
    if (stop.equalsIgnoreCase(stop)) {
        break;}

    } 
}

/*o método 'compare' define a regra de comparação, neste caso, uma comparação numérica simples. 
O .sort utiliza esta regra para ordenar a lista de inteiros. */
Comparator<Integer> comparador = new Comparator<Integer>() {
    @Override
    public int compare(Integer a, Integer b){
        return a - b; // Ordem crescente
    }
};

 // Ordena a lista usando o Comparator
lista.sort(comparador);


System.out.println(lista);

sc.close();
}
    
}