// um algoritmo que armazene o valor 10 em uma variável A e o valor 20 
// em uma variável B. 
// A seguir troque os seus conteúdos fazendo com que o 
// valor que está em A passe para B e vice-versa. Ao final,
// escrever os valores que ficaram armazenados nas variáveis. 

public class TrocaVariavel {
public static void main(String args[]){
 int a = 10 , b = 20 , c = 0 ; 
 
 System.out.println(a + " e "+ b);
 c = a ;
 a = b ;
 b = c ;

 System.out.println(a + " " + b) ;
 
 
}
    
}