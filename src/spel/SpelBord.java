package spel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Bart on 15-4-2014.
 */
public class SpelBord extends JPanel {

    protected Graphics g2d;
    private JFrame spelFrame;
    private JLabel background;

    public SpelBord(JFrame spelFrame) {

        this.spelFrame = spelFrame;

        maakAchtergrond();

        setLayout(new BorderLayout());
        add(background);

        new Blokje();
        repaint();
    }

    private void maakAchtergrond(){
        background = new JLabel(new ImageIcon("src/resources/achtergrond/spelveld_bg.png"));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.g2d = g;

        this.repaint();
    }
}
