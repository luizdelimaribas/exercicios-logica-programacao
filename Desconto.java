import java.util.Scanner;

public class Desconto {
    public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 int valor, desconto, valorDescontado, novoValor;  

 System.out.println("Qual o valor do produto: ");
 valor = sc.nextInt();

 System.out.println("Qual a porcetangem de desconto:");
 desconto = sc.nextInt();
  
 valorDescontado = valor * desconto / 100;
 novoValor = valor - valorDescontado;

 System.out.println("O produto de valor R$" + valor + " com o desconto de " + desconto + 
 "% vai ter o valor de R$" + valorDescontado + " retirado então seu novo valor sera de R$" + novoValor);

 sc.close();
    }
    
}
