import java.util.Scanner;

public class Semana3 {
    public static void main(String[] args) {
        //cualquier cosa

        /* cualquier cosa
           y otras cosas  */

        short numeroEntero = 1;
        byte numeroEntero2 =5;
        int numeroEntero3 =10; //usen esto
        long numeroEntero4 =100;

        float numerodecimal =3.14f;
        double numerodecimal2 =3.14; // usen este

        char letras = 'A';
        String texto = "hablen, pelaos";

        boolean esVerdadero = true;


        // operador Matematico
        int suma = numeroEntero + 37;
        System.out.println("el resutado es " + suma);


        // lectura por teclado
        Scanner scanner = new Scanner(System.in);
        System.out.print("numero Entero: ");
        numeroEntero = scanner.nextShort();
        System.out.print("El numero leido es " + numeroEntero);




    }
}
