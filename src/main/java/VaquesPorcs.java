// Activitat 03 — Vaques i porcs

import java.util.Scanner;

public class VaquesPorcs {
    public static void main(String[] args) {
        // TODO: llegeix el número de vaques i de porcs
        //   Calcula el percentatge de cada un sobre el total i mostra'ls
        //   Digues quin dels dos percentatges és més gran (o si empaten)

        Scanner teclat = new Scanner (System.in);
        int vaques = 0;
        System.out.println("Número de vaques: ");
        vaques = teclat.nextInt();

        int porcs = 0;
        System.out.println("Número de porcs: ");
        porcs = teclat.nextInt();

        int total;
        total = vaques + porcs;

        int percentetgevaques;
        percentetgevaques = (vaques * 100) / total;
        System.out.println("Percentatge de vaques: " + percentetgevaques + "%");

        int percentatgeporcs;
        percentatgeporcs = (porcs * 100) / total;
        System.out.println("Percentatge de porcs: " + percentatgeporcs + "%");

        
        if(percentatgeporcs>percentetgevaques) {
        System.out.println("El percentatge de porcs és més gran");}

        if(percentatgeporcs<percentetgevaques) {
        System.out.println("El percentatge de vaques és més gran");
    }

        if(percentatgeporcs==percentetgevaques); {
            System.out.println("Els percentatges són iguals");
        }
        












    }
}
