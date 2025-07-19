//pedir uma lista de numeros interos e verificar qual é o maior
// e o menor

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ComparadorNumerico {
    public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 ArrayList<Integer> numeros = new ArrayList<>();
 int maior = 0;
 int menor = 0;

while (true) {
    

 System.out.println("Digite numeros inteiros (digite stop para sair):");

try{ int numero = sc.nextInt();

 numeros.add(numero);

    if (maior == 0 || numero > maior){
        maior = numero;
    }
    if (menor == 0 || numero < menor) {
        menor = numero;
    }

 System.out.println("O maior numero é: " + maior);
 System.out.println("O menor numero é: " + menor);
 }

     catch (InputMismatchException e) {
        String stop = sc.nextLine();
    if (stop.equalsIgnoreCase("stop")) {
        break;
        
    }
  }

 
 }



 sc.close();
    
    }    

}


