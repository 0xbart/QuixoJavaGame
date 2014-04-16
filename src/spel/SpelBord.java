package spel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Bart on 15-4-2014.
 */
public class SpelBord extends JPanel {

    private JFrame spelFrame;
    private JLabel background;
    private JLabel[] blokken = new JLabel[25];

    private BorderLayout borderLayout = new BorderLayout(5,5);

    public SpelBord(JFrame spelFrame) {

        this.spelFrame = spelFrame;

        maakAchtergrond();
        maakButtons();
        toevoegenButtons();

        setLayout(new BorderLayout());
        add(background);
    }

    private void maakAchtergrond(){
        background = new JLabel(new ImageIcon("src/resources/achtergrond/spelveld_bg.png"));
    }

    private void maakButtons() {

        int c = 0;

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                blokken[c] = new JLabel(new ImageIcon("src/resources/spel/1.png"));
                blokken[c].setBounds(130 + (j*57), 148 + (i*57), 57, 57);
                blokken[c].setBorder(null);
                c++;
            }
        }
    }

    private void toevoegenButtons() {

        for(int i = 0; i < 25; i++){
            add(blokken[i]);
        }
    }


}
