import java.util.Scanner;

public class Troca_variavel {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
    int A = 1 , B = 2;


 System.out.println(A + " , " + B);

A = B;

System.out.println("Qual o novo valor de B: ");
B  = sc.nextInt();

 System.out.println(A + " , " + B);



}
    
}