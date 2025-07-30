//Use do-while para repetição até o usuário digitar “sair”.

import java.util.Scanner;

public class RepeticaoDoWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 String  letra ;

 do{
    System.out.println("Digite uma letra para soma ou digite sair para parar: "  );
    letra = sc.nextLine();
 }
 while(!letra.equalsIgnoreCase("sair"));
 System.out.println("Loop terminado");
 
    }
}