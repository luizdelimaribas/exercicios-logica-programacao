//Construa  for‑each para somar elementos de um array.
public class For_eachSomarArray {
    public static void main(String[] args){
 int[] numerosLista = {1,2,3};
 int soma = 0;

 for(int numero : numerosLista){
 soma += numero;
 }

 System.out.println(soma);

    }
}
