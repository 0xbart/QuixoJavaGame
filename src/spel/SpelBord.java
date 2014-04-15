package spel;

import javax.swing.*;

/**
 * Created by Bart on 15-4-2014.
 */
public class SpelBord extends JPanel {

    private JFrame spelFrame;
    private JLabel background;

    public SpelBord(JFrame spelFrame) {

        this.spelFrame = spelFrame;

        maakAchtergrond();
    }

    private void maakAchtergrond(){
        background = new JLabel(new ImageIcon("src/resources/achtergrond/spelveld_bg.png"));
    }
}
