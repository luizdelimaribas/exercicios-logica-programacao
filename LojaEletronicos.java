// uma lista de 3 eletronicos o cliente escole qual quer comprar,
// e o programa exibe as escolhidas no carrinho(usar while, try, switch,
// case, cath e default para escolhas invalidas) .

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LojaEletronicos {
    public static void main(String [] args){
 Scanner sc = new Scanner(System.in);
 ArrayList<String> carrinho = new ArrayList<>();

  while(true){
    System.out.println("Escolha seu produto:");
    System.out.println("Produto1 - 1");
    System.out.println("Produto2 - 2");
    System.out.println("Produto3 - 3");
    System.out.println("Ver carrinho - 4"); 
    System.out.println("Sair - 5:");

   try{
    int escolha = sc.nextInt();
    
    switch (escolha) {
        case 1:
            carrinho.add("Televisão");
            break;
        case 2:    
            carrinho.add("Radio");
            break;
        case 3:
            carrinho.add("Aspirador");
            break;
          case 4:
            System.out.println("Seu carrinho tem os seguintes produtos: " + carrinho);
            sc.close();
            return;    
        default:
            System.out.println("Escolha inválida, tente novamente.");
            
    }
   }
    catch(InputMismatchException e ){
        System.out.println("Entrada inválida! Digite apenas escolha inválida, tente novamente.");
                sc.next();
    }

}


  

}
    
}
