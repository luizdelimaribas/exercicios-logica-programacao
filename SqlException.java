 /*código exibe a mensagem de erro, o código SQLState e o 
 código de erro, além de verificar se existe uma exceção encadeada. 
 Ele também demonstra como adicionar tratamento específico para certos
 códigos de erro, como a verificação de violações de integridade 
 referencial.  */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class SqlException {
    public static void main(String [] args){
 String url = "jdbc:mysql://localhost:3306/mydatabase";
 String user = "user";
 String passaword = "password";

 try(Connection connection = DriverManager.getConnection(url, user, passaword);
 Statement statement = connection.createStatement() ){

    String sql = "SELECT * FROM invalid_table";
    statement.executeQuery(sql);
 }
 catch(SQLException e){
   
   System.err.println("Erro ao executar a consulta SQL: " + e.getMessage());
  System.err.println("Código SQLState:" + e.getSQLState());
  System.err.println("Código de erro: " + e.getErrorCode());

  if (e.getNextException() != null) {
    System.err.println("Exceção encadeada: " + e.getNextException().getMessage());
  }

  if (e.getSQLState().startsWith("23")) {
    System.err.println("Violação de integridade referencial. Verifique as chaves estrangeiras.");
         
  }


 }
 
    }
}
