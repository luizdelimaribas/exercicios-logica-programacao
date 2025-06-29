// um algoritmo que receba dois números e exiba a soma deles.

import java.util.Scanner;

public class Soma {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int numero1, numero2, soma ;


System.out.println("Escreva uma numero: ");
numero1 = sc.nextInt();

System.out.println("Escreva um segundo numero: ");
numero2 = sc.nextInt();

soma = numero1 + numero2;

System.out.println("A soma dos numeros " + numero1 + " e " + numero2 + " é de " + soma);

sc.close();
}
    

}
