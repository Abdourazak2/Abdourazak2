package Professeur;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Professeur extends personne.Personne {
    private Set<String> specialite;

    // Constructeur de la classe Professeur
    public Professeur(String nom, String prenom, int anneeNaissance, String email, Set<String> specialite) {
        super(nom, prenom, anneeNaissance, email);
        this.specialite = specialite;
    }

    // Méthode toString pour afficher les informations du professeur
    @Override
    public String toString() {
        return "Professeur - " + super.toString() + ", Spécialité: " + specialite;
    }

    public static void main(String[] args) {
        // Création d'instances de professeurs
        Set<String> specialites1 = new HashSet<>(Arrays.asList("PHP", "JAVA"));
        Set<String> specialites2 = new HashSet<>(Arrays.asList("C#", "PHP"));
        Set<String> specialites3 = new HashSet<>(Arrays.asList("PYTHON", "JAVA"));

        Professeur professeur1 = new Professeur("Makhmadane", "Lo", 1997, "makloprof@gmail.com", specialites1);
        Professeur professeur2 = new Professeur("Laye", "Gaye", 1994, "LayeGayef@gmail.com", specialites2);
        Professeur professeur3 = new Professeur("Yasser", "Djibril", 1990, "Yasserdjibril@gmail.com", specialites3);

        // Affichage des informations de chaque professeur
        System.out.println(professeur1.toString());
        System.out.println(professeur2.toString());
        System.out.println(professeur3.toString());
    }
}
