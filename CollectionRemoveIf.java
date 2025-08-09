//Remova elementos nulos com Collection.removeIf()


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CollectionRemoveIf {
    public static void main(String[] args){
        List<String> lista = new ArrayList<>();

      lista.add(null);
      lista.add("faca");
      lista.add("laro");
      lista.add(null);

      System.out.println(lista);

      // remove todos os elementos nulos da lista.
      lista.removeIf(Objects::isNull);

      System.out.println(lista);


    }
}
