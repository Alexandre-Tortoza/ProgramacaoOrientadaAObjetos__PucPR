import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        int[] amostras ={1};
        int nAmostra;


        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite o tamanho da amostra: ");
         nAmostra = teclado.nextInt();

        while(nAmostra < 3){
            System.out.printf("o Numero de amostras deve ser equivalente ou maior que 3: ");
            nAmostra = teclado.nextInt();
        }

        for (int index = 0; index < (nAmostra+1); index++){
            System.out.println("Qual o valor da amostra da posicao " + index);










            
            amostras[index] = teclado.nextInt();

        };






    }
}

