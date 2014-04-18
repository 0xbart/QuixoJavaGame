package spel;

import spel.ingamehelp.ToonIngameHelp;
import spel.opties.ToonIngameOpties;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by Bart on 15-4-2014.
 */
public class SpelBord extends JPanel implements MouseListener {

    private JFrame spelFrame;
    private JLabel background, help, menu, jlSpeler1, jlSpeler2, jlTypeSpeler1, jlTypeSpeler2;
    //private JButton[] blokken = new JButton[25];
    private int[][] blokken = new int[5][5];


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
    private char aanZet = 'X'; //Kruisje begint met de zet
    private char token = ' ';
    private JLabel status = new JLabel("Kruisje is aan zet."); //Maakt aanzet label

    public SpelBord (JFrame spelFrame, String strSpeler1, String strSpeler2, String strTypeSpeler1, String strTypeSpeler2, int[] spelData) {

        this.spelFrame = spelFrame;
        this.strSpeler1 = strSpeler1;
        this.strSpeler2 = strSpeler2;
        this.strTypeSpeler1 = strTypeSpeler1;
        this.strTypeSpeler2 = strTypeSpeler2;
        this.spelData = spelData;

        maakAchtergrond();
       // maakButtons();
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
/*
    private void maakButtons() {

        int c = 0;

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                blokken[c] = new JButton(new ImageIcon("src/resources/spel/1.png"));
                blokken[c].setBounds(130 + (j*57), 148 + (i*57), 57, 57);
                blokken[c].setBorder(null);
                blokken[c].addMouseListener(this);

                String naam = "" + c;

                blokken[c].setName(naam);
                c++;
            }
        }
    } */

    //Nagaan of het grid vol is.
    public boolean isVol() {
        int c = 0;
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; i++)
                if (blokken[c].getToken() == ' ')
                    return false;

        return true;
    }

    //Nagaan of er een winnaar is.
    public boolean isWinnaar(char token) {
        int c = 0;
        for (int i = 0; i < 5; i++)
            if ((blokken[c][0].getToken() == token)
                    && (blokken[c][1].getToken() == token)
                    && (blokken[c][2].getToken() == token)
                    && (blokken[c][3].getToken() == token)
                    && (blokken[c][4].getToken() == token)) {
                return true;
            }
        for (int j = 0; j < 5; j++)
            if ((blokken[0][j].getToken() == token)
                    && (blokken[1][j].getToken() == token)
                    && (blokken[2][j].getToken() == token)
                    && (blokken[3][j].getToken() == token)
                    && (blokken[4][j].getToken() == token)) {
                return true;
            }
        if ((blokken[0][0].getToken() == token)
                && (blokken[1][1].getToken() == token)
                && (blokken[2][2].getToken() == token)
                && (blokken[3][3].getToken() == token)
                && (blokken[4][4].getToken() == token)) {
            return true;
        }
        if ((blokken[0][4].getToken() == token)
                && (blokken[1][1].getToken() == token)
                && (blokken[2][2].getToken() == token)
                && (blokken[3][3].getToken() == token)
                && (blokken[4][0].getToken() == token)) {
            return false;
        }

    }

    public class Button extends JButton {
        private char token = ' ';
    }

    public SpelBord() {
        addMouseListener(new MyMouseListener());
    }


    //Geef token terug
    public char getToken() {
        return token;
    }

    //Nieuwe token
    public void setToken(char c) {
        token = c;
        repaint();
    }

    //Verander Button
    protected void veranderButton(ImageIcon i) {
        super.veranderButton(i);

        if (token == 'X') {
            ImageIcon blokken = new ImageIcon("src/resources/spel/4.png");
        } else if (token == 'O') {
            ImageIcon blokken = new ImageIcon("src/resources/spel/5.png");
        }
    }

    private class MyMouseListener extends MouseAdapter {
        //Afhandelen muisklik
        public void mouseClicked(MouseEvent e) {
            //Als Button leeg is en spel nog niet voorbij
            if (token == ' ' && aanZet != ' ') {
                setToken(aanZet);

                if (isWinnaar(aanZet)) {
                    status.setText(aanZet + " heeft gewonnen!");
                    aanZet = ' ';
                } else if (isVol()) {
                    status.setText("Het spel is voorbij!");
                } else {
                    //Verwissel wie er aan zet is
                    aanZet = (aanZet == 'X') ? 'O': 'X';
                    //Toon wie er aan de beurt is
                    status.setText(aanZet + " is aan de beurt!");
                }


            }
        }

    }

    private void toevoegenButtons() {

        for(int i = 0; i < 25; i++){
            add(blokken[i]);
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

    }

    @Override
    public void mousePressed(MouseEvent e) {


    }

    @Override
    public void mouseReleased(MouseEvent e) {
        for(int i = 0; i < 25; i++) {
             if (e.getSource() == blokken[i]) {
                 blokken[i].setIcon(new ImageIcon("src/resources/spel/4.png"));

            }
        }


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
