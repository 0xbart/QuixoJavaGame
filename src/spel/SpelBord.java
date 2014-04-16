package spel;

import javax.swing.*;

import java.awt.*;
import java.applet.Applet;

/**
 * Created by Bart on 15-4-2014.
 */
public class SpelBord extends JPanel {

    protected Graphics g2d;
    private JFrame spelFrame;
    private JLabel background;
    private JButton vlak1,vlak2;
    public SpelBord(JFrame spelFrame) {

        this.spelFrame = spelFrame;

        maakAchtergrond();
        Jbuttons();
        setLayout(new BorderLayout());
        add(background);
        add(vlak1);
        add(vlak2);

        /*
        new Blokje();
        repaint();
        */
    }

    private void maakAchtergrond(){
        background = new JLabel(new ImageIcon("src/resources/achtergrond/spelveld_bg.png"));
    }

            public void Jbuttons() {
                setLayout(new GridLayout(5,5));
                vlak1 = new JButton("test22222");
                vlak1.setBorder(null);
                vlak1.setBounds(100, 415, 150, 51);
                vlak2 = new JButton("test11");
                vlak2.setBounds(100, 415, 50, 51);


            }





    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.g2d = g;

        repaint();
    }
}
