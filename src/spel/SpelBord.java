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
    private JLabel background, help, menu;
    private JToggleButton[] blokken = new JToggleButton[25];



    public SpelBord (JFrame spelFrame ) {

        this.spelFrame = spelFrame;


        maakAchtergrond();
        maakButtons();
        maakHelp();
        maakMenu();
        toevoegenButtons();

        add(help);
        add(menu);

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

    //Voorzien van JToggleButton zodat er geen aparte listeners gebruikt hoeven te worden.
    private void maakButtons() {

        int c = 0;

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                blokken[c] = new JToggleButton(new ImageIcon("src/resources/spel/1.png"));
                blokken[c].setRolloverIcon(new ImageIcon("src/resources/spel/5.png"));
                blokken[c].setPressedIcon(new ImageIcon("src/resources/spel/3.png"));
                blokken[c].setDisabledIcon(new ImageIcon("src/resources/spel/4.png"));
                blokken[c].setBounds(130 + (j*57), 148 + (i*57), 57, 57);
                blokken[c].setBorder(null);
                c++;

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
            ToonIngameHelp toonIngameHelp = new ToonIngameHelp(spelFrame);
            toonIngameHelp.run();
        }

        if(e.getSource() == menu){
            ToonIngameOpties toonIngameOpties = new ToonIngameOpties(spelFrame);
            toonIngameOpties.run();
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

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
