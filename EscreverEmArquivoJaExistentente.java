
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class EscreverEmArquivoJaExistentente {
    public static void main(String[] args){

 String caminhoDoArquivo = "C:\\Users\\Luiz\\OneDrive\\Documentos\\Suplementos.txt";
 String novoConteudo =  "Novo conteúdo adicionado ao arquivo 2.";

 try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(caminhoDoArquivo, true))){
   bufferedWriter.append(novoConteudo);
    bufferedWriter.newLine();
    System.out.println("Conteúdo adicionado ao arquivo com sucesso!");
 }
 catch(IOException e){
    System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
 }


    }
    
}
