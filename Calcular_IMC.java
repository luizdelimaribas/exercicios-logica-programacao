//Calcule IMC a partir de peso/altura e escolha categoria.

import java.util.Scanner;

public class Calcular_IMC {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        System.out.println("Qual o peso em Kg: ");
        float peso = sc.nextFloat();

        System.out.println("Qual a altura metros: ");
        float altura = sc.nextFloat();

        //Calcule IMC a partir de peso/altura
        float IMC = peso / (altura * altura); 

        System.out.println("O IMC : " + IMC + " Kg/m².");


       // Classificação do IMC:
       //Menos de 18,5: Abaixo do peso.
       if (IMC < 18.5 ) {
        System.out.println("Abaixo do peso");
       }
       //18,5 a 24,9: Peso normal.
       
       else if (IMC >= 18.5 && IMC <= 24.9 ) {
        System.out.println("Peso normal");
       }
       //25 a 29,9: Sobrepeso.
       
       else if (IMC >= 25 && IMC <= 29.9) {
        System.out.println("Sobrepeso");
       }
       //30 a 34,9: Obesidade grau I.
       
       else if (IMC >= 30 && IMC <= 34.9) {
        System.out.println("Obesidade grau I");
       }
       //35 a 39,9: Obesidade grau II.
       
       else if (IMC >= 35 && IMC <= 39.9 ) {
        System.out.println("Obesidade grau II");
       }
       //40 ou mais: Obesidade grau III (mórbida)
       
       else {
        System.out.println("Obesidade grau III (mórbida)");
       }

     sc.close();
    }
}
