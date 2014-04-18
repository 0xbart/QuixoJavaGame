package hoofdmenu.laadprofiel;

import hoofdmenu.ToonHoofdmenu;
import spel.ToonSpelbord;
import utils.Computer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Bart on 10-4-2014.
 */
public class LaadProfiel extends JPanel implements ActionListener {

    private JFrame spelFrame;
    private JButton ok, cancel;
    private JLabel background, jlTitel, jlSpeler1, jlSpeler2, jlTypeSpeler1, jlTypeSpeler2, jlSpelerZet;

    private String strSpeler1;
    private String strSpeler2;
    private String strTypeSpeler1;
    private String strTypeSpeler2;
    private String strSpelerZet;
    private String strTypeSpelerZet;
    private int [] spelData = new int[25];

    public LaadProfiel(JFrame spelFrame) {

        this.spelFrame = spelFrame;

        maakAchtergrond();
        maakButtons();
        leesBestand();
        maakLabels();

        add(jlTitel);
        add(jlSpeler1);
        add(jlSpeler2);
        add(jlTypeSpeler1);
        add(jlTypeSpeler2);

        add(ok);
        add(cancel);

        setLayout(new BorderLayout());
        add(background);
    }

    private void maakAchtergrond() {
        background = new JLabel(new ImageIcon("src/resources/achtergrond/profiel_bg.png"));
    }

    private void maakButtons() {

        cancel = new JButton(new ImageIcon("src/resources/buttons/cancel.png"));
        cancel.setRolloverIcon(new ImageIcon("src/resources/buttons/cancel_h.png"));
        cancel.setBorder(null);
        cancel.setBounds(100, 415, 150, 51);
        cancel.addActionListener(this);

        ok = new JButton(new ImageIcon("src/resources/buttons/ok.png"));
        ok.setRolloverIcon(new ImageIcon("src/resources/buttons/ok_h.png"));
        ok.setBorder(null);
        ok.setBounds(300, 415, 150, 51);
        ok.addActionListener(this);
    }

    private void maakLabels() {

        jlTitel = new JLabel("De volgende instellingen zijn gevonden. Controleer deze.");
        jlTitel.setBounds(50, 100, 400, 15);

        jlSpeler1 = new JLabel("Naam speler 1: " + strSpeler1);
        jlSpeler1.setBounds(50, 200, 400, 15);

        jlSpeler2 = new JLabel("Naam speler 2: " + strSpeler2);
        jlSpeler2.setBounds(50, 225, 400, 15);

        jlTypeSpeler1 = new JLabel(strSpeler1 + " speelt met: " + strTypeSpeler1);
        jlTypeSpeler1.setBounds(50, 250, 400, 15);

        jlTypeSpeler2 = new JLabel(strSpeler2 + " speelt met: " + strTypeSpeler2);
        jlTypeSpeler2.setBounds(50, 275, 400, 15);

        jlSpelerZet = new JLabel(strSpelerZet + " is aan zet");
        jlSpelerZet.setBounds(50, 300, 400, 15);
    }

    private void leesBestand() {

        Computer c = new Computer();
        String filePath = c.getFILEPATH() + "profiel.bin";

        File file = new File(filePath);
        Scanner input = null;

        try {
            input = new Scanner(file);
            strSpeler1 = input.next();
            strSpeler2 = input.next();
            strTypeSpeler1 = input.next();
            strTypeSpeler2 = input.next();
            strSpelerZet = input.next();
            strTypeSpelerZet = input.next();

            for(int i = 0; i < 25; i++){
                spelData[i] = input.nextInt();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == cancel){

            ToonHoofdmenu toonHoofdmenu = new ToonHoofdmenu(spelFrame, true);
            toonHoofdmenu.run();

        } else if(e.getSource() == ok){

            ToonSpelbord toonSpelbord = new ToonSpelbord(spelFrame, strSpeler1, strSpeler2, strTypeSpeler1, strTypeSpeler2, spelData, strSpeler1, strTypeSpeler1);
            toonSpelbord.run();
        }
    }
}
