public class Plateau {
    private Case[][] cases;

    public Plateau() {
        cases = new Case[8][8];
        initialiserPlateau();
    }

    private void initialiserPlateau() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                cases[i][j] = new Case((i + j) % 2 == 1 ? new Pion(i < 3, i, j) : null);
            }
        }
    }

    public Case getCase(int x, int y) {
        return cases[x][y];
    }
}
