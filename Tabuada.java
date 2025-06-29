//Crie um programa que gere a tabuada de um número escolhido pelo usuário, de 1 a 10

import java.util.Scanner;

public class Tabuada {
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);

    int numero, tabuada, resultado;



 //um número escolhido pelo usuário   
 System.out.println("A tabuada do numero: ");
  numero = sc.nextInt();

 //um programa que gere a tabuada
 for (tabuada = 1; tabuada < 11; tabuada ++){

    resultado = numero * tabuada;

  System.out.println("A tabuada de " + numero + " x " + tabuada + " = " + resultado);

}

sc.close();

 }
    
}