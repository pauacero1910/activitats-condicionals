// Activitat 21 — Pedra, paper o tisora
// Ajuda: java.util.Random -> random.nextInt(3)  (0 pedra, 1 paper, 2 tisora)

import java.util.Random;
import java.util.Scanner;

public class PedraPaperTisora {
    public static void main(String[] args) {
        // TODO: l'ordinador tria a l'atzar pedra, paper o tisora
        //   L'usuari entra la seva opció per teclat
        //   Mostra què ha tret l'ordinador i qui guanya (tisores>paper>pedra>tisores)

        Random generador = new Random();
        Scanner teclat = new Scanner(System.in);

        int atzar = generador.nextInt(3); 

        String ordinador = "";

        if (atzar == 0) {
    
            ordinador = "pedra" ;
        }
        else if (atzar == 1) {
            ordinador = "paper" ;
        }
        else {
            ordinador = "tisores";
        }

        System.out.println("Tria pedra, paper o tisores: ");
        String usuari = teclat.nextLine();  

        System.out.println("L'ordinador a triat: " + ordinador);

        if (usuari.equals(ordinador)) {
            System.out.println("Empat");
        }
        else if (
            (usuari.equals("pedra") && ordinador.equals("tisores")) || 
            (usuari.equals("paper") && ordinador.equals("pedra")) || 
            (usuari.equals("tisores") && ordinador.equals("paper")) 
        ) {
            System.out.println("Has guanyat !!!");
        }
        else {
            System.out.println("Has perdut !!!");
        }
    }
}
