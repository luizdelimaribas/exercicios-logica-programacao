//classe Lampada que tenha atributos para representar seu estado (ligada/desligada)
// e métodos para ligar e desligar.

import java.util.Scanner;

public class Lampada {

    public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 
        int ligado;

System.out.println("Voçê quer deixar a lampada ligada ou desligada: ligada opção - 1 , desligada opçaõ - 2 ");
 ligado = sc.nextInt();

 if(ligado == 1){
    System.out.println(" A lampada esta ligada.");
 }
 else if (ligado == 2) {
    System.out.println(" A lampada esta desligada."); 
 } else {
    System.out.println(" Opção errada escolha entre 1- ligada ou 2- desligada.");
 }{
   
 }

sc.close();
    }
    
}