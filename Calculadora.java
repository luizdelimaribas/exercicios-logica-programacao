
// leia dois números e permita realizar as operações de adição, subtração, multiplicação e divisão.

import java.util.Scanner;


public class Calculadora {

    public static void main(String args[]){

    //ler dois números
Scanner scanner = new Scanner (System.in);

int Numero1, Numero2, Soma, Subtracao, Multiplicacao, divisao;

System.out.println("Digite o primeiro numero: ");
 Numero1 = scanner.nextInt();
   
System.out.println("Digite o segundo numero: ");
Numero2 = scanner.nextInt();

Soma = Numero1 + Numero2;
Subtracao = Numero1 - Numero2;
Multiplicacao = Numero1 * Numero2;
divisao = Numero1 / Numero2;

//realização das operações de adição, subtração, multiplicação e divisão.
System.out.println("Escolha a operação que deseja: 1-(adição) , 2-(subtração) , 3-(multiplicação) e 4-(divição). ");
int EscolhaOperacao = scanner.nextInt();

if (EscolhaOperacao == 1){
   System.out.println("A soma dos valors e : " + Soma);
}
else if(EscolhaOperacao == 2){
    System.out.println("A Subtracao dos valors e : " + Subtracao);
}
else if(EscolhaOperacao == 3){
   System.out.println("A Multiplicacao dos valors e : " + Multiplicacao);
}
else {
    System.out.println("A divisao dos valors e : " + divisao);
}

scanner.close();
}
}