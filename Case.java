public class Case {
    private Piece piece;

    public Case(Piece piece) {
        this.piece = piece;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public boolean estVide() {
        return piece == null;
    }
}