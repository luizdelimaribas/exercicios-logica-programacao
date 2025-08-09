import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraDeArquivo {
    public static void main (String[] args){
        
         // Substitua pelo caminho do seu arquivo
  String caminhoArquivo = "C:\\Users\\Luiz\\OneDrive\\Documentos\\Suplementos.txt";

 try(BufferedReader arquivo = new BufferedReader(new FileReader(caminhoArquivo)) ){
 String linha;
 while ((linha = arquivo.readLine()) != null) {
    System.out.println(linha);
 }
}
 catch(IOException e){
    System.err.println("Erro ao ler o arquivo: " + e.getMessage());
 }


    }
}

/*BufferedReader: Este recurso lê o texto do arquivo, linha por linha.
FileReader: Este recurso abre o arquivo para leitura.
catch (IOException e): O bloco catch trata qualquer exceção IOException 
que possa ocorrer durante a leitura do arquivo.

Benefícios do Try-With-Resources:
Código mais limpo:
Elimina a necessidade do bloco finally para fechar o recurso,
 tornando o código mais conciso e legível.
Gerenciamento automático de recursos:
Garante que o recurso seja fechado, mesmo em caso de exceções,
 evitando vazamentos de recursos.
Redução de erros:
Minimiza a chance de esquecer de fechar o recurso ou de manipular
 incorretamente as exceções relacionadas ao fechamento.
Melhora a segurança:
Ao garantir o fechamento correto dos recursos, 
evita vulnerabilidades relacionadas a recursos não liberados. */