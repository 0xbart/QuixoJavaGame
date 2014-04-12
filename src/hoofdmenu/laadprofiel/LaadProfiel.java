package hoofdmenu.laadprofiel;

import hoofdmenu.ToonHoofdmenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Bart on 10-4-2014.
 */
public class LaadProfiel extends JPanel implements ActionListener {

    private JFrame spelFrame;
    private JButton cancel, ok;
    private JLabel background;

    public LaadProfiel(JFrame spelFrame) {

        this.spelFrame = spelFrame;

        maakAchtergrond();
        maakButtons();

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

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == cancel){

            ToonHoofdmenu toonHoofdmenu = new ToonHoofdmenu(spelFrame, true);
            toonHoofdmenu.run();

        } else if(e.getSource() == ok){

            System.out.println("OK is geklikt.");
        }
    }
}
