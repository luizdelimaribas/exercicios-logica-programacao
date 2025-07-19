//Some os dígitos de um número.
//pedir numero -> dividir numero em digitos -> somar os digitos -> aprensentar o resultado


import java.util.Scanner;

public class Soma_Digitos {
    public static void main (String [] args){
 Scanner sc = new Scanner(System.in);
 
 int soma = 0; 

 //pedir numero
 System.out.println("Digite um numero com mais de um digito: ");
int numero = sc.nextInt();

 numero = Math.abs(numero); // Garante que o número seja positivo


 //dividir numero em digitos
String numeroString = Integer.toString(numero);
 
for(int i = 0; i < numeroString.length(); i++){
  //Obtém o caractere/digito na posição i
    char digitoChar = numeroString.charAt(i);
  
  //Converte o caractere para um valor inteiro correspondente.
  int digito = Character.getNumericValue(digitoChar);  

  //somar os digitos
 soma += digito;
}

 //aprensentar o resultado
 System.out.println("A soma dos digitos do numero " + numero + " é : " + soma);


  sc.close();
    }
    
}
