package Arrays_II;
import java.util.Scanner;
import java.util.Arrays;
public class inverso {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int contador = array.length;
        int[] array2 = new int[contador];
        for (int numero:array){
            array2[contador-1]=numero;
            contador-=1;
        }
        for (int numeros:array2){
            System.out.print(numeros);
        }
    }
}

