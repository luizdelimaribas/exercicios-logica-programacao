import java.util.InputMismatchException;
import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args){
  Scanner sc = new Scanner(System.in);

  System.out.println("Digite um número de 1 a 7 para o dia da semana:");
 int dia;
    try{  dia = sc.nextInt();
    }
    //se a entrada for inválida, o programa irá capturar a exceção
    catch(InputMismatchException e){
    System.out.println("Entrada inválida! Por favor, digite um número de 1 a 7.");
    return; // Encerra o programa se a entrada for inválida
    }
   switch (dia) {
    case 1:
        System.out.println("Hoje e é Domingo");
        break;
        
    case 2:
        System.out.println("Hoje e é Segunda-feira");
        break;
        
    case 3:
        System.out.println("Hoje e é Terça-feira");
        break;
        
    case 4:
        System.out.println("Hoje e é Quarta-feira");
        break;
        
    case 5:
        System.out.println("Hoje e é Quinta-feira");
        break;
        
    case 6:
        System.out.println("Hoje e é Sexta-feira");
        break;
        
    case 7:
        System.out.println("Hoje e é Sabado");
        break;
   
    default:
    System.out.println("Escolha inválida, por favor digite um número de 1 a 7.");
        break;
   }

 sc.close();
    }
    
}
