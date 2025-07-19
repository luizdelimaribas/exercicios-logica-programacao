import java.util.Scanner;

public class Manipulacao_string {
    public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 
 

 System.out.println("Digite uma palavra:");
 String palavra = sc.nextLine();

 StringBuilder str = new StringBuilder(palavra); 

 str.reverse();
 System.out.println("A palavra ao contrário e :" + str);

 sc.close();

    }
    
}
