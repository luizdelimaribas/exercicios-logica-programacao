//Imprima ou retorne um array na ordem reversa.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Inverter_array {
    public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 ArrayList <Integer> lista =  new ArrayList<Integer>();

 for(int x = 0 ; x < 10 ; x ++ ){
 System.out.println("Digite os numeros para a lista:");
 int numero = sc.nextInt();

 lista.add(numero);
}

 System.out.println("Lista original: " + lista);

 Collections.reverse(lista);

 System.out.println("Lista invertida: " + lista);

 sc.close();
    }
    
}
