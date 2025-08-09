import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaAlfabeticamente {
    public static void main(String[] args){
        List<String> listaPalavras = new ArrayList<>();
        
        listaPalavras.add("Lucas");
        listaPalavras.add("banana");
        listaPalavras.add("barco");
        listaPalavras.add("jujuba");
        listaPalavras.add("luminaria");
        listaPalavras.add("Carlos");

        Collections.sort(listaPalavras);

        System.out.println(listaPalavras);

    }
}
