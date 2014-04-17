package spel.opties;

import hoofdmenu.ToonHoofdmenu;
import spel.ToonSpelbord;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Bart on 17-4-2014.
 */
public class IngameOpties extends JPanel implements ActionListener {

    private JFrame spelFrame;
    private JButton opslaan, afsluiten, cancel;
    private JLabel background;

    public IngameOpties(JFrame spelFrame) {

        this.spelFrame = spelFrame;

        maakAchtergrond();
        maakButtons();

        setLayout(null);
        add(opslaan);
        add(afsluiten);
        add(cancel);

        setLayout(new BorderLayout());
        add(background);
    }

    private void maakAchtergrond(){
        background = new JLabel(new ImageIcon("src/resources/achtergrond/ingame_opties_bg.png"));
    }

    public void maakButtons() {

        opslaan = new JButton(new ImageIcon("src/resources/buttons/opslaan.png"));
        opslaan.setRolloverIcon(new ImageIcon("src/resources/buttons/opslaan_h.png"));
        opslaan.setBorder(null);
        opslaan.setBounds(200, 125, 150, 51);
        opslaan.addActionListener(this);

        afsluiten = new JButton(new ImageIcon("src/resources/buttons/afsluiten.png"));
        afsluiten.setRolloverIcon(new ImageIcon("src/resources/buttons/afsluiten_h.png"));
        afsluiten.setBorder(null);
        afsluiten.setBounds(200, 200, 150, 51);
        afsluiten.addActionListener(this);

        cancel = new JButton(new ImageIcon("src/resources/buttons/cancel.png"));
        cancel.setRolloverIcon(new ImageIcon("src/resources/buttons/cancel_h.png"));
        cancel.setBorder(null);
        cancel.setBounds(200, 275, 150, 51);
        cancel.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == opslaan){
            System.out.println("Spel wordt opgeslagen!");
            JOptionPane.showMessageDialog(null, "Het spel kan niet worden opgeslagen.", "Spel opslaan mislukt!", JOptionPane.INFORMATION_MESSAGE);
        } else if(e.getSource() == afsluiten){

            String message = "Weet u zeker dat deze Quixo pot wilt Afsluiten?";
            String title = "Afsluiten pot Quixo";

            int bevestiging = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);

            if(bevestiging == JOptionPane.YES_OPTION) {
                ToonHoofdmenu toonHoofdmenu = new ToonHoofdmenu(spelFrame, true);
                toonHoofdmenu.run();
            }

        } else if(e.getSource() == cancel){
            ToonSpelbord toonSpelbord = new ToonSpelbord(spelFrame);
            toonSpelbord.run();
        }
    }

}
