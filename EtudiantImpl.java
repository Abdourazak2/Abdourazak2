package personne;

import java.util.EnumSet;

public class EtudiantImpl extends Personne implements Etudiant {
    private String numeroEtudiant;
    private Classe classe;
    private static int idCounter = 1;

    public EtudiantImpl(String nom, String prenom, int anneeNaissance, String email, Classe classe) {
        super(nom, prenom, anneeNaissance, email);
        this.classe = classe;
        this.numeroEtudiant = nom + nom.length() + anneeNaissance + "000" + idCounter;
        idCounter++;
    }

    @Override
    public void sInscrire() {
        System.out.println("L'étudiant s'inscrit.");
    }

    @Override
    public void suivreCours() {
        System.out.println("L'étudiant suit des cours.");
    }

    @Override
    public void passerExamen() {
        System.out.println("L'étudiant passe un examen.");
    }

    @Override
    public String toString() {
        return "Etudiant - " + super.toString() + ", Numéro étudiant: " + numeroEtudiant + ", Classe: " + classe;
    }
};
