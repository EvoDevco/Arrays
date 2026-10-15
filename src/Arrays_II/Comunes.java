package Arrays_II;
import java.util.Scanner;
import java.util.Arrays;
public class Comunes {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] array2 = {1,2,3,4,5};
        System.out.println("Los numeros comunes entre ambos arrays son: ");
        for (int numeros:array){
            for (int numeros2:array2){
                if (numeros==numeros2){
                    System.out.print(numeros2 + " ");
                }
            }
        }
    }
}
