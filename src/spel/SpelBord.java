package spel;

import spel.ingamehelp.ToonIngameHelp;
import spel.opties.ToonIngameOpties;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by Bart on 15-4-2014.
 */
public class SpelBord extends JPanel implements MouseListener {

    private JFrame spelFrame;
    private JLabel background, help, menu, jlSpeler1, jlSpeler2, jlTypeSpeler1, jlTypeSpeler2, jlSpelerZet;
    private JButton[] blokken = new JButton[25];

   // private ArrayList<SteenRij> bord;
    private Thread draadje; 							// Lijn is het draadje
    //private SteenRij[] schuifstenen = new SteenRij[5]; 	// Selectie. Deze 5 stenen gaan verschuiven.
    private boolean verschuiven;						// Gaan ze verschuiven? Ja of nee.

    private String strSpelerZet;
    private String strTypeSpelerZet;

    private String strSpeler1;
    private String strSpeler2;
    private String strTypeSpeler1;
    private String strTypeSpeler2;
    private int [] spelData = {
            0, 0, 0, 0, 0,
            0, 0, 0, 0, 0,
            0, 0, 0, 0, 0,
            0, 0, 0, 0, 0,
            0, 0, 0, 0, 0,
    };
    private int selected;

    public SpelBord (JFrame spelFrame, String strSpeler1, String strSpeler2, String strTypeSpeler1, String strTypeSpeler2, int[] spelData, String strSpelerZet, String strTypeSpelerZet) {

        this.spelFrame = spelFrame;
        this.strSpeler1 = strSpeler1;
        this.strSpeler2 = strSpeler2;
        this.strTypeSpeler1 = strTypeSpeler1;
        this.strTypeSpeler2 = strTypeSpeler2;
        this.spelData = spelData;
        this.strSpelerZet = strSpelerZet;
        this.strTypeSpelerZet = strTypeSpelerZet;

        maakAchtergrond();
        maakButtons();
        maakHelp();
        maakMenu();
        toevoegenButtons();
        maakLabels();

        add(help);
        add(menu);
        add(jlSpeler1);
        add(jlSpeler2);
        add(jlTypeSpeler1);
        add(jlTypeSpeler2);
        add(jlSpelerZet);

        setLayout(new BorderLayout());
        add(background);
    }

    private void maakAchtergrond(){
        background = new JLabel(new ImageIcon("src/resources/achtergrond/spelveld_bg.png"));
    }

    private void maakHelp() {
        help = new JLabel(new ImageIcon("src/resources/buttons/help.png"));
        help.setBounds(495, 10, 40, 40);
        help.setBorder(null);
        help.addMouseListener(this);
    }

    private void maakMenu() {
        menu = new JLabel(new ImageIcon("src/resources/buttons/menu.png"));
        menu.setBounds(15, 468, 121, 48);
        menu.setBorder(null);
        menu.addMouseListener(this);

    }

    private void maakLabels() {

        jlSpeler1 = new JLabel("Naam 1: " + strSpeler1);
        jlSpeler1.setBounds(15, 15, 400, 15);

        jlSpeler2 = new JLabel("Naam 2: " + strSpeler2);
        jlSpeler2.setBounds(15, 35, 400, 15);

        jlTypeSpeler1 = new JLabel(strSpeler1 + " speelt met: " + strTypeSpeler1);
        jlTypeSpeler1.setBounds(15, 55, 400, 15);

        jlTypeSpeler2 = new JLabel(strSpeler2 + " speelt met: " + strTypeSpeler2);
        jlTypeSpeler2.setBounds(15, 75, 400, 15);

        jlSpelerZet = new JLabel(strSpelerZet + " is aan zet");
        jlSpelerZet.setBounds(15, 95, 400, 15);
    }

    //Voorzien van JToggleButton zodat er geen aparte listeners gebruikt hoeven te worden.
    private void maakButtons() {

        int c = 0;

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){

                if(spelData[c] == 0) {
                    blokken[c] = new JButton(new ImageIcon("src/resources/spel/1.png"));
                } else if(spelData[c] == 1) {
                    blokken[c] = new JButton(new ImageIcon("src/resources/spel/3.png"));
                } else if(spelData[c] == 2) {
                    blokken[c] = new JButton(new ImageIcon("src/resources/spel/4.png"));
                } else if(spelData[c] == 3) {
                    blokken[c] = new JButton(new ImageIcon("src/resources/spel/2.png"));
                } else if(spelData[c] == 4) {
                    blokken[c] = new JButton(new ImageIcon("src/resources/spel/5.png"));
                } else if(spelData[c] == 5) {
                    blokken[c] = new JButton(new ImageIcon("src/resources/spel/6.png"));
                } else if(spelData[c] == 6) {
                    blokken[c] = new JButton(new ImageIcon("src/resources/spel/7.png"));
                }

                blokken[c].setBounds(130 + (j*57), 148 + (i*57), 57, 57);
                blokken[c].setBorder(null);
                blokken[c].addMouseListener(this);

                String naam = "" + c;

                blokken[c].setName(naam);
                c++;
            }
        }
    }

    private void toevoegenButtons() {

        for(int i = 0; i < 25; i++){
            add(blokken[i]);
        }
    }

    public void berekenOptie(int i) {

        int[][] veldArrData = {
                {0, 4, 20},
                {0, 4, 21},
                {0, 4, 22},
                {0, 4, 23},
                {0, 4, 24},
                {0, 9, 20},
                {},
                {},
                {},
                {4, 5, 24},
                {0, 14, 20},
                {},
                {},
                {},
                {4, 10, 24},
                {0, 19, 20},
                {},
                {},
                {},
                {4, 15, 24},
                {0, 20, 24},
                {1, 20, 24},
                {2, 20, 24},
                {3, 20, 24},
                {4, 20, 24}
        };

        for(int k = 0; k < veldArrData.length; k++){

            if(i == k) {

                for (int l = 0; l < veldArrData[i].length; l++) {
                    if (spelData[veldArrData[i][l]] == 0) {

                        spelData[veldArrData[i][l]] = 3;

                    } else if (spelData[veldArrData[i][l]] == 1) {

                        spelData[veldArrData[i][l]] = 5;

                    } else if (spelData[veldArrData[i][l]] == 2) {

                        spelData[veldArrData[i][l]] = 6;

                    }
                }
            }
        }
    }

    public void schoonVelden() {

        for(int k = 0; k < spelData.length; k++){
            if(spelData[k] == 3 || spelData[k] == 4){
                spelData[k] = 0;
            } else if(spelData[k] == 5){
                spelData[k] = 1;
            } else if(spelData[k] == 6){
                spelData[k] = 2;
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if(e.getSource() == help){
            ToonIngameHelp toonIngameHelp = new ToonIngameHelp(spelFrame, strSpeler1, strSpeler2, strTypeSpeler1, strTypeSpeler2, spelData, strSpelerZet, strTypeSpelerZet);
            toonIngameHelp.run();
        }

        if(e.getSource() == menu){
            ToonIngameOpties toonIngameOpties = new ToonIngameOpties(spelFrame, strSpeler1, strSpeler2, strTypeSpeler1, strTypeSpeler2, spelData, strSpelerZet, strTypeSpelerZet);
            toonIngameOpties.run();
        }

        for(int i = 0; i < 25; i++){

            if(e.getSource() == blokken[i]){

                String buttonNaam = ((JComponent) e.getSource()).getName();
                int nr = Integer.parseInt(buttonNaam);

                if(spelData[i] == 0) {
                    if(i == 6 || i == 7 || i == 8 || i == 11 || i == 12 || i == 13 || i == 16 || i == 17 || i == 18){

                    } else {

                        schoonVelden();

                        berekenOptie(i);
                        spelData[i] = 4;
                        selected = i;

                        ToonSpelbord toonSpelbord = new ToonSpelbord(spelFrame, strSpeler1, strSpeler2, strTypeSpeler1, strTypeSpeler2, spelData, strSpelerZet, strTypeSpelerZet);
                        toonSpelbord.run();

                    }
                } else if(spelData[i] == 3) {

                    int temp;

                    if (strTypeSpelerZet == "kruis") {
                        temp = 1;
                    } else {
                        temp = 2;
                    }

                    schoonVelden();
                    spelData[i] = temp;

                    if (strSpelerZet.equals(strSpeler1)) {
                        strSpelerZet = strSpeler2;
                    } else {
                        strSpelerZet = strSpeler1;
                    }

                    if (strTypeSpelerZet == "kruis") {
                        strTypeSpelerZet = "rond";
                    } else {
                        strTypeSpelerZet = "kruis";
                    }

                    ToonSpelbord toonSpelbord = new ToonSpelbord(spelFrame, strSpeler1, strSpeler2, strTypeSpeler1, strTypeSpeler2, spelData, strSpelerZet, strTypeSpelerZet);
                    toonSpelbord.run();
                } else if(spelData[i] == 5) {

                    // verplaats blokje naar links of rechts en doe er nog 1 bij.
                    // of verplaats hem een verdieping lager

                } else if(spelData[i] == 6) {

                    // verplaats blokje naar links of rechts en doe er nog 1 bij.
                    // of verplaats hem een verdieping lager

                }
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

        for(int i = 0; i < 25; i++){

            if(e.getSource() == blokken[i]){

                String buttonNaam = ((JComponent) e.getSource()).getName();
                int nr = Integer.parseInt(buttonNaam);

                if(spelData[i] == 0) {
                    if(i == 6 || i == 7 || i == 8 || i == 11 || i == 12 || i == 13 || i == 16 || i == 17 || i == 18){
                        blokken[nr].setRolloverIcon(new ImageIcon("src/resources/spel/1.png"));
                    } else {
                        blokken[nr].setRolloverIcon(new ImageIcon("src/resources/spel/5.png"));
                    }
                }
            }
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}