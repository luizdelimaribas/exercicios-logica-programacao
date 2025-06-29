//algoritmo que leia o ano de nascimento de uma pessoa e calcule sua idade atual.

import java.util.Scanner;

public class Idade {
    public static void main(String args[]){
  Scanner sc = new Scanner(System.in);

 int data_nascimento, data_atual = 2025, idade;

 //leia o ano de nascimento de uma pessoa
   System.out.println("Qual o ano de nascimento da pessoa: ");
 data_nascimento = sc.nextInt();

 //calcule sua idade atual
 idade = data_atual - data_nascimento;

 System.out.println(" A idade da pessoa e : " + idade);


    }
    
}
