//ler valor do raio e depois mostrar o valor da area do circulo  com quatro casas decimais 

import java.util.Scanner;

public class AreaCirculo {
    public static void main (String args[]){
Scanner sc = new Scanner (System.in);

Double  raio, area;

//ler valor do raio
System.out.println("Qual o valor do raio: ");

  raio = sc.nextDouble();

//mostrar o valor da area do circulo  com quatro casas decimais

area = 3.14159 * (raio*raio);
System.out.println("raio: "+ raio + " o valor da area: " + area);


  sc.close();

    }
}
