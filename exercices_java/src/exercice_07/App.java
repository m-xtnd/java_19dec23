package exercice_07;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Écrivez un programme Java qui accepte trois nombres
        // et affiche "Tous les nombres sont égaux" si les trois nombres sont égaux,
        // "Tous les nombres sont différents" si les trois nombres sont différents et
        // sinon "Ni tous ni égaux ni différents".

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quel est le premier chiffre ?\n");
        int chiffre_un = scanner.nextInt();

        System.out.println("Quel est le second chiffre ?\n");
        int chiffre_deux = scanner.nextInt();

        System.out.println("Quel est le troisième chiffre ?\n");
        int chiffre_trois = scanner.nextInt();

        scanner.close();

        if (chiffre_un == chiffre_deux && chiffre_deux == chiffre_trois) {
            System.out.println("Tous les nombres sont égaux.");
            return;

        }

        else if (chiffre_un != chiffre_deux && chiffre_deux != chiffre_trois && chiffre_un != chiffre_trois) {
            System.out.println("Tous les nombres sont différents.");
            return;
        }

        else {
            System.out.println("Ni tous ni égaux ni différents.");

        }

    }

}
