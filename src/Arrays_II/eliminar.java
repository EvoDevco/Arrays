package Arrays_II;
import java.util.Scanner;
import java.util.Arrays;

public class eliminar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {2,5,0,9,1};
        System.out.println("Indique la posicion del numero que desea eliminar del array");
        int posicion = input.nextInt();
        array[posicion]=0;
        for (int i = posicion;i < array.length;i++){
            if (i!=array.length-1){
            array[i]=array[i+1];
            posicion+=1;
            }else {
                array[i]=0;
            }
        }
        for (int numeros:array){
            System.out.print(numeros);
        }
    }
}
