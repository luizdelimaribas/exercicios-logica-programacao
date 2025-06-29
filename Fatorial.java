//

//import java.util.Scanner;

//public class Fatorial {
  //  public static void main(String args[]){
   // Scanner sc = new Scanner(System.in);
     
    //int numero, x, fatorado , somademefaturado;
    //int[] semefatorado ;
    
    
    //System.out.println("Qual o numero voçê quer fatoriar: ");
    //numero = sc.nextInt();
    
   // for(x = 1; x < numero; x ++){
    
     //   for (int i = 0; i < semefatorado.length; i ++ ){
       //     somademefaturado += semefatorado[i] ;
      //      }
    
        //semefatorado = numero * (numero - x);
        
        
    //}
    
    
    
    //System.out.println("O numero fatorado e " + fatorado);
    
    
  //  sc.close();
   // }
   // }

   // Java

import java.util.Scanner;

public class Fatorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int numero, x, fatorado = 1; // Inicializa fatorado com 1

        System.out.println("Qual o número que você quer fatoriar: ");
        numero = sc.nextInt();

        for (x = 1; x <= numero; x++) {
            fatorado *= x;
        }

        System.out.println("O número fatorado é " + fatorado);

        sc.close();
    }
}