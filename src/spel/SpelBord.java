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
    private Button vlak1,vlak2,vlak3,vlak4,vlak5,vlak6,vlak7,vlak8,vlak9,vlak10,vlak11,vlak12,vlak13,
            vlak14,vlak15,vlak16,vlak17,vlak18,vlak19,vlak20,vlak21,vlak22,vlak23,vlak24,vlak25;

    public SpelBord(JFrame spelFrame) {

        this.spelFrame = spelFrame;

        maakAchtergrond();

        setLayout(new BorderLayout());
        add(background);
        add(vlak1);
        add(vlak2);
        add(vlak3);
        add(vlak4);
        add(vlak5);
        add(vlak6);
        add(vlak7);
        add(vlak8);
        add(vlak9);
        add(vlak10);
        add(vlak11);
        add(vlak12);
        add(vlak13);
        add(vlak14);
        add(vlak15);
        add(vlak16);
        add(vlak17);
        add(vlak18);
        add(vlak19);
        add(vlak20);
        add(vlak21);
        add(vlak22);
        add(vlak23);
        add(vlak24);
        add(vlak25);

        new Blokje();
        repaint();
    }

    private void maakAchtergrond(){
        background = new JLabel(new ImageIcon("src/resources/achtergrond/spelveld_bg.png"));
    }

    public class spelbordGridLayout extends Object {
        public void init() {
            setLayout(new GridLayout(5,5)); {
                vlak1 = new Button ();
                vlak2 = new Button ();
                vlak3 = new Button ();
                vlak4 = new Button ();
                vlak5 = new Button ();
                vlak6 = new Button ();
                vlak7 = new Button ();
                vlak8 = new Button ();
                vlak9 = new Button ();
                vlak10 = new Button ();
                vlak11 = new Button ();
                vlak12 = new Button ();
                vlak13 = new Button ();
                vlak14 = new Button ();
                vlak15 = new Button ();
                vlak16 = new Button ();
                vlak17 = new Button ();
                vlak18 = new Button ();
                vlak19 = new Button ();
                vlak20 = new Button ();
                vlak21 = new Button ();
                vlak22 = new Button ();
                vlak23 = new Button ();
                vlak24 = new Button ();
                vlak25 = new Button ();
            }
        }
    }



    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.g2d = g;

        repaint();
    }
}
