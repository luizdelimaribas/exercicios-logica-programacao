//ler um numero e verificar se e negativo ou não e informar ao cliente 

import java.util.Scanner;

public class NumeroNegativo {
    public static void main(String args[]){
 Scanner sc = new Scanner(System.in);

 int numero;

 //ler um numero
 System.out.println("Digite um numero: ");
 numero = sc.nextInt();

 //verificar se e negativo ou não e informar ao cliente 
 if (numero < 0){
    System.out.println("O numero " + numero + " e negativo.");}
    
    else if(numero == 0){
        System.out.println("O numero " + numero + " não e negativo e nem possitivo.");
    }
    
    else {
  System.out.println("O numero e " + numero + " e possitivo.");    
 }

 sc.close();

    }
}
