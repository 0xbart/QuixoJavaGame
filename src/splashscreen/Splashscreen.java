package splashscreen;

import javax.swing.*;

/**
 * Created by Bart on 7-4-2014.
 */
public class Splashscreen extends JFrame {

    private JLabel background;

    public Splashscreen(){
        this.setTitle("Quixo - IPSEN1 - INF1G Groep 4");
        this.setSize(550, 550);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        maakAchtergrond();

        this.add(background);
        this.setVisible(true);
    }

    private void maakAchtergrond(){
        background = new JLabel(new ImageIcon("src/resources/splashscreen_bg.png"));
    }

}
