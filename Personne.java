package personne;
public class Personne {
         protected String nom;
        protected String prenom;
        protected int anneeNaissance;
        protected String email;

        // Constructeur de la classe Personne
        public Personne(String nom, String prenom, int anneeNaissance, String email) {
            this.nom = nom;
            this.prenom = prenom;
            this.anneeNaissance = anneeNaissance;
            this.email = email;
        }

        // Méthode toString pour afficher les informations de la personne
        @Override
        public String toString() {
            return "Nom: " + nom + ", Prénom: " + prenom + ", Année de naissance: " + anneeNaissance + ", Email: " + email;
        }
    }

