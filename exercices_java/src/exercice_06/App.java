package exercice_06;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Écrivez un programme Java qui demande deux chiffres à
        // un utilisateur, pour afficher la somme (addition),
        // multiplier, soustraire, diviser et le reste.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quel est le premier chiffre ?\n");
        int chiffre_un = scanner.nextInt();

        System.out.println("Quel est le second chiffre ?\n");
        int chiffre_deux = scanner.nextInt();

        int additionner = chiffre_un + chiffre_deux;
        int multiplier = chiffre_un * chiffre_deux;
        int soustraire = chiffre_un - chiffre_deux;
        int diviser = chiffre_un / chiffre_deux;
        int reste = chiffre_un % chiffre_deux;

        System.out.println("L'ensemble des opérations est : ");
        System.out.println("Somme : " + additionner);
        System.out.println("Multiplication : " + multiplier);
        System.out.println("Soustraction : " + soustraire);
        if (chiffre_deux == 0) {
            System.out.println("Division par zéro impossible.");
        } 
        
        else {
            System.out.println("Division :" + diviser);
        }
        System.out.println("Reste : " + reste);
        scanner.close();
    }
}
