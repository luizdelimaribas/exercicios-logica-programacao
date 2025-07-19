//Determine se um ano é bissexto.
//Pedir ano -> verificar se e bissexto -> informar o resultado

import java.util.Scanner;

public class Determinar_Ano_Bissexto {
    public static void main (String[] args){
  Scanner sc = new Scanner(System.in);
 int ano = 0;
 

 System.out.println("Digite o ano a qual quer verificar:");
 ano = sc.nextInt();

 // verificar se e bissexto
 //Se o ano for divisível por 4: Pode ser bissexto.
 //Se o ano também for divisível por 100: Não é bissexto, a menos que...
 //Se o ano também for divisível por 400: É bissexto.
 //formula para verificar se e bissexto(ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)
 boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
 
if(bissexto) {
    System.out.println("O ano " + ano + " é bissexto"); 
 }
 else{
    System.out.println("O ano " + ano + " não é bissexto");
 }
 
  

  sc.close();
    }
    
}