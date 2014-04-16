package hoofdmenu.opties;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Bart on 10-4-2014.
 */
public class Opties extends JPanel implements ActionListener{

    private String[] jcbKeuzes = {"ja", "nee"};
    private String[] jcbKeuzesMuis = {"linkshandig", "rechtshandig"};

    OptiesData optiesData = new OptiesData();

    private JFrame spelFrame;
    private JComboBox achtergrond_menu, achtergrond_spel, geluid_menu, geluid_spel, muis;
    private JButton terug;
    private JLabel background;

    public Opties(JFrame spelFrame) {

        this.spelFrame = spelFrame;

        maakAchtergrond();
        maakCombo();
        maakComboMuis();
        maakButton();

        setLayout(null);
        add(achtergrond_menu);
        add(achtergrond_spel);
        add(geluid_menu);
        add(geluid_spel);
        add(muis);
        add(terug);

        setLayout(new BorderLayout());
        add(background);
    }

    private void maakAchtergrond(){
        background = new JLabel(new ImageIcon("src/resources/achtergrond/opties_bg.png"));
    }

    private void maakButton(){

        terug = new JButton(new ImageIcon("src/resources/buttons/ok.png"));
        terug.setRolloverIcon(new ImageIcon("src/resources/buttons/ok_h.png"));
        terug.setBorder(null);
        terug.setBounds(200, 420, 150, 51);
        terug.addActionListener(this);
    }

    private void maakCombo(){

        achtergrond_menu = new JComboBox(jcbKeuzes);
        achtergrond_menu.setBorder(null);
        achtergrond_menu.setBounds(380, 130, 75, 25);
        achtergrond_menu.setBackground(new Color(130,128,122));
        achtergrond_menu.setForeground(new Color(107,54,31));
        achtergrond_menu.setSelectedItem(optiesData.getStrGeluidAchtergrondMenu());

        achtergrond_spel = new JComboBox(jcbKeuzes);
        achtergrond_spel.setBorder(null);
        achtergrond_spel.setBounds(380, 170, 75, 25);
        achtergrond_spel.setBackground(new Color(130,128,122));
        achtergrond_spel.setForeground(new Color(107,54,31));
        achtergrond_spel.setSelectedItem(optiesData.getStrGeluidAchtergrondSpel());

        geluid_menu = new JComboBox(jcbKeuzes);
        geluid_menu.setBorder(null);
        geluid_menu.setBounds(380, 210, 75, 25);
        geluid_menu.setBackground(new Color(130,128,122));
        geluid_menu.setForeground(new Color(107,54,31));
        geluid_menu.setSelectedItem(optiesData.getStrGeluidMenu());

        geluid_spel = new JComboBox(jcbKeuzes);
        geluid_spel.setBorder(null);
        geluid_spel.setBounds(380, 250, 75, 25);
        geluid_spel.setBackground(new Color(130,128,122));
        geluid_spel.setForeground(new Color(107,54,31));
        geluid_spel.setSelectedItem(optiesData.getStrGeluidSpel());
    }

    private void maakComboMuis(){

        muis = new JComboBox(jcbKeuzesMuis);
        muis.setBorder(null);
        muis.setBounds(340, 320, 115, 25);
        muis.setBackground(new Color(130,128,122));
        muis.setForeground(new Color(107,54,31));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String strGeluidAchtergrondMenu = (String) achtergrond_menu.getSelectedItem();
        String strGeluidAchtergrondSpel = (String) achtergrond_spel.getSelectedItem();
        String strGeluidMenu = (String) geluid_menu.getSelectedItem();
        String strGeluidSpel = (String) geluid_spel.getSelectedItem();

        optiesData.setStrGeluidAchtergrondMenu(strGeluidAchtergrondMenu);
        optiesData.setStrGeluidAchtergrondSpel(strGeluidAchtergrondSpel);
        optiesData.setStrGeluidMenu(strGeluidMenu);
        optiesData.setStrGeluidSpel(strGeluidSpel);

        OpslaanOpties opslaanOpties = new OpslaanOpties(spelFrame, optiesData.getStrGeluidAchtergrondMenu(), optiesData.getStrGeluidAchtergrondSpel(), optiesData.getStrGeluidMenu(), optiesData.getStrGeluidSpel());
        opslaanOpties.run();
    }
}
