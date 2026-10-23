package Arrays_II;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Ahorcado {
    public static final String R = "\u001B[31m"; // Rojo
    public static final String V = "\u001B[32m"; // Verde
    public static final String B = "\u001B[97m"; // Azul
    public static final String C = "\u001B[36m";   // Cian estándar
    public static final String CC = "\u001B[96m"; // Cian claro
    public static final String A = "\u001B[33m"; // Azul
    public static final String G = "\u001B[0m";// Gris
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] dibujo = {"  +---+\n  |   |\n      |\n      |\n      |\n      |\n=========",
                "  +---+\n  |   |\n  O   |\n      |\n      |\n      |\n=========",
                "  +---+\n  |   |\n  O   |\n  |   |\n      |\n      |\n=========",
                "  +---+\n  |   |\n  O   |\n /|   |\n      |\n      |\n=========",
                "  +---+\n  |   |\n  O   |\n /|\\  |\n      |\n      |\n=========",
                "  +---+\n  |   |\n  O   |\n /|\\  |\n /    |\n      |\n=========",
                "  +---+\n  |   |\n  O   |\n /|\\  |\n / \\  |\n      |\n========="
        };
        String[] palabras = {
                "manzana", "nube", "bicicleta", "montaña", "guitarra",
                "ventana", "río", "estrella", "pelota", "camino",
                "libro", "tormenta", "espejo", "naranja", "puente",
                "reloj", "playa", "cohete", "jardín", "linterna",
                "tortuga", "carretera", "sombrero", "volcán", "isla",
                "cuaderno", "relámpago", "mariposa", "desierto", "faro"
        };
        Random random = new Random();
        int min = 0;
        int max = palabras.length-1 ;
        int posicion_p = random.nextInt(palabras.length);
        char[] palabra_seleccionada = new char[palabras[posicion_p].length()];
        for (int posicion=0;posicion<palabras[posicion_p].length();posicion++){
            palabra_seleccionada[posicion]= palabras[posicion_p].charAt(posicion);
        }
        char[] palabra_adivina = new char[palabras[posicion_p].length()];
        Arrays.fill(palabra_adivina, '-');
        int intentos = dibujo.length;
        ArrayList<Character> caracteres_usados = new ArrayList<>();
        ArrayList<Character> caracteres_fallados = new ArrayList<>();
        for (int dibujado = 0; !Arrays.equals(palabra_adivina, palabra_seleccionada) |intentos==0; dibujado++){
            if (intentos==0){
                System.out.println("Te has quedado sin intentos");
                break;
            }
            System.out.println(dibujo[dibujado]);
            System.out.println("Te quedan: " + intentos + " intentos");
            System.out.println("Las letras usadas han sido : " + caracteres_usados);
            System.out.println("De las cuales no forman parte de  la palabra " + caracteres_fallados);
            System.out.println("La palabra adivina es ahora mismo : " );
            for (char c : palabra_adivina) {
                System.out.print(c + "  ");
            }
            System.out.println();
            System.out.println("Indique el carácter que quiere comprobar si forma parte de la palabra elegida");
            String caracter = input.nextLine();
            caracter = caracter.toLowerCase();
        if (caracter.length()>1 | !Character.isLetter(caracter.charAt(0))){
            do {
                System.out.println("El valor otorgado tiene mas de 1 carácter, por favor, indique un valor de 1 único carácter.");
                caracter = input.nextLine();
            }while (caracter.length()>1 && Character.isLetter(caracter.charAt(0)) );

        }else{
            System.out.println(dibujo[dibujado]);
            System.out.println();
            if (!caracteres_usados.contains(caracter.charAt(0))){
                caracteres_usados.add(caracter.charAt(0));
            }else{
                do{
                    System.out.println("El carácter indicado ya ha sido usado previamente, por favor, indique uno no usado todavía.");
                    caracter = input.nextLine();
                } while (caracteres_usados.contains(caracter.charAt(0)));
                caracteres_usados.add(caracter.charAt(0));
            }
            if (palabras[posicion_p].contains(caracter)){
                System.out.println("El caracter indicado SI esta en la palabra");
                for (int saltos=0;saltos<palabra_seleccionada.length;saltos++){
                    if (palabra_seleccionada[saltos] == caracter.charAt(0)){
                        palabra_adivina[saltos] = caracter.charAt(0);
                    }else {
                        continue;
                    }
                }
                palabra_adivina[palabras[posicion_p].indexOf(caracter)] = caracter.charAt(0);
                dibujado--;
            }else {
                System.out.println("El carácter indication NO esta en la palabra.");
                intentos--;
                caracteres_fallados.add(caracter.charAt(0));
            }
        }
            if (Arrays.equals(palabra_adivina, palabra_seleccionada)){
                System.out.println("Felicitaciones has ganado");
            }
        }
    }
}