// Activitat 07 — Dividir el més gran entre el més petit

import java.util.Scanner;

public class DivisioGranPetit {
    public static void main(String[] args) {
        // TODO: llegeix 2 números diferents
        //   Si són iguals -> "Els números han de ser diferents"
        //   Troba el més gran i el més petit
        //   Si el més petit és 0 -> "El divisor no pot ser 0"
        //   Si no, mostra el resultat de dividir el gran entre el petit

       Scanner teclat = new Scanner(System.in);

        double numero1 = 0;
        System.out.println("1r número: ");
        numero1 = teclat.nextDouble();

        double numero2 = 0;
        System.out.println("2n número: ");
        numero2 = teclat.nextDouble();

        if (numero1 == numero2) {
            System.out.println("Els números han de ser diferents");
        } else {
            if (numero1 > numero2) {
                if (numero2 == 0) {
                    System.out.println("El divisor no pot ser 0");
                } else {
                    System.out.println("Divisió del gran entre el petit: " + numero1 / numero2);
                }
            } else {
                if (numero1 == 0) {
                    System.out.println("El divisor no pot ser 0");
                } else {
                    System.out.println("Divisió del gran entre el petit: " + numero2 / numero1);
                }
            }
        }
    }
}