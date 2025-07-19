//Receba N valores (onde N é informado pelo usuário),
// armazene-os em um array e calcule a soma total.

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SomaNumeroArray {
    public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   ArrayList<Integer> valores = new ArrayList<>();

   while (true) {
    System.out.println("Digite um valor ou stop para finalizar: ");
    
   try{ 
    int numero = sc.nextInt();
    
    valores.add(numero);

    //exiba os valores digitados
    System.out.println("Valores digitados: " + valores);

   }   
    //verifique se o usuario deseja parar
    catch (InputMismatchException e){
         String stop = sc.nextLine();
    if (stop.equalsIgnoreCase("stop")) {
        break;
    }

   }

    }

    //calcule a soma total
    int soma = 0;
    for (int valor : valores) {
     soma += valor;
     }

     System.out.println("Os valores somados: " + soma);
    
     sc.close();
}

}