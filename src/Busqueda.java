import java.util.Scanner;

public class Busqueda {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Indique los numeros dentro del array");
        for (int repeticiones=0; repeticiones<numeros.length;repeticiones++){
            numeros[repeticiones]= input.nextInt();
        }
        System.out.println("Ahora indique que numero desea que bsuquemos");
        int buscar = input.nextInt();
        boolean encontrado=false;
        int posicion=0;
        for (int numero : numeros) {
            if (numero==buscar){
                encontrado=true;
                System.out.println("La posicion del numero que busca es: " + posicion);
                 break;
            }
            posicion+=1;
        }
        if (!encontrado){
            System.out.println("La posicion del numero que busca es: " + -1);
        }
    }
}
