import java.util.Scanner;

public class Pares_impares {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Indique los numeros dentro del array");
        for (int repeticiones=0; repeticiones<numeros.length;repeticiones++){
            numeros[repeticiones]= input.nextInt();
        }
        int par = 0;
        int impar=0;
        for (int numero : numeros) {
            if (numero%2==0){
                par++;
            }else {
                impar++;
            }
        }
        System.out.println("Los pares del array son " + par + " mientras que los impares son: " + impar);
    }
}
