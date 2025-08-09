import java.util.Scanner;

public class ValidacaoDeZero {
    public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
        int denominador, numerador;
        double resultado = 0;

 System.out.println("Digite um denominador:");
 denominador = sc.nextInt();

  System.out.println("Digite um numerador:");
 numerador = sc.nextInt();


 if (denominador != 0) {
 resultado = (double) numerador / denominador;
    System.out.println(resultado);
 }
 else{
    System.out.println("Erro: Divisão por zero.");
 }


 System.out.println("Digite um denominador:");
 denominador = sc.nextInt();

  System.out.println("Digite um numerador:");
 numerador = sc.nextInt();

 try{
 resultado = (double) numerador / denominador;
    System.out.println(resultado);
 }
 catch(ArithmeticException e){
  System.out.println("Erro: Divisão por zero." + e.getMessage());
 }


 System.out.println("Digite um denominador:");
 denominador = sc.nextInt();

  System.out.println("Digite um numerador:");
 numerador = sc.nextInt();

 if(Double.isInfinite(resultado)){
 System.out.println("Erro: Divisão por zero (Infinity).");
 }
 else if(Double.isNaN(resultado)){
  System.out.println("Erro: Resultado indefinido (NaN).");
 }
 else{
    System.out.println("Erro: Divisão por zero.");
 }


 sc.close();
    }
}
