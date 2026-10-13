// Activitat 25 — Operacions aritmètiques amb control d'excepcions

import java.util.InputMismatchException;
import java.util.Scanner;

public class OperacionsExcepcions {
    public static void main(String[] args) {
        // TODO: llegeix 2 números enters i mostra suma, resta, multiplicació i divisió
        //   Controla amb try/catch que l'usuari introdueixi números vàlids
        //   Controla que el segon operand no sigui 0 abans de dividir

        Scanner teclat = new Scanner(System.in);

        try {

        System.out.println("Introdueix dos números enters: ");
        int num1 = teclat.nextInt();
        int num2 = teclat.nextInt();

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicació: " + (num1 * num2));

        if (num2 != 0) {
                System.out.println("Divisió: " + (num1 / num2) ); 
        }
        else {
            System.out.println("El segon número no pot ser 0");
        }

    }
        catch (InputMismatchException e){
            System.out.println("Error: has d'introduir números enters vàlids.");
        }

    }
    
}





    

