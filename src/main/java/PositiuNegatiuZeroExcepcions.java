// Activitat 26 — Positiu, negatiu o zero, amb control d'excepcions

import java.util.InputMismatchException;
import java.util.Scanner;

public class PositiuNegatiuZeroExcepcions {
    public static void main(String[] args) {
        // TODO: com l'activitat 08, però controla amb try/catch que l'usuari
        //   introdueixi un número enter vàlid

         Scanner teclat = new Scanner (System.in);

    try {

        System.out.println("Número: ");
        int numero = teclat.nextInt();


        if (numero>0) {
            System.out.println("El número és positiu");
        }

        if (numero<0) {
            System.out.println("El número és negatiu");
        }

        if (numero==0) {
            System.out.println("El número és 0");
        }
    }

    catch (InputMismatchException e){
            System.out.println("Error: has d'introduir números enters vàlids.");
        }
    }
}
