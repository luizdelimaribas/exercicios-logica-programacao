//um algoritmo que leia um valor de salario e mostre-o com um aumento em porcetagem

import java.util.Scanner;

public class Aumento {
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);

 float salario, aumento_porcetagem, salario_final, aumento;

 //leia um valor de salario e um aumento em porcetagem
 System.out.println(" Qual o salario: ");
 salario = sc.nextFloat();

 System.out.println( " Qual a porcetagem do aumento: ");
 aumento_porcetagem = sc.nextFloat();

 aumento = salario * aumento_porcetagem /100;

 salario_final = salario + aumento;

 //mostre-o salario com um aumento em porcetagem

 System.out.println("O aumento em " + aumento_porcetagem + " % do salario e de R$ " 
 + aumento + " dando um total de R$ " + salario_final + " a receber.");


        sc.close();
    }
    
}
