package spel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Bart on 15-4-2014.
 */
public class Blokje extends JPanel {

    protected Graphics g2d;

    public Blokje() {

        g2d.drawLine(150, 350, 100, 40);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.g2d = g;

        repaint();
    }
}
