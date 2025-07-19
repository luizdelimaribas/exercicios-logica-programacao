//Conte dígitos de um número inteiro.

import java.util.Scanner;

public class Contador_Numero {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.println("Digite um numero inteiro:");
int numero = sc.nextInt();

String numero_String = Integer.toString(Math.abs(numero));

int numero_digitos = numero_String.length();

System.out.println("A quantidade de diigtos é: " + numero_digitos);

sc.close();
}
    
}