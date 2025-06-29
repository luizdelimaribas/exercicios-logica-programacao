//Leia 10 números inteiros em um array e exiba-os na ordem inversa.

import java.util.Scanner;

public class Exercicio1Lista {
public static void main(String args[]){
 Scanner sc = new Scanner(System.in);

 int[] numeros  = new int[10];
 

 //Leia 10 números inteiros
 System.out.println("Digite a seguencia de 10 numeros: ");
 for(int i = 0; i < 10; i++){
    System.out.println("Numero " + (i + 1) + ": ");
    numeros[i] = sc.nextInt();
 }

 System.out.println("Os numeros são: ");
 for(int numero : numeros){
    System.out.print(numero + " - ");
 }
 

 sc.close();
}
    
}