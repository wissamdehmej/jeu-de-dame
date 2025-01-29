public class Jeu {
    private Plateau plateau;
    private Joueur joueur1;
    private Joueur joueur2;
    private Joueur joueurCourant;

    public Jeu() {
        this.plateau = new Plateau();
        this.joueur1 = new Joueur("Joueur 1", true);
        this.joueur2 = new Joueur("Joueur 2", false);
        this.joueurCourant = joueur1;
    }

    public void changerTour() {
        joueurCourant = (joueurCourant == joueur1) ? joueur2 : joueur1;
    }

    public Joueur getJoueurCourant() {
        return joueurCourant;
    }

    public Plateau getPlateau() {
        return plateau;
    }

    public static void main(String[] args) {
        new InterfaceGraphique(new Jeu());
    }
}