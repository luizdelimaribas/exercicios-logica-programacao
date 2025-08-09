//Leia até 5 valores e use continue para ignorar negativos


import java.util.Scanner;

public class ContinueIgnorarNegativos {
    public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
  int[] numeros = {3,1,5,-7,8};

  for(int numero : numeros){
  if (numero < 0) {
    continue;
  }
  System.out.println("Numero: " + numero);
  }
  

 


 sc.close();
    }
}
