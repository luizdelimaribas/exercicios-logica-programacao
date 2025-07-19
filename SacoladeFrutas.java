//uma lista de 3 frutas o cliente escole qual quer comprar,
// e o programa exibe as frutas escolhidas como sacola .

import java.util.ArrayList;
import java.util.Scanner;

public class SacoladeFrutas {
    public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 ArrayList<String> sacolaFrutas = new ArrayList<>();

 //uma lista de 3 frutas
 System.out.println("As frutas disponiveis sao: 1- Maçã, 2- Banana, 3- Laranja, 4- finalizar sacola de compras");

 // cliente escole qual quer comprar
 while (true) {
 System.out.println("Escolha as frutas que deseja comprar:");
 int escolha = sc.nextInt();
  if ( escolha == 1) {
     sacolaFrutas.add("maçã");
    }
   else if( escolha == 2 ){
    sacolaFrutas.add("banana");
 }
   else if( escolha == 3 ){
    sacolaFrutas.add("laranja");
 }
   else if( escolha == 4){
 System.out.println("Sua sacola de frutas contém:" + sacolaFrutas);
 break;  
 }
  else{
    System.out.println("Opção inválida, tente novamente.");
 }


 }


 sc.close();
    }
    
}
