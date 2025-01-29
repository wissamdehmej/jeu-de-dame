public class Joueur {
    private String nom;
    private boolean estBlanc;

    public Joueur(String nom, boolean estBlanc) {
        this.nom = nom;
        this.estBlanc = estBlanc;
    }

    public boolean estBlanc() {
        return estBlanc;
    }

    public String getNom() {
        return nom;
    }
}
