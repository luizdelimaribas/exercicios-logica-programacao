import java.util.Scanner;

//receba um número inteiro e informe se ele é par ou ímpar.


public class NumeroPar {
    public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    int numero;

    //receba um número inteiro
System.out.println("Digite um numero: ");
numero = scanner.nextInt();

//informe se ele é par ou ímpar.
if (numero % 2 == 0){
    System.out.println("O numero " + numero + " e par");
} 

else {
    
     System.out.println("O numero "+ numero + " e impar");
 }

 scanner.close();

    }
}
