import java.util.Scanner;

public class Inverter_Numero {public static void main(String [] args){
Scanner sc = new Scanner(System.in);

int invertido = 0;

System.out.println("Digite o numero que vc quer inverter:");
int numero = sc.nextInt();

while (numero > 0) {
    invertido *= 10;
    invertido += (numero % 10);
    numero /= 10;
    
}

System.out.println("O numero invertido é: " + invertido);

sc.close();
}
    
}
