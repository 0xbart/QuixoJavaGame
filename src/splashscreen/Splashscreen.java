package splashscreen;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Bart on 7-4-2014.
 */
public class Splashscreen extends JPanel {

    private JLabel background;

    public Splashscreen(JFrame spelFrame){

        this.maakAchtergrond();
        setLayout(new GridLayout(0, 1));
        add(background);
    }

    private void maakAchtergrond(){
        background = new JLabel(new ImageIcon("src/resources/splashscreen_bg.png"));
    }

}
