package hoofdmenu;

import afsluiten.SluitSpel;
import help.ToonHelp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Bart on 7-4-2014.
 */
public class Hoofdmenu extends JPanel implements ActionListener{

    private JFrame spelFrame;
    private JButton jbtNieuwSpel, jbtSpelLaden, jbtOpties, jbtHelp, jbtExit;
    private JLabel background;

    public Hoofdmenu(JFrame spelFrame) {

        this.spelFrame = spelFrame;

        setLayout(null);

        maakJButtons();

        add(jbtNieuwSpel);
        add(jbtSpelLaden);
        add(jbtOpties);
        add(jbtHelp);
        add(jbtExit);

        maakAchtergrond();

        setLayout(new BorderLayout());
        add(background);
    }

    private void maakJButtons(){
        jbtNieuwSpel = new JButton(new ImageIcon("src/resources/hoofdmenu/nieuw_spel.png"));
        jbtNieuwSpel.setRolloverIcon(new ImageIcon("src/resources/hoofdmenu/nieuw_spel_h.png"));
        jbtNieuwSpel.setBorder(null);
        jbtNieuwSpel.setBounds(125, 100, 300, 63);
        jbtNieuwSpel.addActionListener(this);

        jbtSpelLaden = new JButton(new ImageIcon("src/resources/hoofdmenu/spel_laden.png"));
        jbtSpelLaden.setRolloverIcon(new ImageIcon("src/resources/hoofdmenu/spel_laden_h.png"));
        jbtSpelLaden.setBorder(null);
        jbtSpelLaden.setBounds(125, 175, 300, 63);
        jbtSpelLaden.addActionListener(this);

        jbtOpties = new JButton(new ImageIcon("src/resources/hoofdmenu/opties.png"));
        jbtOpties.setRolloverIcon(new ImageIcon("src/resources/hoofdmenu/opties_h.png"));
        jbtOpties.setBorder(null);
        jbtOpties.setBounds(125, 250, 300, 63);
        jbtOpties.addActionListener(this);

        jbtHelp = new JButton(new ImageIcon("src/resources/hoofdmenu/help.png"));
        jbtHelp.setRolloverIcon(new ImageIcon("src/resources/hoofdmenu/help_h.png"));
        jbtHelp.setBorder(null);
        jbtHelp.setBounds(125, 325, 300, 63);
        jbtHelp.addActionListener(this);

        jbtExit = new JButton(new ImageIcon("src/resources/hoofdmenu/exit.png"));
        jbtExit.setRolloverIcon(new ImageIcon("src/resources/hoofdmenu/exit_h.png"));
        jbtExit.setBorder(null);
        jbtExit.setBounds(125, 400, 300, 63);
        jbtExit.addActionListener(this);
    }

    private void maakAchtergrond(){
        background = new JLabel(new ImageIcon("src/resources/achtergrond/menu_bg.png"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jbtNieuwSpel){

            System.out.println("nieuw spel wordt gestart!");

        } else if (e.getSource() == jbtSpelLaden){

            System.out.println("laad Spel wordt gestart...!");

        } else if (e.getSource() == jbtOpties){

            System.out.println("Opties wordt gestart...!");

        } else if (e.getSource() == jbtHelp) {

            ToonHelp toonHelp = new ToonHelp(spelFrame);
            toonHelp.run();

        } else if (e.getSource() == jbtExit) {

            SluitSpel sluitSpel = new SluitSpel(spelFrame);
            sluitSpel.run();
        }
    }
}
