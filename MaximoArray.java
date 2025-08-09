//Encontre o máximo em um array.

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MaximoArray {
    public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 ArrayList<Integer> lista = new ArrayList<>();

 int maximo = 0;

 while (true) {
    System.out.println("Digite um valor ou stop para encerrar:");
    try{
        int valor = sc.nextInt();
        lista.add(valor);
    }
    catch(InputMismatchException e){
        String stop = sc.nextLine();
        if (stop.equalsIgnoreCase(stop)) {
            break;
        }
    }
 }

 for(int numero : lista){
   
    if (numero > maximo) {
        maximo = numero;
    }
 }

 System.out.println("O máximo do array é: " + maximo);

  sc.close();
    }
}
