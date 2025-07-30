//Faça for para imprimir números pares até 100.

import java.util.Scanner;

public class ImprimirNumerosPares {
    public static void main(String[] args){
 Scanner sc = new Scanner(System.in);

 int numero = 0; 

 System.out.println("Digite a quantidade um numeral para verificar:");
 numero = sc.nextInt();

   if (numero < 0){
    System.out.println("O numero " + numero + " e negativo não pode tem que ser um numero possitivo.");
 return;
}
 

 for(int i = 1; i <= numero; i++){
    if (i % 2 == 0) {
        System.out.println("O numero " + i + " é par");
    } 
}

 sc.close();
    
}
}
