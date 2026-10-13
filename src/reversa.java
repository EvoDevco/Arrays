import java.util.Scanner;
import java.util.Arrays;
public class reversa {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Indique los numeros dentro del array");
        for (int repeticiones=0; repeticiones<5;repeticiones++){
            numeros[repeticiones]= input.nextInt();
        }
        for (int posicion = numeros.length;posicion!=0;posicion--){
            System.out.println(numeros[posicion-1]);
        }
    }
}
