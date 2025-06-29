//um algoritmo que converta um valor em minutos para segundos.

import java.util.Scanner;

public class ConvercaoSegundos {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

int minutos, segundos;



System.out.println("Quantos minutos vôce quer converte em segundos: ");
minutos = sc.nextInt();

segundos = 60 * minutos;


System.out.println("Serão " + segundos + " segundos");

sc.close();
}
    
}