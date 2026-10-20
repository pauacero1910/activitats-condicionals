// Activitat 10 — Caixer, comissió i saldo

import java.util.Scanner;

public class CaixerComissio {
    public static void main(String[] args) {
        // TODO: llegeix el saldo actual, la quantitat a treure i si fas servir caixer propi (S/N)
        //   Si NO és caixer propi, aplica una comissió del 5% sobre la quantitat
        //   Si (quantitat + comissió) > saldo -> "No es pot fer la retirada. Saldo insuficient."
        //   Si no, mostra la quantitat, la comissió (si n'hi ha) i el saldo restant

        Scanner teclat = new Scanner(System.in);

        System.out.println("Saldo actual: ");
        double saldo_actual = teclat.nextDouble();

        System.out.println("Quantitat a treure: ");
        double quantitat_treure = teclat.nextDouble();

        System.out.println("Fas servir caixer propi? (S/N)");
        char caixer_propi = teclat.next().charAt(0);

        double comissio = 0;

        if (caixer_propi == 'N') {
            comissio = quantitat_treure * 0.05;
        }

        double total = quantitat_treure + comissio;

        if (total > saldo_actual) {
            System.out.println("No es pot fer la retirada. Saldo insuficient.");
        } else {
            System.out.println("Quantitat retirada: " + quantitat_treure);

            if (comissio > 0) {
                System.out.println("Comissió: " + comissio);
            }

            System.out.println("Saldo restant: " + (saldo_actual - total));
        }

        teclat.close();
    }
}