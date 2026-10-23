package Arrays_II;
import java.util.Scanner;
import java.util.Arrays;
public class EstacionMeteorologica {
    public static final String R = "\u001B[31m"; // Rojo
    public static final String V = "\u001B[32m"; // Verde
    public static final String B = "\u001B[97m"; // Azul
    public static final String C = "\u001B[36m";   // Cian estándar
    public static final String CC = "\u001B[96m"; // Cian claro
    public static final String A = "\u001B[33m"; // Azul
    public static final String G = "\u001B[0m";// Gris
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] dias = {"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
        String[] diferencia = new String[2];
        double suma =0;
        double temperatura = 0;
        double[] temperaturas = new double[7];
        double maximo =-30;
        double minimo = 50;
        int pos_min =0;
        int pos_max =0;
        double salto =0;
        String caracter = "▮";
        String color = "";
        int longitudReferencia = 12;
        // LA FILA DE VARIABLES.
        for (int posicion=1;posicion<=dias.length;posicion++) {
            System.out.print("Indique las temperatura del dia " + dias[posicion - 1] + " ");
            temperatura= input.nextDouble(); // Asignación del valor de Temperatura.
            if (temperatura<-30|temperatura>50){
                do {
                    System.out.print("El valor de temperatura NO es valido, por favor cambialo.");
                    temperatura = input.nextFloat();
                }while (temperatura<-30|temperatura>50); // Si no lo pones bien no continuamos.
            }
            temperaturas[posicion-1]=temperatura;
            suma+=temperaturas[posicion-1];
            if (temperatura<minimo){
                minimo = temperatura;
                pos_min=posicion-1;

            }
            if (temperatura>maximo){
                maximo = temperatura;
                pos_max = posicion-1;
            }
            // Asignación de maximo y minimo junto a los días que les corresponden.
        }
        double media = suma/7;
        System.out.printf("La temperatura media de la semana es: %.2f ",media   );
        System.out.println("La temperatura minima fue en : " + minimo + " y transcurrio el dia: " + dias[pos_min]);
        System.out.println("La temperatura minima fue en : " + maximo + " y transcurrio el dia: " + dias[pos_max]);
        System.out.print("Los dias de la semana que fueron superiores a la media fueron: ");
        //Primera tanda de impresiones.
        for (int saltos=1;saltos<=dias.length;saltos++){
            if (temperaturas[saltos-1]>media){
                System.out.print(dias[saltos-1] + ", ");//En vez de guardar en un array e imprimir podemos simplemente hacer la impresion normal..
            }
        }
        for (int comparaciones = 1; comparaciones<=dias.length-1;comparaciones++){
            if (temperaturas[comparaciones]-temperaturas[comparaciones-1]>salto){
                salto =temperaturas[comparaciones]-temperaturas[comparaciones-1];
                diferencia[0]=dias[comparaciones-1];
                diferencia[1]=dias[comparaciones];
            }
        }
        //Primera tanda de impresiones.
        System.out.println("El salto mas grande de temperatura fue de : " + salto + " grados. Ocurrio entre los dias : " + diferencia[0] + " y " + diferencia[1]);
        for (int i = 0; i < dias.length; i++) {
            int espaciosNecesarios = longitudReferencia - dias[i].length();
            String espaciosAlineacion = " ".repeat(espaciosNecesarios);
            caracter = "▮";
            if (temperaturas[i]<0){
                color = C;
                caracter = "▯";
            } else if (temperaturas[i] >=0 && temperaturas[i] <=9) {
                color = CC;
            }else if (temperaturas[i] >=10 && temperaturas[i] <=19) {
                color = V;
            }else if (temperaturas[i] >=20 && temperaturas[i] <=29) {
                color = A;
            }else if (temperaturas[i] >=30) {
                color = R;
            }
            System.out.println(dias[i] + espaciosAlineacion + color+caracter.repeat((int) Math.abs(temperaturas[i])) + " " + temperaturas[i]+G);
        }

    }
}
