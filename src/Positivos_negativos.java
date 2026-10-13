import java.util.Scanner;

public class Positivos_negativos {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Indique los numeros dentro del array");
        for (int repeticiones=0; repeticiones<numeros.length;repeticiones++){
            numeros[repeticiones]= input.nextInt();
        }
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        System.out.println("La suma del Array es: " + suma);
    }
}
