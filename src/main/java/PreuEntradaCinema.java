// Activitat 11 — Preu d'una entrada de cinema
// Ajuda: per llegir una lletra amb Scanner
//   char lletra = teclat.next().charAt(0);

import java.util.Scanner;

public class PreuEntradaCinema {
    public static void main(String[] args) {
        // TODO: l'entrada normal val 5€
        //   Un 10% més en cap de setmana (pregunta L=laborable o C=cap de setmana)
        //   Un 15% de descompte addicional amb Carnet Jove (pregunta S/N)
        //   Mostra el preu final

        Scanner teclat = new Scanner (System.in);

        double preu_entrada = 5.0 ;

        System.out.println("Laborable o cap de setmana? (L/C) ");
        char resposta1 = teclat.next().charAt(0);
        
        System.out.println("Tens carnet jove? (S/N) ");
        char resposta2 = teclat.next().charAt(0);

        double preuFinal = preu_entrada;
        
        if (resposta1 == 'C') {
           preuFinal = preuFinal + (preuFinal * 10 / 100);
        }
        
        if (resposta2 == 'S') {
            preuFinal = preuFinal - (preuFinal * 15 / 100);
        }

        System.out.println("Preu final: " + preuFinal + "€");
       
    }
}
