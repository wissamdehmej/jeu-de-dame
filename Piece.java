public abstract class Piece {
    protected boolean estBlanc;
    protected int x, y;

    public Piece(boolean estBlanc, int x, int y) {
        this.estBlanc = estBlanc;
        this.x = x;
        this.y = y;
    }

    public boolean estBlanc() {
        return estBlanc;
    }

    public abstract boolean mouvementValide(int newX, int newY, Plateau plateau);
}