package help;

import hoofdmenu.ToonHoofdmenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Bart on 10-4-2014.
 */
public class Help extends JPanel implements ActionListener {

    private JFrame spelFrame;
    private JButton terug;
    private JLabel background;

    public Help(JFrame spelFrame){

        this.spelFrame = spelFrame;

        maakAchtergrond();
        maakButton();

        setLayout(null);
        add(terug);

        setLayout(new BorderLayout());
        add(background);
    }

    private void maakAchtergrond(){
        background = new JLabel(new ImageIcon("src/resources/achtergrond/help_bg.png"));
    }

    private void maakButton(){

        terug = new JButton(new ImageIcon("src/resources/buttons/ok.png"));
        terug.setRolloverIcon(new ImageIcon("src/resources/buttons/ok_h.png"));
        terug.setBorder(null);
        terug.setBounds(200, 400, 150, 51);
        terug.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        ToonHoofdmenu toonHoofdmenu = new ToonHoofdmenu(spelFrame, true);
        toonHoofdmenu.run();
    }
}
