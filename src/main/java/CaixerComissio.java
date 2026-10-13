// Activitat 10 — Caixer, comissió i saldo

import java.util.Scanner;

public class CaixerComissio {
    public static void main(String[] args) {
        // TODO: llegeix el saldo actual, la quantitat a treure i si fas servir caixer propi (S/N)
        //   Si NO és caixer propi, aplica una comissió del 5% sobre la quantitat
        //   Si (quantitat + comissió) > saldo -> "No es pot fer la retirada. Saldo insuficient."
        //   Si no, mostra la quantitat, la comissió (si n'hi ha) i el saldo restant

        Scanner teclat = new Scanner (System.in);

        double saldo_actual;
        System.out.println("Saldo actual: ");
        saldo_actual = teclat.nextDouble();

        double quantitat_treure;
        System.out.println("Quantitat a treure: ");
        quantitat_treure = teclat.nextDouble();

        char caixer_propi;
        System.out.println("Fas servir caixer propi? (S/N)");
        caixer_propi = teclat.next().charAt(0);

        double comissió = (quantitat_treure * 0.05) ;
        double quantitatComissió = quantitat_treure + comissió;

        if (quantitatComissió > saldo_actual) {
            System.out.println("No es pot fer la retirada. Saldo insuficient.");
        }
        else if (caixer_propi == 'S') {
            System.out.println("Quantitat retirada: " + quantitat_treure);
            System.out.println("Saldo restant: " + (saldo_actual - quantitat_treure));
        }
        else if ( caixer_propi == 'N') {
            System.out.println("Quantitat retirada: " + quantitat_treure);
            System.out.println("Commissió: 5%");
            System.out.println("Saldo restant: " + (saldo_actual - (quantitat_treure + comissió)) );
        }

    }
}
