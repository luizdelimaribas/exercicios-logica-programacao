//Crie lista com números pares usando stream().filter().

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterComStream {
    public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 List<Integer> lista = new ArrayList<>();

 int numero;

 while (true) {
    System.out.println("Digite um numero para lista ou stop para encerrar:");
 try{
  numero = sc.nextInt();
  lista.add(numero);
 }
 catch(InputMismatchException e ){
    String stop = sc.nextLine();
    if (stop.equalsIgnoreCase(stop)) {
        break;
    }
 }

 }

  List<Integer> listaPar = lista.stream() 
  .filter(numeros -> numeros % 2 == 0)
   .collect(Collectors.toList());

 System.out.println(listaPar);

 sc.close();
    }
}
