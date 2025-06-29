//Escreva um algoritmo que converta graus Celsius para Fahrenheit e vice-versa.

import java.util.Scanner;


public class ConvertaGraus {
    public static void main(String args[]){
  Scanner sc = new Scanner(System.in);

 double graus, grausFahrenheit;
 int temperatura;

 System.out.println(" Quantos graus :");
 graus = sc.nextDouble();

 
 System.out.println("Qual converção vôce quer  1-Celsius ou 2-Fahrenheit : ");
  temperatura = sc.nextInt();

 if(temperatura == 1){
  System.out.println("A temperatura esta " + graus + " graus Celsius");
 }
  else if(temperatura == 2){
    grausFahrenheit = (graus * 9/5) + 32;
    System.out.println("A temperatura esta " + grausFahrenheit + " graus Fahrenheit");
  }
  else{
    System.out.println("Opção errada escolha uma opção valida: ");
  }


  sc.close();
 } 

 }



