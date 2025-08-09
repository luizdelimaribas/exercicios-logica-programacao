//Transforme List<String> em List<Integer> com map().

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TransformarListStringInteger {
    public static void main(String[] args){
        List<String> listastring = Arrays.asList("1", "2", "3", "5");
    
     List<Integer> listaInteger = listastring.stream()
     .map(s -> Integer.parseInt(s))
     .collect(Collectors.toList());

     System.out.println("Lista de inteiros : " + listaInteger );

      List<Integer> listaComReferecia = listastring.stream()
     .map(Integer :: parseInt)
     .collect(Collectors.toList());

     System.out.println("Lista de inteiros usando referência de método: " + listaComReferecia);
    
    }
}
