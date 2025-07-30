//Construa String com concatenador "R$" + valor formatado (float).

import java.util.Scanner;

public class Concatenador_String_Float {
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);

 System.out.println("Digite um valor em R$:");
 float valor = sc.nextFloat();

 String textoComValor = "O valor do serviço e R$" + valor;

 System.out.println(textoComValor);


 sc.close();
 }
    
}