//escrever em um arquivo no Java usando Files.writeString 

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class EscreverArquivo {
    public static void main(String[] args){
        Path path = Path.of("NovoArquivo.txt");
   
      try{
        String texto = "Escrita com Files.writeString.";
      Files.writeString(path, texto, StandardCharsets.UTF_8);
      }
      catch(IOException e){
        e.printStackTrace();
      }


    }
}
