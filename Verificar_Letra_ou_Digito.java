//Use Character para verificar se um char é letra ou dígito.

import java.util.Scanner;

public class Verificar_Letra_ou_Digito {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
 
   char digito = '2';
   char letra = 'a';
   
   System.out.println("Digite um caractere:");
   char caractere = sc.next().charAt(0);

   
   System.out.println("Digite um novo caractere:");
   char caractere2 = sc.next().charAt(0);

   System.out.println(letra + " é letra? " + Character.isLetter(letra));

   System.out.println(caractere + " é letra? " + Character.isLetter(caractere));

   System.out.println(caractere2 + " é digito? " + Character.isDigit(caractere2));

   System.out.println(digito + " é dígito? " + Character.isDigit(digito));

  
    sc.close();  
    }
}
