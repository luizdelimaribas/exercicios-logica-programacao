//Use Boolean.parseBoolean a partir de string “True”/“False”.

import java.util.Scanner;

public class ParseBoolean {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.println("Digite true ou outra coisa para teste do Boolean.parseBoolean:");
String stringdeTexte = sc.nextLine();

boolean resultado = Boolean.parseBoolean(stringdeTexte);

System.out.println("O resultado: " + resultado);

sc.close();
}
    
}