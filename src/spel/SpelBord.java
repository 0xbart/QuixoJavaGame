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
    private JButton ok, vlak1,vlak2;
    public SpelBord(JFrame spelFrame) {

        this.spelFrame = spelFrame;

        maakAchtergrond();
        init();
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

            public void init() {
                vlak1 = new JButton();
                vlak1.setBorder(null);
                vlak1.setBounds(100, 415, 150, 51);
                vlak2 = new JButton();
                vlak2.setBorder(null);
                vlak2.setBounds(10, 415, 150, 51);


            ok = new JButton(new ImageIcon("src/resources/buttons/ok.png"));
            ok.setRolloverIcon(new ImageIcon("src/resources/buttons/ok_h.png"));
            ok.setBorder(null);
            ok.setBounds(300, 415, 150, 51);

            }





    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.g2d = g;

        repaint();
    }
}
