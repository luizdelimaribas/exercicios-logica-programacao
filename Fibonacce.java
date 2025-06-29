//um programa que exiba os primeiros N números da sequência de Fibonacci.
// fibonacce = numero1 + numero2   numero2 = fibonacce numero1 = numero2

public class Fibonacce {
    public static void main(String args[]){

int fibonacce = 1, numero1 = 0, numero2 = 1, sequencia;

System.out.println("A seguencia Fibonacce: " + fibonacce);

 for (sequencia = 1; sequencia < 10; sequencia ++){

    fibonacce = numero1 + numero2;
    numero1 = numero2;
    numero2 = fibonacce; 
    
    System.out.println("A seguencia Fibonacce: " + fibonacce);
    

 }

    }
    
}
