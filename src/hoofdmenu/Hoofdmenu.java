package hoofdmenu;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Bart on 7-4-2014.
 */
public class Hoofdmenu extends JFrame {

    JButton jbtNieuwSpel = new JButton(new ImageIcon("resources/hoofdmenu/nieuw_spel.png")),
            jbtSpelLaden,
            jbtOpties,
            jbtHelp,
            jbtExit;

    public Hoofdmenu(){

        this.setTitle("Quixo - IPSEN1 - INF1G Groep 4");
        this.setSize(550, 550);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(jbtNieuwSpel);
        this.add(jbtSpelLaden);
        this.add(jbtOpties);
        this.add(jbtHelp);
        this.add(jbtExit);

        this.setVisible(true);
    }

}
