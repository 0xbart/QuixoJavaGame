package hoofdmenu;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Bart on 7-4-2014.
 */
public class Hoofdmenu extends JFrame implements ActionListener{

    private JButton jbtNieuwSpel = new JButton(new ImageIcon("src/resources/hoofdmenu/nieuw_spel.png")),
                    jbtSpelLaden = new JButton(new ImageIcon("src/resources/hoofdmenu/spel_laden.png")),
                    jbtOpties = new JButton(new ImageIcon("src/resources/hoofdmenu/opties.png")),
                    jbtHelp = new JButton(new ImageIcon("src/resources/hoofdmenu/help.png")),
                    jbtExit = new JButton(new ImageIcon("src/resources/hoofdmenu/exit.png"));

    public Hoofdmenu() {

        this.setTitle("Quixo - IPSEN1 - INF1G Groep 4");
        this.setSize(550, 550);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        maakJButtons();

        this.add(jbtNieuwSpel);
        this.add(jbtSpelLaden);
        this.add(jbtOpties);
        this.add(jbtHelp);
        this.add(jbtExit);

        this.setVisible(true);
    }

    private void maakJButtons(){
        jbtNieuwSpel = new JButton(new ImageIcon("src/resources/hoofdmenu/nieuw_spel.png"));
        jbtNieuwSpel.setBorder(null);
        jbtNieuwSpel.setBounds(125, 50, 300, 63);
        jbtNieuwSpel.addActionListener(this);

        jbtSpelLaden = new JButton(new ImageIcon("src/resources/hoofdmenu/spel_laden.png"));
        jbtSpelLaden.setBorder(null);
        jbtSpelLaden.setBounds(125, 150, 300, 63);
        jbtSpelLaden.addActionListener(this);

        jbtOpties = new JButton(new ImageIcon("src/resources/hoofdmenu/opties.png"));
        jbtOpties.setBorder(null);
        jbtOpties.setBounds(125, 250, 300, 63);
        jbtOpties.addActionListener(this);

        jbtHelp = new JButton(new ImageIcon("src/resources/hoofdmenu/help.png"));
        jbtHelp.setBorder(null);
        jbtHelp.setBounds(125, 350, 300, 63);
        jbtHelp.addActionListener(this);

        jbtExit = new JButton(new ImageIcon("src/resources/hoofdmenu/exit.png"));
        jbtExit.setBorder(null);
        jbtExit.setBounds(125, 450, 300, 63);
        jbtExit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println((JButton) e.getSource());
        System.out.println(((JComponent) e.getSource())+" Click");
    }
}
