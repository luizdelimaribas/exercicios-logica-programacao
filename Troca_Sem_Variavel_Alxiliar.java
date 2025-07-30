//Realize troca sem variável auxiliar (aritmética ou XOR)
import java.util.Scanner;

public class Troca_Sem_Variavel_Alxiliar {
public static void main(String[] args ){
    Scanner sc = new Scanner(System.in);

 System.out.println("Digite o primeiro valor: ");
 int valorA = sc.nextInt();

 System.out.println("Digite o segundo valor: ");
 int valorB = sc.nextInt();

 valorA = valorA + valorB; 
// a valriavel valorA vai receber a soma dos 2 valores exemplo (A)1 + (B)2 = 3
 valorB = valorA - valorB; 
// a variavel valorB vai receber A (agora e a soma dos 2 valores) - B . exemplo 3 -2 = (B)1  
 valorA = valorA - valorB; 
 // a variavel valorA vai receber A (agora e a soma dos 2 valores) - (o novo)B , exemplo 3 - 1 = (A)2

 // o resultado sera (A)2 (B)1

 System.out.println("Os novos valores são primeiro: " + valorA + " , segundo: " + valorB);

    sc.close();
}
    
}