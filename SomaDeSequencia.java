//Use while para somar números de 1 até n.

import java.util.Scanner;

public class SomaDeSequencia {
    public static void main(String[] args){
 Scanner sc = new Scanner(System.in);

 //pedido de quantos numeros a somar
 System.out.println("Quantos numeros você quer somar:");
 int numero =sc.nextInt();

 //se numero for negativo ou zero imprimir mensagem de invalido e encerar o loop
 if (numero <= 0) {
    System.out.println("Numero invalido tente um numero possitivo");
    return;
 }

 //o loop com while para soma

 int i = 0, soma = 0;
while (i < numero) {
    i++;
    System.out.println(i);
 soma += i;   
 
}

//imprimir a soma
 System.out.println("A somar números de 1 até " + numero + " é " + soma);
 sc.close();
 
    }

    }

