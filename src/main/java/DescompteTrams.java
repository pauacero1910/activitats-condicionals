// Activitat 16 — Descompte per trams

import java.util.Scanner;

public class DescompteTrams {
    public static void main(String[] args) {
        // TODO: llegeix una quantitat N i resta-li el descompte segons el tram
        //   N < 500          -> 5%
        //   500 <= N < 1000  -> 8%
        //   1000 <= N <= 5000 -> 15%
        //   N > 5000         -> 25%
        //   Mostra el resultat

        Scanner teclat = new Scanner (System.in);

        double N = 0;
        System.out.println("Quantitat: ");
        N = teclat.nextDouble();

        if (N < 500){
            System.out.println("El resultat amb el descompte és: " + (N - (N*0.05)));
        }
        else if (N < 1000) {
            System.out.println("El resultat amb el descompte és: " + (N - (N*0.08)));
        }
        else if (N <= 5000) {
            System.out.println("El resultat amb el descompte és: " + (N - (N*0.15)));
        }
        else if (N > 5000 ) {
            System.out.println("El resultat amb el descompte és: " + (N - (N*0.25)));
        }

    }

}
