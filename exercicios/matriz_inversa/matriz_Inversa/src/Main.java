
import java.util.Arrays;
public class Main {


    static int[ ] valArray = {1, 2, 3, 5, 7, 11, 13};

    static void matrixInversion(int[] array) {
        int[] valArrayInvertido = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            valArrayInvertido[i] = array[array.length - 1 - i];
        }



        System.out.println("Valor do Array em ordem :" + Arrays.toString(array));
        System.out.println("Valor do Array em ordem :" + Arrays.toString(valArrayInvertido));
    }

    public static void main(String[] args) {
        matrixInversion(valArray);
    }
}