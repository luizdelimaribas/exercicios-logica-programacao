//um programa que leia dois valores e informe qual é o maior.

import java.util.Scanner;

public class NumeroMaior {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    int numero1 , numero2;

System.out.println("Digite o primeiro numero: ");
 numero1 = sc.nextInt();

 System.out.println("Digite o segundo numero: ");
 numero2 = sc.nextInt();

 if (numero1 > numero2) {
    System.out.println("O primeiro numero " + numero1 + " e maior que o segundo " + numero2);
    
 }
 else{
    System.out.println("O segundo numero " + numero2 + " e maior que o primeiro " + numero1);
 }

 sc.close();
  }  
}
