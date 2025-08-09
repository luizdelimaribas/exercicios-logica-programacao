//Soma de elementos usando Stream.reduce()


import java.util.Arrays;
import java.util.List;

public class StreamReduce {
    public static void main(String[] args){
        List<Integer> lista =  Arrays.asList(1,2,3,5,6,8);

      int soma = lista.stream().reduce(0, Integer::sum);

      int multiplica = lista.stream().reduce(1, (a,b) -> a * b);

      int maximo = lista.stream().reduce(Integer.MIN_VALUE, Integer :: max);

      System.out.println(soma + " , " + multiplica + " , " + maximo);

    }
}
