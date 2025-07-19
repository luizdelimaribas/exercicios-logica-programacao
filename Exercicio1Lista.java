//Leia 10 números inteiros em um array e exiba-os na ordem inversa.

import java.util.ArrayList;
import java.util.Scanner;

class Exercicio1Lista{
   public static void main(String args[]){

   Scanner sc = new Scanner(System.in);
ArrayList<Integer> numeros = new ArrayList<>();

//quantidade de numeros a serem lidos
System.out.println("Quantos numeros deseja?");
 int quantidade = sc.nextInt();

 //Leia 10 números ou mais inteiros
System.out.println("Digite os numeros:");
  for(int j = 0 ; j < quantidade; j ++){
      int numero = sc.nextInt();
      numeros.add(numero);
  }

 System.out.println(numeros.size() + " numeros digitados:");
 
 //exiba-os na ordem
 System.out.println(numeros);

 // exiba-os na ordem inversa.
   System.out.println("Numeros na ordem inversa:");
   for(int i = numeros.size() - 1; i >= 0; i--){
       System.out.print(numeros.get(i) + " ");
   }

sc.close();
}
}