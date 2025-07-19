public class Converte_tipos {
    public static void main(String[] args){

  int numeroInteiro = 10;

  float  numeroFloat = numeroInteiro;

  System.out.println(numeroFloat);

  long numeroLongo = numeroInteiro;

   System.out.println(numeroLongo);

  double numeroDouble = numeroInteiro;

  System.out.println(numeroDouble);

 double numero2Double = 9.99;

 int numero2Inteiro = (int) numero2Double;

 System.out.println(numero2Inteiro);

 float  valorFloat = 15.56f; 

 int valorInteiro = (int) valorFloat;

  System.out.println(valorInteiro);

  String palavra = "456";

 int palavraModificada = Integer.parseInt(palavra);

  System.out.println(palavraModificada - 56);

  String palavra2 = "456.56";

 double palavra2Modificada = Double.parseDouble(palavra2);

 System.out.println(palavra2Modificada + 3.56);
 
 int valor = 846;

 String valorModificado = Integer.toString(valor);

 System.out.println(valorModificado.getClass().getSimpleName());

 float valorF = 45.56f;

 String valorfModificado = Float.toString(valorF);

 System.out.println(valorfModificado.getClass().getSimpleName());

 Double valorD = 456.789;

 String valorDModificada = Double.toString(valorD);

 System.out.println(valorDModificada.getClass().getSimpleName());


    }
    
}
