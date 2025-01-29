public class Dame extends Piece {
    public Dame(boolean estBlanc, int x, int y) {
        super(estBlanc, x, y);
    }

    @Override
    public boolean mouvementValide(int newX, int newY, Plateau plateau) {
        return Math.abs(newX - x) == Math.abs(newY - y);
    }
}