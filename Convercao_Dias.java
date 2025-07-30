import java.util.Scanner;

public class Convercao_Dias {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long segundos = 0;

 System.out.println("Quantos segundos vc quer converter:");
 segundos = sc.nextLong();

 int dias = (int) (((segundos / 60) / 60) / 24); 

 System.out.println("Na converção " + segundos + " da " + dias + " dias.");

 sc.close();
}    
}
