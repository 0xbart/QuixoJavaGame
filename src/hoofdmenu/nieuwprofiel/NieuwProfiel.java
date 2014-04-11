package hoofdmenu.nieuwprofiel;

import hoofdmenu.ToonHoofdmenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Bart on 10-4-2014.
 */
public class NieuwProfiel extends JPanel implements ActionListener {

    private JFrame spelFrame;
    private JTextField naam_1, naam_2;
    private JButton ok, cancel;
    private JLabel background;

    public NieuwProfiel(JFrame spelFrame) {

        this.spelFrame = spelFrame;

        maakAchtergrond();
        maakButtons();
        maakInput();

        add(naam_1);
        add(ok);
        add(cancel);

        setLayout(new BorderLayout());
        add(background);
    }

    private void maakAchtergrond() {
        background = new JLabel(new ImageIcon("src/resources/achtergrond/menu_bg.png"));
    }

    private void maakButtons() {
        cancel = new JButton(new ImageIcon("src/resources/buttons/cancel.png"));
        cancel.setRolloverIcon(new ImageIcon("src/resources/buttons/cancel_h.png"));
        cancel.setBorder(null);
        cancel.setBounds(100, 420, 150, 51);
        cancel.addActionListener(this);

        ok = new JButton(new ImageIcon("src/resources/buttons/ok.png"));
        ok.setRolloverIcon(new ImageIcon("src/resources/buttons/ok_h.png"));
        ok.setBorder(null);
        ok.setBounds(300, 420, 150, 51);
        ok.addActionListener(this);
    }

    private void maakInput() {

        naam_1 = new JTextField();
        naam_1.setBounds(100, 210, 150, 25);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == cancel){

            ToonHoofdmenu toonHoofdmenu = new ToonHoofdmenu(spelFrame, true);
            toonHoofdmenu.run();

        } else if(e.getSource() == ok){

            System.out.println("OK is geklikt.");
            System.out.println(naam_1.getText());

        }
    }
}
