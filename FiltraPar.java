//Filtre números pares em ArrayList.

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FiltraPar {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> lista = new ArrayList<>();
 
 
 while(true){
 System.out.println("Digite os valores a ser verificados ou stop para parar:");
    try{
        int numero = sc.nextInt();
        lista.add(numero);
    }
    catch(InputMismatchException e){
        String stop = sc.nextLine();
        if (stop.equalsIgnoreCase(stop)) {
            break;
        }
    }
 }

 for(int valor : lista){
    if (valor % 2 == 0) {
        System.out.println("O numero " + valor + " é par");
    }
    else{
        System.out.println("O numero " + valor + " não e par");
    }
 }


    sc.close();
    }
    
}
