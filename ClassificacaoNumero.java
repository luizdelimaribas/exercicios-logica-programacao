//- um algoritmo que leia uma lista de números e classifique-os em ordem crescente.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ClassificacaoNumero {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
ArrayList <Integer> numeros = new ArrayList<>();



System.out.println("Escreva um numero por vez. Para encerrar digite qualquer letra: ");
 while (sc.hasNextInt()) {
 int numero = sc.nextInt();
 numeros.add(numero);
 }

 Collections.sort(numeros);

System.out.println(numeros);

    sc.close();
}


}
    


