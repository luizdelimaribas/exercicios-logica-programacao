import java.util.Scanner;
// leia o numero da matricula do funcionario, seu numero de horas trabalhadas ,
//o valor que recebe por horas e calcular do salario desse funcionario.
public class Salario {
    public static void main (String args[]){

  Scanner sc = new Scanner (System.in);

  int matricula, horastrabalhadas;
  float salario, valorhora;

// leia o numero da matricula do funcionario, seu numero de horas trabalhadas ,
//o valor que recebe por horas

 System.out.println("Qual a matricula: ");
 matricula = sc.nextInt();

 System.out.println("Quantas horas trabalhadas: ");
 horastrabalhadas = sc.nextInt();

 System.out.println("Qual o valor da hora trabalhada: ");
 valorhora = sc.nextFloat();

 //calcular do salario desse funcionario.

 salario = valorhora * horastrabalhadas;

 // mostra as informações da matricula e salario.

System.out.println(" A matricula: " + matricula);
System.out.println(" O salario e do funcionario é : " + salario);


 sc.close();

    }
    
}
