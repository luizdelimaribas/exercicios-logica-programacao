//peça uma lista de nomes e verifique se o nome informado é igual ao nome correto
// se for igual, exiba uma mensagem de sucesso.

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NomeCerto {
    public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 ArrayList<String> nomes = new ArrayList<>(); 

 while (true) {
 //peça uma lista de nomes
 System.out.println("Digite os nomes (digite 'fim' para encerrar): ");

 try{
    String nome  = sc.nextLine();
    nomes.add(nome);

    //exiba os nomes digitados
 System.out.println("Nomes digitados: " + nomes);

 //verifique se o nome informado é igual ao nome correto
    if (nome.equalsIgnoreCase("Luiz")) {
        //exiba uma mensagem de sucesso.
        System.out.println("Que nome bonito! " + nome);
        
    }

}
  //verifique se o usuario deseja parar
    catch (InputMismatchException e){
        String fim = sc.nextLine();
        if (fim.equalsIgnoreCase("fim")) {
            break;
        }
    }

  

 }
 


 



  sc.close();
    }
    
}
// correção:import java.util.ArrayList;
//import java.util.Scanner;

//public class NomeCerto {
  //  public static void main(String[] args) {
    //    Scanner sc = new Scanner(System.in);
      //  ArrayList<String> nomes = new ArrayList<>(); 

        //while (true) {
          //  System.out.println("Digite um nome (ou digite 'fim' para encerrar): ");
            //String nome = sc.nextLine();

            // Verifica se o usuário quer parar
            //if (nome.equalsIgnoreCase("fim")) {
              //  break;
            //}

            //nomes.add(nome);

            // Exibe os nomes digitados
            //System.out.println("Nomes digitados: " + nomes);

            // Verifica se o nome é "Luiz"
            //if (nome.equalsIgnoreCase("Luiz")) {
              //  System.out.println("Que nome bonito! " + nome);
            //}
        //}

        //sc.close();
    //}
//}
// Correção: O código agora verifica se o usuário deseja encerrar digitando "fim" e exibe os nomes corretamente.