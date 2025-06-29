//um algoritmo que leia um número e informe se ele é múltiplo de 3 e/ou de 5.

import java.util.Scanner;

public class VerificacaoMultiplo {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

int numero , multiplo, resultado;

System.out.println("Digite um numero: ");
numero = sc.nextInt();

System.out.println("Digite um numero multiplicador para verificar: ");
multiplo = sc.nextInt();

resultado = numero % multiplo;

  if (resultado == 0) {
    System.out.println("O numero " + numero + " é divisivel por " + multiplo);
    }
  else{System.out.println("O numero " + numero + " não e divisivel por " + multiplo);}
 
    

sc.close();
} 
}
