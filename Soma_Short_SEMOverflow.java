//Leia dois valores short e calcule sua soma sem overflow.

public class Soma_Short_SEMOverflow {
    public static void main(String[] args){

 short A = (short) 32767 , B = (short) 43;
 
 int C = A + B;


 System.out.println("Valor : "+ A + " + " + B + " é: " + C);

 
    }
    
}
