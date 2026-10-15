package Arrays_II;

import java.util.Scanner;

public class Duplicados_de_arrays {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int contador = 0;
        int posicion =0;
        boolean repetido=false;
        int[] duplicados = new int[5];
        int numero_a_comprobar=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Indique los numeros dentro del array");
        for (int repeticiones=0; repeticiones<numeros.length;repeticiones++){
            numeros[repeticiones]= input.nextInt();
        }
        for (int numero : numeros) {
            repetido=false;
            numero_a_comprobar = numero;
            for (int numero2:numeros){
                if (numero_a_comprobar==numero2){
                    contador+=1;
                }
            }
            if (contador>=2){
                for (int duplicado:duplicados){
                    if (duplicado==numero){
                        repetido=true;
                        continue;
                    }
                }
                if (repetido){
                    continue;
                }else{
                    duplicados[posicion]=numero;
                    posicion+=1;
                }
            }
            contador=-1;
        }
        System.out.println("Los numeros que son duplicados son: ");
        for (int duplicado : duplicados) {
            if (duplicado == 0) {
                continue;
            } else {
                System.out.print(duplicado + " ");
            }
        }
    }
}
