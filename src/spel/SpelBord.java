package spel;

import hoofdmenu.help.ToonHelp;
import hoofdmenu.opties.ToonOpties;

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
    private JLabel[] blokken = new JLabel[25];

    private BorderLayout borderLayout = new BorderLayout(5,5);

    public static boolean checkIngame = true;

    public static boolean getCheckIngame() {
        return checkIngame;
    }

    public SpelBord(JFrame spelFrame) {

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

    private void maakButtons() {

        int c = 0;

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                blokken[c] = new JLabel(new ImageIcon("src/resources/spel/1.png"));
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

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        ToonHelp toonHelp = new ToonHelp(spelFrame);
        toonHelp.run();
        ToonOpties toonOpties = new ToonOpties(spelFrame);
        toonOpties.run();
    }

    @Override
    public void mouseEntered(MouseEvent e) {


    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
