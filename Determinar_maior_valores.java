import java.util.Scanner;

public class Determinar_maior_valores {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);

 int valor_maior = 0;

 System.out.println("Quantos digitos vc quer?");
 int digitos = sc.nextInt();

 for(int x = 1 ; x <= digitos ; x ++){
    System.out.println("Digite um numero: ");
    int valor = sc.nextInt();

    
    if (valor >  valor_maior) {
        valor_maior = valor; 
    }

  System.out.println("O maior valor dos digitatos é: " + valor_maior);

}

  

        sc.close();
    }
    
}
