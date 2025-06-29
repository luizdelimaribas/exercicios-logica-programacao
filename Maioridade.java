//um programa que pergunte a idade do usuário e informe se ele é maior ou menor de idade.

import java.util.Scanner;

public class Maioridade {
  public static void main(String args[]){
Scanner sc = new Scanner(System.in);

int idade;


System.out.println("Qual a sua idade: ");
 idade = sc.nextInt();

 if (idade < 18) {
    System.out.println(" Vôce tem " + idade + " anos é menor de idade " );
 }

else{
   System.out.println(" Vôce tem " + idade + " anos é maior de idade ");
}

    sc.close();
  }  
}
