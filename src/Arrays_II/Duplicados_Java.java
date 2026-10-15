package Arrays_II;
import java.util.Scanner;
import java.util.Arrays;

public class Duplicados_Java {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        int contador = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Indique los numeros dentro del array");
        for (int repeticiones=0; repeticiones<numeros.length;repeticiones++){
            numeros[repeticiones]= input.nextInt();
        }
        System.out.println("Ahora indique el numero que queremos comprobar si aparece mas de 1 vez");
        int buscar = input.nextInt();
        int apariciones=0;
        for (int numero : numeros) {
            if (numero==buscar){
                apariciones+=1;
            }
        }
        if (apariciones>1){
            System.out.println("El numero es un duplicado. De hecho aparece un total de: " + contador+ " veces");
        } else if (apariciones==1) {
            System.out.println("El numero estaba en el array pero no es duplicado");
        }else {
            System.out.println("El numero no estaba en el array");
        }
    }
}
