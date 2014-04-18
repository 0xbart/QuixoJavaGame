package spel;

import spel.ingamehelp.ToonIngameHelp;
import spel.opties.ToonIngameOpties;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by Bart on 15-4-2014.
 */
public class SpelBord extends JPanel implements MouseListener {

    private JFrame spelFrame;
    private JLabel background, help, menu, jlSpeler1, jlSpeler2, jlTypeSpeler1, jlTypeSpeler2;
    private JButton[] blokken = new JButton[25];

    private String strSpelerZet;
    private String strTypeSpelerZet;

    private int[] intWijzigZet;

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

    public SpelBord (JFrame spelFrame, String strSpeler1, String strSpeler2, String strTypeSpeler1, String strTypeSpeler2, int[] spelData) {

        this.spelFrame = spelFrame;
        this.strSpeler1 = strSpeler1;
        this.strSpeler2 = strSpeler2;
        this.strTypeSpeler1 = strTypeSpeler1;
        this.strTypeSpeler2 = strTypeSpeler2;
        this.spelData = spelData;

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

    private void berekenVelden(int i){
        switch (i){
            case 0:
                if(spelData[4] == 0){
                    spelData[4] = 3;
                }

                if(spelData[20] == 0){
                    spelData[20] = 3;
                }
                break;
            case 1:
                if(spelData[0] == 0){
                    spelData[0] = 3;
                }

                if(spelData[4] == 0){
                    spelData[4] = 3;
                }

                if(spelData[21] == 0){
                    spelData[21] = 3;
                }
                break;
            case 2:
                if(spelData[4] == 0){
                    spelData[4] = 3;
                }

                if(spelData[0] == 0){
                    spelData[0] = 3;
                }

                if(spelData[22] == 0){
                    spelData[22] = 3;
                }
                break;
            case 3:
                if(spelData[4] == 0){
                    spelData[4] = 3;
                }

                if(spelData[4] == 0){
                    spelData[4] = 3;
                }

                if(spelData[23] == 0){
                    spelData[23] = 3;
                }
                break;
            case 4:
                if(spelData[0] == 0){
                    spelData[0] = 3;
                }

                if(spelData[24] == 0){
                    spelData[24] = 3;
                }
                break;
            case 5:
                if(spelData[0] == 0){
                    spelData[0] = 3;
                }

                if(spelData[20] == 0){
                    spelData[20] = 3;
                }

                if(spelData[9] == 0){
                    spelData[9] = 3;
                }
                break;
            case 9:
                if(spelData[4] == 0){
                    spelData[4] = 3;
                }

                if(spelData[5] == 0){
                    spelData[5] = 3;
                }

                if(spelData[24] == 0){
                    spelData[24] = 3;
                }
                break;
            case 10:
                if(spelData[0] == 0){
                    spelData[0] = 3;
                }

                if(spelData[20] == 0){
                    spelData[20] = 3;
                }

                if(spelData[14] == 0){
                    spelData[14] = 3;
                }
                break;
            case 14:
                if(spelData[10] == 0){
                    spelData[10] = 3;
                }

                if(spelData[4] == 0){
                    spelData[4] = 3;
                }

                if(spelData[24] == 0){
                    spelData[24] = 3;
                }
                break;
            case 15:
                if(spelData[0] == 0){
                    spelData[0] = 3;
                }

                if(spelData[20] == 0){
                    spelData[20] = 3;
                }

                if(spelData[19] == 0){
                    spelData[19] = 3;
                }
                break;
            case 19:
                if(spelData[15] == 0){
                    spelData[15] = 3;
                }

                if(spelData[24] == 0){
                    spelData[24] = 3;
                }

                if(spelData[4] == 0){
                    spelData[4] = 3;
                }
                break;
            case 20:
                if(spelData[0] == 0){
                    spelData[0] = 3;
                }

                if(spelData[24] == 0){
                    spelData[24] = 3;
                }
                break;
            case 21:
                if(spelData[20] == 0){
                    spelData[20] = 3;
                }

                if(spelData[24] == 0){
                    spelData[24] = 3;
                }

                if(spelData[1] == 0){
                    spelData[1] = 3;
                }
                break;
            case 22:
                if(spelData[2] == 0){
                    spelData[2] = 3;
                }

                if(spelData[24] == 0){
                    spelData[24] = 3;
                }

                if(spelData[20] == 0){
                    spelData[20] = 3;
                }
                break;
            case 23:
                if(spelData[3] == 0){
                    spelData[3] = 3;
                }

                if(spelData[20] == 0){
                    spelData[20] = 3;
                }

                if(spelData[24] == 0){
                    spelData[24] = 3;
                }
                break;
            case 24:
                if(spelData[20] == 0){
                    spelData[20] = 3;
                }

                if(spelData[4] == 0){
                    spelData[4] = 3;
                }
                break;
        }
    }

    public void schoonVelden() {

        for(int k = 0; k < spelData.length; k++){
            if(spelData[k] == 3){
                spelData[k] = 0;
            }
        }

        for(int l = 0; l < spelData.length; l++){
            if(spelData[l] == 4){
                spelData[l] = 0;
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if(e.getSource() == help){
            ToonIngameHelp toonIngameHelp = new ToonIngameHelp(spelFrame, strSpeler1, strSpeler2, strTypeSpeler1, strTypeSpeler2, spelData);
            toonIngameHelp.run();
        }

        if(e.getSource() == menu){
            ToonIngameOpties toonIngameOpties = new ToonIngameOpties(spelFrame, strSpeler1, strSpeler2, strTypeSpeler1, strTypeSpeler2, spelData);
            toonIngameOpties.run();
        }

        for(int i = 0; i < 25; i++){

            if(e.getSource() == blokken[i]){

                String buttonNaam = ((JComponent) e.getSource()).getName();
                int nr = Integer.parseInt(buttonNaam);

                if(spelData[i] == 0) {
                    if(i == 6 || i == 7 || i == 8 || i == 11 || i == 12 || i == 13 || i == 16 || i == 17 || i == 18){

                    } else {
                        if(spelData[i] == 3){
                            //blokje was geel en wordt nu anders... -_-!
                        } else {

                            schoonVelden();

                            spelData[i] = 4;

                            berekenVelden(i);

                            ToonSpelbord toonSpelbord = new ToonSpelbord(spelFrame, strSpeler1, strSpeler2, strTypeSpeler1, strTypeSpeler2, spelData);
                            toonSpelbord.run();
                        }
                    }
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