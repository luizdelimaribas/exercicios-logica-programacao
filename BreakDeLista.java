//Leia lista e use break ao encontrar zero.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BreakDeLista {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       List<Integer> numeros = new ArrayList<>();

      System.out.println("Digite um numero para somar a lista ou 0");
       
      while (true) {
        Integer numero = sc.nextInt();
        if (numero == 0) {
            break;  
        }
        numeros.add(numero);

      }
       
      System.out.println(numeros); 
      

      sc.close();
       
    }
}

