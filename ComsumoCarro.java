import java.util.Scanner;

public class ComsumoCarro {
    public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 int distancia;
 float combustivel;

 System.out.println("qual a distância total percorrida (em Km):");
 distancia = sc.nextInt();

 System.out.println("Quanto de combustível gasto:");
 combustivel  = sc.nextFloat();

 float mediaComsumo  = distancia / combustivel;

 System.out.println("O valor que representa o consumo médio do automóvel é " + mediaComsumo + " km/l");


 sc.close();
    }
    
}
