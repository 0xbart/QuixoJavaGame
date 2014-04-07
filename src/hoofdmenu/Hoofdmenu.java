package hoofdmenu;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Bart on 7-4-2014.
 */
public class Hoofdmenu extends JFrame {

    JButton jbtNieuwSpel = new JButton(new ImageIcon("resources/hoofdmenu/nieuw_spel.png")),
            jbtSpelLaden = new JButton(new ImageIcon("resources/hoofdmenu/spel_laden.png")),
            jbtOpties = new JButton(new ImageIcon("resources/hoofdmenu/opties.png")),
            jbtHelp = new JButton(new ImageIcon("resources/hoofdmenu/help.png")),
            jbtExit = new JButton(new ImageIcon("resources/hoofdmenu/exit.png"));

    public Hoofdmenu(){

        this.setTitle("Quixo - IPSEN1 - INF1G Groep 4");
        this.setSize(550, 550);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        this.setVisible(true);
    }

}
