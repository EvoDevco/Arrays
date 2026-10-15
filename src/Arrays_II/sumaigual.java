package Arrays_II;

import java.util.Scanner;

public class sumaigual {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indique que numero desea que sea el resultado de la suma.");
        int suma = input.nextInt();
        int[] array = {1,2,3,4,5};
        System.out.println("Los numeros comunes entre ambos arrays son: ");
        for (int numeros:array){
            for (int numeros2:array){
                if (numeros==numeros2){
                    continue;
                }else if (numeros+numeros2==suma){
                    System.out.println("La suma se genera a partir de los numeros: " + numeros + " y " + numeros2);
                }
            }
        }
    }
}
