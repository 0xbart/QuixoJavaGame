package hoofdmenu.nieuwprofiel;

import hoofdmenu.ToonHoofdmenu;
import hoofdmenu.opties.ToonOpties;

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
    private JRadioButton kruisje,rondje, kruisje2, rondje2;
    public NieuwProfiel(JFrame spelFrame) {

        this.spelFrame = spelFrame;

        maakAchtergrond();
        maakButtons();
        maakInput();

//        setLayout(null);
        add(naam_1);
        add(naam_2);
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

        /* Jradio buttons deze geven de keuzen voor rondje of kruisje  */
        JRadioButton kruisje = new JRadioButton();
        kruisje.setText("Kruisje");
        kruisje.setBounds(75, 140, 65, 35);
        kruisje.setBackground( new Color(166,166,166) );
        JRadioButton rondje = new JRadioButton();
        rondje.setText("Rondje");
        rondje.setBackground( new Color(166,166,166) );
        rondje.setBounds(145, 140, 65, 35);

        JRadioButton kruisje2 = new JRadioButton();
        kruisje2.setText("Kruisje");
        kruisje2.setBounds(330, 140, 65, 35);
        kruisje2.setBackground( new Color(166,166,166) );
        JRadioButton rondje2 = new JRadioButton();
        rondje2.setText("Rondje");
        rondje2.setBackground( new Color(166,166,166) );
        rondje2.setBounds(400, 140, 65, 35);

        ButtonGroup group = new ButtonGroup();
        group.add(kruisje);
        group.add(rondje);

        ButtonGroup group2 = new ButtonGroup();
        group2.add(kruisje2);
        group2.add(rondje2);

        ButtonGroup group3 = new ButtonGroup();
        group3.add(kruisje2);
        group3.add(kruisje);

        ButtonGroup group4 = new ButtonGroup();
        group4.add(rondje);
        group4.add(rondje2);



        add(kruisje);
        add(rondje);
        add(kruisje2);
        add(rondje2);
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

            ToonSpelbord toonSpelbord = new ToonSpelbord(spelFrame);
            toonSpelbord.run();
        }
    }

}
