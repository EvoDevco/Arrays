import java.util.Arrays;
import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        int []numeros = {1,3,5,7,9,11,13,15,17,19,20};
        int media =0;
        for (int numero : numeros) {
            media += numero;
        }
        media = media/numeros.length;
        System.out.println("La media del Array es: " + media);
    }
}
