import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<personne.Personne> personnes = new ArrayList<>();

        // Ajout d'étudiants
        personnes.add(new personne.EtudiantImpl("Youssouf", "Soulet", 1995, "YoussoufSoulet@gmail.com", personne.Classe.L3));
        personnes.add(new personne.EtudiantImpl("Mariama", "Ali", 1999, "MariamaAli@gmail.com", personne.Classe.M1));
        personnes.add(new personne.EtudiantImpl("Razak", "Mmadi", 1998, "RazakMadi@gmail.com", personne.Classe.M2));

        // Création d'instances de professeurs
        Set<String> specialites1 = new HashSet<>(Arrays.asList("PHP", "JAVA"));
        Set<String> specialites2 = new HashSet<>(Arrays.asList("C#", "PHP"));
        Set<String> specialites3 = new HashSet<>(Arrays.asList("PYTHON", "JAVA"));

        Professeur.Professeur professeur1 = new Professeur.Professeur("Makhmadane", "Lo", 1997, "makloprof@gmail.com", specialites1);
        Professeur.Professeur professeur2 = new Professeur.Professeur("Laye", "Gaye", 1994, "LayeGayef@gmail.com", specialites2);
        Professeur.Professeur professeur3 = new Professeur.Professeur("Yasser", "Djibril", 1990, "Yasserdjibril@gmail.com", specialites3);

        // Affichage des informations de chaque objet du tableau personnes
        for (personne.Personne personne : personnes) {
            System.out.println(personne.toString());

            // Affichage des informations de chaque professeur
            System.out.println(professeur1.toString());
            System.out.println(professeur2.toString());
            System.out.println(professeur3.toString());
        }
    }
}
