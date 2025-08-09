//Merge duas listas sem duplicatas (Set)

import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MergeLista {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
List<Integer> lista1 = new ArrayList<>();
List<Integer> lista2 = new ArrayList<>();

//Duas listas são criadas e preenchidas com alguns valores.
while (true) {
System.out.println("Digite um numero para a primeira lista depois para segunda lista ou stop para encerrar: ");

try{
    int numero1 = sc.nextInt();
    lista1.add(numero1);
    int numero2 = sc.nextInt();
    lista2.add(numero2);
}  //stop para encerrar o loop
catch(InputMismatchException e){
    String stop = sc.nextLine();
    if (stop.equalsIgnoreCase(stop)) {
        break;
    }
}
}

//mostrar os valores das duas lista
System.out.println(lista1);
System.out.println(lista2);

/*HashSet variavel=>mergeLista é criado para união das duas listas sem duplicatas. 
addAll(lista1) e addAll(lista2) são usados para adicionar 
todos os elementos de ambas as listas ao conjunto.*/
Set<Integer> mergeLista = new HashSet<>();
mergeLista.addAll(lista1);
mergeLista.addAll(lista2);

//print da mescla das duas lista
System.out.println(mergeLista);

sc.close();
}
    
}