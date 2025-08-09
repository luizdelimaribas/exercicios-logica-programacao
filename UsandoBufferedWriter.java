//usar usar Files.newBufferedWriter (Java 7+) para escrever em arquivos

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class UsandoBufferedWriter {
    public static void main(String[] args){
 Path caminhoDoArquivo = Paths.get("C:\\Users\\Luiz\\OneDrive\\Documentos\\Suplementos.txt");
 Charset charset = StandardCharsets.UTF_8;

 try(BufferedWriter bufferedWriter = Files.newBufferedWriter(
    caminhoDoArquivo,  charset, 
    StandardOpenOption.CREATE, StandardOpenOption.APPEND)){
   bufferedWriter.write("Linha adicionada via NIO via Files.newBufferedWriter");
    bufferedWriter.newLine();
    System.out.println("Escrita concluída com sucesso!");
 }
 catch(IOException e){
    System.err.println("Falha na escrita: " + e.getMessage());

}

    }
}
