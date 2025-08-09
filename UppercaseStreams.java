//Transforme lista de strings em uppercase com Streams.


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UppercaseStreams {
public static void main(String[] args){
    List<String> lista = Arrays.asList("banana", "chaves", "tartaruga");

 List<String> listaMaiuscula = lista.stream()
  .map(String::toUpperCase)
  .collect(Collectors.toList());

  System.out.println(listaMaiuscula);
    
}

}