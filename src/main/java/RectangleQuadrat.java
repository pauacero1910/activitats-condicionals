// Activitat 06 — Rectangle o quadrat

import java.util.Scanner;

public class RectangleQuadrat {
    public static void main(String[] args) {
        // TODO: llegeix el costat gran i el costat petit d'un rectangle
        //   Mostra el perímetre (costatGran*2 + costatPetit*2) i l'àrea (costatGran*costatPetit)
        //   Digues si és un quadrat (els dos costats iguals) o no

        Scanner teclat = new Scanner (System.in);

        double costatGran = 0;
        System.out.println("Costat gran: ");
        costatGran = teclat.nextDouble();

        double costatPetit = 0;
        System.out.println("Costat petit: ");
        costatPetit = teclat.nextDouble();

        double perimetre = (costatGran*2) + (costatPetit*2) ;
        double area = (costatGran*costatPetit) ;

        System.out.println("Perímetre: " + perimetre);
        System.out.println("Àrea: " + area);

        if (costatGran == costatPetit) {
            System.out.println("És un quadrat");
            
        }
        else {
            System.out.println("No és un quadrat");
        }
    }
}
