import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void main(String [ ] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<String> menu = new ArrayList<>();

        System.out.println("O menu principal é: 1-file, 2-batata, 3-peixe");
         int escolha = sc.nextInt();
         switch (escolha) {
            case 1:
            System.out.println("Você escolheu file.");
            menu.add("file");
            break;
            case 2:
            System.out.println("Você escolheu batata.");
            menu.add("batata");
            break;
            case 3:
            System.out.println("Você escolheu peixe.");    
            menu.add("peixe");
            break;
            default:
            System.out.println("Opção inválida, tente novamente.");
                break;
                

         }
      
     sc.close();
        }
}