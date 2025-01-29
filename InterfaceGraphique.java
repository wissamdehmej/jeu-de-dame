import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceGraphique extends JFrame {
    private Jeu jeu;
    private JButton[][] boutons;

    public InterfaceGraphique(Jeu jeu) {
        this.jeu = jeu;
        this.boutons = new JButton[8][8];

        setTitle("Jeu de Dames");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 8));

        initialiserBoutons();
        mettreAJourPlateau();

        setVisible(true);
    }

    private void initialiserBoutons() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                boutons[i][j] = new JButton();
                final int x = i, y = j;
                boutons[i][j].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        gererClic(x, y);
                    }
                });
                add(boutons[i][j]);
            }
        }
    }

    private void mettreAJourPlateau() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Case c = jeu.getPlateau().getCase(i, j);
                if (c.estVide()) {
                    boutons[i][j].setText("");
                } else {
                    boutons[i][j].setText(c.getPiece().estBlanc() ? "B" : "N");
                }
            }
        }
    }

    private void gererClic(int x, int y) {
        System.out.println("Case cliquée : " + x + ", " + y);
        // Ici, on gère les actions du joueur (déplacements)
    }
}