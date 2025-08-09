import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContagemDeLetrasHashMap {
    public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 Map<String , Integer> freguenciaLetras = new HashMap<>();
 String texto;

 System.out.println("Digite um texto:");
 texto = sc.nextLine();

 for(char letra : texto.toCharArray()){
    // Convertendo char para String
    String letrasConvertidas = String.valueOf(letra);
    freguenciaLetras.put(letrasConvertidas, freguenciaLetras.getOrDefault(letrasConvertidas , 0) + 1);
 }

 System.out.println(freguenciaLetras);

 sc.close();
    }
}
