//Use Set<String> para eliminar duplicatas de lista de nomes.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class EliminaDuplicataLista {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 List<String> lista1 = new ArrayList<>();
 List<String> lista2 = new ArrayList<>();

 String nome;

 while (true) {
    System.out.println("Digite um nome para soma as listas ou stop para encerrar:");
 
     nome = sc.nextLine();

     if (nome.equalsIgnoreCase("stop")) {
        break;
    }
     else if (lista1.size() > lista2.size()) {
        lista2.add(nome);
    }
     else{
        lista1.add(nome);
    }
   
 }

 System.out.println(lista1);
 System.out.println(lista2);

 Set<String> listamesclada =new HashSet<>();
 listamesclada.addAll(lista1);
 listamesclada.addAll(lista2);

 System.out.println(listamesclada);

 sc.close();
    }
}
