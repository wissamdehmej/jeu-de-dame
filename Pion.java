public class Pion extends Piece {
    public Pion(boolean estBlanc, int x, int y) {
        super(estBlanc, x, y);
    }

    @Override
    public boolean mouvementValide(int newX, int newY, Plateau plateau) {
        int direction = estBlanc ? -1 : 1;
        return (newX == x + direction && Math.abs(newY - y) == 1);
    }
}
