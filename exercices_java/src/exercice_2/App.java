public class App {
    public static void main(String[] args) throws Exception {
        // Écrire un programme en Java qui permet de
        // calculer la somme S=1+2+3+...+ 10. Utilisant la boucle for.

        int tab[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;

        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }
        ;
        System.out.println("La somme de la table est de : " + sum);
    }
}
