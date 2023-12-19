package exercice_04;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Une boutique propose à ses clients, une réduction de 15%
        // pour les montants d’achat supérieurs à 200 Euros.
        // Écrire un programme en Java permettant de saisir le
        // prix total HT et de calculer le montant TTC en prenant
        // en compte la réduction et la TVA=20%.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quel est le montant total de vos achats HT ?\n");
        float total_HT = scanner.nextFloat();

        if (total_HT >= 200.00) {
            float prix_remise = total_HT - (total_HT * 15 / 100);
            total_HT = prix_remise;
            System.out.println("Une réduction de 15% a été appliquée sur vos achats.");
        }

        float total_TTC = total_HT + (total_HT * 20 / 100);

        System.out.println("Le montant total TTC de vos achats sera de : " + total_TTC);
        scanner.close();

    }
}
