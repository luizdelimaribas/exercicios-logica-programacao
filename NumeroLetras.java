//um programa que peça ao usuário para inserir uma palavra e informe quantas letras ela tem.

import java.util.Scanner;

public class NumeroLetras {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);


System.out.println("Digite uma palavra: ");
 String palavra = sc.nextLine();

 int numeroLetras = palavra.length();

System.out.println("A palavra " + palavra + " tem " + numeroLetras + " letras.");

sc.close();
}
}
