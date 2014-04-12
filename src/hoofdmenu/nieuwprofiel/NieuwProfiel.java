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
    private JButton ok, cancel , exit, rood, zwart, rood1, zwart1, grijs ;
    private JLabel background;

    public NieuwProfiel(JFrame spelFrame) {

        this.spelFrame = spelFrame;

        maakAchtergrond();
        maakButtons();
        maakInput();

        add(naam_1);
        add(naam_2);
        add(ok);
        add(cancel);
        add(exit);
        add(rood);
        add(rood1);
        add(zwart);
        add(zwart1);
        add(grijs);


        setLayout(new BorderLayout());
        add(background);
    }

    private void maakAchtergrond() {
        background = new JLabel(new ImageIcon("src/resources/achtergrond/menu_bg.png"));
    }

    private void maakButtons() {
        grijs = new JButton(new ImageIcon("src/resources/profiel/profielmakengrijsvlak.png"));
        grijs.setBorder(null);
        grijs.setBounds(50, 66, 450, 330);

        cancel = new JButton(new ImageIcon("src/resources/buttons/terug.png"));
        cancel.setRolloverIcon(new ImageIcon("src/resources/buttons/terug.png"));
        cancel.setBorder(null);
        cancel.setBounds(180, 330, 180, 60);
        cancel.addActionListener(this);

        ok = new JButton(new ImageIcon("src/resources/buttons/beginspel.png"));
        ok.setRolloverIcon(new ImageIcon("src/resources/buttons/beginspel.png"));
        ok.setBorder(null);
        ok.setBounds(180, 260, 180, 60);
        ok.addActionListener(this);

        exit = new JButton(new ImageIcon("src/resources/hoofdmenu/exit.png"));
        exit.setRolloverIcon(new ImageIcon("src/resources/hoofdmenu/exit_h.png"));
        exit.setBorder(null);
        exit.setBounds(125, 400, 300, 63);
        exit.addActionListener(this);

        zwart = new JButton(new ImageIcon("src/resources/buttons/kruiszwart.png"));
        zwart.setRolloverIcon(new ImageIcon("src/resources/buttons/kruiszwart.png"));
        zwart.setBorder(null);
        zwart.setBounds(75, 150, 40, 40);
        zwart.addActionListener(this);

        rood = new JButton(new ImageIcon("src/resources/buttons/rondjerood.png"));
        rood.setRolloverIcon(new ImageIcon("src/resources/buttons/rondjerood.png"));
        rood.setBorder(null);
        rood.setBounds(125, 150, 40, 40);
        rood.addActionListener(this);


        rood1 = new JButton(new ImageIcon("src/resources/buttons/kruisjerood.png"));
        rood1.setRolloverIcon(new ImageIcon("src/resources/buttons/kruisjerood.png"));
        rood1.setBorder(null);
        rood1.setBounds(330, 150, 45, 45);
        rood1.addActionListener(this);


        zwart1 = new JButton(new ImageIcon("src/resources/buttons/rondjezwart.png"));
        zwart1.setRolloverIcon(new ImageIcon("src/resources/buttons/rondjezwart.png"));
        zwart1.setBorder(null);
        zwart1.setBounds(380, 150, 45, 45);
        zwart1.addActionListener(this);
    }



    private void maakInput() {

        naam_1 = new JTextField("Voor hier je naam in");
        naam_1.setBounds(75, 110, 150, 25);

        naam_2 = new JTextField("Voor hier je naam in");
        naam_2.setBounds(330, 110, 150, 25);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == cancel){

            ToonHoofdmenu toonHoofdmenu = new ToonHoofdmenu(spelFrame, true);
            toonHoofdmenu.run();

        } else if(e.getSource() == ok){

            System.out.println("OK is geklikt.");
            System.out.println(naam_1.getText());
            System.out.println(naam_2.getText());

        }
    }

}
