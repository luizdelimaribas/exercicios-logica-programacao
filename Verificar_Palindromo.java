//Verifique palíndromo (numero com digitos invertido que permanece o mesmo ) numérico (ex.: 121).
//pedir numero => inverter o numero => 
//verificar se numero invertido e palindromo => informa verdadeiro ou falso 

import java.util.Scanner;

public class Verificar_Palindromo {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

 int numero, palindromo = 0;
 

 //pedir numero
 System.out.println("Informe um numero para verificar se e palindromo:");
 numero = sc.nextInt();

 int numeroUso = numero;
//inverter o numero
 while (numeroUso > 0) {
    palindromo *= 10;
    palindromo += (numeroUso % 10);
    numeroUso /= 10;
 }

 //verificar se numero invertido e palindromo
 if (palindromo == numero) {
    System.out.println("O numero " + numero + " e um palindromo " + palindromo);
    
 }
else{
    System.out.println("O numero " + palindromo + " não e palindromo");
}

    sc.close();
    }
}
