//Praticando: concatene uma coleção em string única via collect(joining(", ")).

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectJoining {
    public static void main(String[] args){
 List<String> lista = Arrays.asList("Maria" , "Lucas" , "Marcia" , "Felipe");

 String resultadoDoJoining, resultadoDoJoining2, resultadoDoJoining3;

  // Usando Collectors.joining(", ") 
  //para unir as strings com vírgula e espaço
 resultadoDoJoining = lista.stream()
 .collect(Collectors.joining(" , "));

 System.out.println(resultadoDoJoining);

  // Usando Collectors.joining(" / ") 
  //para unir as strings
 resultadoDoJoining2 = lista.stream()
 .collect(Collectors.joining(" / "));

 System.out.println(resultadoDoJoining2);

  // Usando Collectors.joining(" nome: ") 
  //para unir as strings mas como poderar ver a primeira não terar 
 resultadoDoJoining3 = lista.stream()
 .collect(Collectors.joining(" nome: "));

 System.out.println(resultadoDoJoining3);

    }
}
