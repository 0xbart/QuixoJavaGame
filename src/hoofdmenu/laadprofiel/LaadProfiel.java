package hoofdmenu.laadprofiel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Bart on 10-4-2014.
 */
public class LaadProfiel extends JPanel implements ActionListener {

    private JFrame spelFrame;
    private JLabel background;

    public LaadProfiel(JFrame spelFrame) {

        this.spelFrame = spelFrame;

        maakAchtergrond();

        setLayout(new BorderLayout());
        add(background);
    }

    private void maakAchtergrond() {
        background = new JLabel(new ImageIcon("src/resources/achtergrond/profiel_bg.png"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
