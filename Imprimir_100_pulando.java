//Imprima números de 1 a 100, pulando múltiplos de 5.

public class Imprimir_100_pulando {
    public static void main(String args[]){

     int n;   

 //para cada numero começando em 1 ate 100 soma/pula de 5 em 5

 for( n = 1  ; n <= 100 ; n ++ ){
    if (n % 5 != 0) {
  
        System.out.println( n );
    }
     
 }

 
    }
    
}
