package hoofdmenu.nieuwprofiel;

import hoofdmenu.ToonHoofdmenu;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Bart on 10-4-2014.
 */
public class NieuwProfiel extends JPanel implements ActionListener {

    private JFrame spelFrame;
    private JTextField naam_1, naam_2;
    private JButton ok, cancel, rood, zwart, rood1, zwart1;
    private JLabel background;
    private JRadioButton kruisje, rondje, kruisje2, rondje2;
    private JLabel jlKruisjeLinks, jlKruisjeRechts, jlRondjeLinks, jlRondjeRechts;
    private ButtonGroup group_speler_1, group_speler_2;

    public NieuwProfiel(JFrame spelFrame) {

        this.spelFrame = spelFrame;

        maakAchtergrond();
        maakButtons();
        maakInput();
        maakRadio();
        maakAfbeeldingen();

        add(naam_1);
        add(naam_2);
        add(ok);
        add(cancel);
        add(rondje);
        add(kruisje);
        add(rondje2);
        add(kruisje2);
        add(jlKruisjeLinks);
        add(jlKruisjeRechts);
        add(jlRondjeLinks);
        add(jlRondjeRechts);

        setLayout(new BorderLayout());
        add(background);
    }

    private void maakAchtergrond() {
        background = new JLabel(new ImageIcon("src/resources/achtergrond/profiel_n_bg.png"));
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

        naam_1 = new JTextField();
        naam_1.setBounds(75, 170, 150, 25);

        naam_2 = new JTextField();
        naam_2.setBounds(330, 170, 150, 25);
    }

    private void maakAfbeeldingen() {

        BufferedImage imgKruisje = null;
        try {
            imgKruisje = ImageIO.read(new File("src/resources/buttons/Kruisje.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedImage imgRondje = null;
        try {
            imgRondje = ImageIO.read(new File("src/resources/buttons/Rondje.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        jlKruisjeLinks = new JLabel(new ImageIcon(imgKruisje));
        jlKruisjeLinks.setBounds(80, 235, 56, 54);

        jlRondjeLinks = new JLabel(new ImageIcon(imgRondje));
        jlRondjeLinks.setBounds(160, 235, 56, 54);

        jlKruisjeRechts = new JLabel(new ImageIcon(imgKruisje));
        jlKruisjeRechts.setBounds(335, 235, 56, 54);

        jlRondjeRechts = new JLabel(new ImageIcon(imgRondje));
        jlRondjeRechts.setBounds(415, 235, 56, 54);
    }

    private void maakRadio() {

        /* Jradio buttons deze geven de keuzen voor rondje of kruisje */
        kruisje = new JRadioButton();
        kruisje.setText("Kruisje");
        kruisje.setBackground(new Color(166, 166, 166));
        kruisje.setBounds(75, 200, 65, 35);

        rondje = new JRadioButton();
        rondje.setText("Rondje");
        rondje.setBackground( new Color(166,166,166));
        rondje.setBounds(155,200,65,35);

        kruisje2 = new JRadioButton();
        kruisje2.setText("Kruisje");
        kruisje2.setBackground(new Color(166, 166, 166));
        kruisje2.setBounds(330, 200, 65, 35);

        rondje2 = new JRadioButton();
        rondje2.setText("Rondje");
        rondje2.setBackground( new Color(166,166,166));
        rondje2.setBounds(410,200,65,35);

        group_speler_1 = new ButtonGroup();
        group_speler_1.add(kruisje);
        group_speler_1.add(rondje);

        group_speler_2 = new ButtonGroup();
        group_speler_2.add(kruisje2);
        group_speler_2.add(rondje2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == cancel){

            ToonHoofdmenu toonHoofdmenu = new ToonHoofdmenu(spelFrame, true);
            toonHoofdmenu.run();

        } else if(e.getSource() == ok){

            ControleerNieuwProfiel controleerNieuwProfiel = new ControleerNieuwProfiel(spelFrame);
            controleerNieuwProfiel.run();
        }
    }

}