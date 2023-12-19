import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Écrire un programme en Java qui demande l'âge d'un enfant et permet
        // d'informer de sa catégorie sachant que les catégories sont les suivantes:
        // "poussin de 6 a 7 ans"
        // "pupille de 8 a 9 ans "
        // "minime de 10 a 11 ans "
        // " cadet après 12 ans ".

        Scanner scanner = new Scanner(System.in);
        System.out.println("Rentre ton âge !.\n");
        int age = scanner.nextInt();

        String section = switch (age) {
            case 1, 2, 3, 4, 5 -> "Catégorie non trouvable.";
            case 6, 7 -> "Catégorie poussin";
            case 8, 9 -> "Catégorie pupille";
            case 10, 11 -> "Catégorie minime";
            case 12 -> "Catégorie cadet";
            default -> "Non applicable, réessayez.";
        };
        System.out.println(section);

        scanner.close();

    }
}