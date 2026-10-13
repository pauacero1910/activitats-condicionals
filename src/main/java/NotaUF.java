// Activitat 04 — Nota d'una UF (mitjana ponderada)

import java.util.Scanner;

public class NotaUF {
    public static void main(String[] args) {
        // TODO: llegeix la nota d'activitats i la nota de proves
        //   La nota final = activitats * 0.10 + proves * 0.90
        //   Mostra la nota final i digues si s'ha aprovat (>= 5) o no

        Scanner teclat = new Scanner (System.in);
        double notaActivitats = 0;
        System.out.println("Nota activitats: ");
        notaActivitats = teclat.nextDouble();

        double notaProves = 0;
        System.out.println("Nota activitats: ");
        notaProves = teclat.nextDouble();

        double notaFinal;
        notaFinal = notaActivitats * 0.10 + notaProves * 0.90;
        System.out.println("Nota final: " + notaFinal);

        if(notaFinal >= 5) {
            System.out.println("Aprovat");
        }
        else {
            System.out.println("Suspés");
        }
    }
}
