//leia as notas de um aluno,
// calcule a média e informe se ele foi aprovado ou não (utilizando critérios estabelecidos).

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediadeNota {
    public static void main (String args[]){
Scanner sc = new Scanner(System.in);

  List<Double> notas = new ArrayList<>();
  Double media;
  double soma = 0;

 //leia as notas de um aluno

 while (true) {

    System.out.println("Qual a nota do aluno ou digite (PARAR) para encerrar: ");
 try{
  double nota = sc.nextDouble();
  notas.add(nota);
 System.out.println("Nota registrada.");
 }
    catch (java.util.InputMismatchException e){
        String paradaleitura = sc.next();
        if (paradaleitura.equalsIgnoreCase("parar")){
            break;
        }

System.out.println("Nota invalida. Por favor, digite uma nota valida ou PARAR: ");
continue;
 }
 sc.nextLine();
 }
 
  
  for (Double nota : notas){
    soma += nota;
  }

  media = notas.isEmpty() ? 0: soma / notas.size();

   System.out.println("As notas sao: " + notas + " e a media das notas " + media);

 
   if ( media < 6 ){
    System.out.println("Aluno reprovado");
   }
   else{
    System.out.println("Aluno aprovado");
   }
 
sc.close();

    }
}