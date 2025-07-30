//Crie if/else if/else para categorizar idade (criança, adulto, sênior).

import java.util.Scanner;

public class CategoriaDeIdade {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

int idade = 0;

//pedir a idade
System.out.println("Qual a sua idade:");
idade = sc.nextInt();

//loop if/else de categoria de idade)criança, adulto, sênior)
if (idade >= 18 && idade <= 59) {
    System.out.println("Você tem " + idade + " anos então é adulto");
}
 else if (idade >= 60) {
    System.out.println("Você tem " + idade + " anos então é sênior");
} 
 else if (idade < 0) {
    System.out.println("Sua idade não pode ser negativo ."); 
}
else {
    System.out.println("Você tem " + idade + " anos então é criança");
}


sc.close();
}
    
}
