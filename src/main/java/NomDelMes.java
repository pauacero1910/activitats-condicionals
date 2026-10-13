// Activitat 22 — Nom del mes (switch)

import java.util.Scanner;

public class NomDelMes {
    public static void main(String[] args) {
        // TODO amb switch: llegeix un número de mes (1-12) i mostra el seu nom
        //   Controla els números fora de rang (default)

        Scanner teclat = new Scanner (System.in);

        int num;
        System.out.println("Introdueix un número de mes: ");
        num = teclat.nextInt();

        switch (num) {      
            case 1:
                System.out.print("Gener");              
                break;            
            case 2:
                System.out.print("Febrer"); 
                break;
            case 3:
                System.out.print("Març");              
                break;            
            case 4:
                System.out.print("Abril"); 
                break;
            case 5:
                System.out.print("Maig");              
                break;            
            case 6:
                System.out.print("Juny"); 
                break;
            case 7:
                System.out.print("Juliol");              
                break;            
            case 8:
                System.out.print("Agost"); 
                break;
            case 9:
                System.out.print("Septembre");              
                break;            
            case 10:
                System.out.print("Octubre"); 
                break;
            case 11:
                System.out.print("Novembre");              
                break;            
            case 12:
                System.out.print("Decembre"); 
                break;                
            default:  
                System.out.println("El número ha de ser entre 1 i 12");
        }      
    }
}
