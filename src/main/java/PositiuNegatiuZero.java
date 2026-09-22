// Activitat 08 — Positiu, negatiu o zero

import java.util.Scanner;

public class PositiuNegatiuZero {
    public static void main(String[] args) {
        // TODO: llegeix un número enter i digues si és positiu, negatiu o zero

        Scanner teclat = new Scanner (System.in);

        int numero = 0;
        System.out.println("Número: ");
        numero = teclat.nextInt();

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
}
