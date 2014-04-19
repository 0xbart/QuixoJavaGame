package spel.winnaar;

import hoofdmenu.ToonHoofdmenu;
import hoofdmenu.laadprofiel.ToonLaadProfiel;
import hoofdmenu.nieuwprofiel.ToonNieuwProfiel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by joey on 19-4-2014.
 */
public class Winnaar extends JPanel implements ActionListener {

    private JFrame spelFrame;
    private JButton ok, opnieuw;
    private JLabel background, jlTitel, jlSpeler1, jlSpeler2, jlTypeSpeler1, jlTypeSpeler2, jlSpelerZet;

    private String strSpeler1;
    private String strSpeler2;
    private String strTypeSpeler1;
    private String strTypeSpeler2;
    private String strSpelerWinnaar;

    public Winnaar(JFrame spelFrame, String strSpeler1, String strSpeler2, String strTypeSpeler1, String strTypeSpeler2, String strSpelerWinnaar){

        this.spelFrame = spelFrame;
        this.strSpeler1 = strSpeler1;
        this.strSpeler2 = strSpeler2;
        this.strTypeSpeler1 = strTypeSpeler1;
        this.strTypeSpeler2 = strTypeSpeler2;
        this.strSpelerWinnaar = strSpelerWinnaar;

        maakAchtergrond();
        maakButton();
        maakLabels();

        add(ok);
        add(opnieuw);
        add(jlTitel);
        add(jlSpeler1);
        add(jlTypeSpeler1);
        add(jlTypeSpeler2);

        setLayout(new BorderLayout());
        add(background);
    }

    private void maakAchtergrond(){
        background = new JLabel(new ImageIcon("src/resources/achtergrond/Winnaar.png"));
    }

    private void maakButton(){

        ok = new JButton(new ImageIcon("src/resources/buttons/ok.png"));
        ok.setRolloverIcon(new ImageIcon("src/resources/buttons/ok_h.png"));
        ok.setBorder(null);
        ok.setBounds(300, 415, 150, 51);
        ok.addActionListener(this);

        opnieuw = new JButton(new ImageIcon("src/resources/buttons/speelopnieuw.png"));
        opnieuw.setRolloverIcon(new ImageIcon("src/resources/buttons/speelopnieuw_h.png"));
        opnieuw.setBorder(null);
        opnieuw.setBounds(100, 415, 150, 51);
        opnieuw.addActionListener(this);
    }

    private void maakLabels() {
                                    /*  Strspeler1 word vervangen met de winnaar  */
        jlTitel = new JLabel("De winnaar is " + strSpeler1 + " Gefeliciteerd! met u overwinning");
        jlTitel.setBounds(200, 240, 400, 15);

        jlSpeler1 = new JLabel(strSpeler1 + " vs " + strSpeler2);
        jlSpeler1.setBounds(200, 255, 400, 15);


        jlTypeSpeler1 = new JLabel(strSpeler1 + " speelde met: " + strTypeSpeler1);
        jlTypeSpeler1.setBounds(200, 270, 400, 15);

        jlTypeSpeler2 = new JLabel(strSpeler2 + " speelde met: " + strTypeSpeler2);
        jlTypeSpeler2.setBounds(200, 285, 400, 15);


        }

        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource() == opnieuw){
                ToonNieuwProfiel toonNieuwProfiel = new ToonNieuwProfiel(spelFrame);
                toonNieuwProfiel.run();
            }

            if(e.getSource() == ok){
          ToonHoofdmenu toonHoofdmenu = new ToonHoofdmenu(spelFrame, true);
           toonHoofdmenu.run();
        }
    }

}





