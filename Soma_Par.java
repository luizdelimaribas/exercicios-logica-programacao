//Somatório condicional (ex.: soma pares de 1 a N).

import java.util.Scanner;

public class Soma_Par {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

      int soma = 0 ;

      //leitura de n
     System.out.println("Digite a quantida de de ditgitos a verificar se e par e somar:");
      int numero = sc.nextInt();

    
     //soma pares de 1 a N
      for(int i = 1; i <= numero; i++){
        if (i % 2 == 0) {
            soma+=i;
            //print dos valores a ser somados
            System.out.println("Valor a ser somados: " + i);
        }
      }
   
      //resultado da soma
      System.out.println("Resultado da soma:" + soma);

        sc.close();
    }
}
