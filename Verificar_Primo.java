import java.util.Scanner;

public class Verificar_Primo {
    public static void main (String [] args){
     Scanner sc = new Scanner(System.in);
 
     System.out.println("Digite um numero para verificar se e primo:");
     int numero = sc.nextInt();
     boolean resultado = true;

     Double raiz  = Math.sqrt(numero);

     //para cadar digito de 2 ate a raiz divida o numero e verifique a sobra se for 0 nao e primo
     for(int digito = 2; digito <= raiz; digito ++){
        if ( numero % digito ==  0) {
            resultado = false;
            break;
     }

     }

     if (resultado && numero > 1) {
        System.out.println("O numero " + numero + " e primo");
        
     }

      else{
        System.out.println("O numero " + numero + " não e primo");
        
      }

        sc.close();
    }

}
