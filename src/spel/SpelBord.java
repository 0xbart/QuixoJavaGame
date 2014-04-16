package spel;

import utils.Computer;

import javax.swing.*;
import java.awt.*;
import java.io.*;


/**
 * Created by Bart on 15-4-2014.
 */
public class SpelBord extends JPanel {

    protected Graphics g2d;
    private JFrame spelFrame;
    private JLabel background;

    private String naam1, naam2, type1, type2, datum;
    private String [] spelData = {naam1, naam2, type1, type2, datum };


    public SpelBord(JFrame spelFrame) {

        this.spelFrame = spelFrame;

        maakAchtergrond();

        setLayout(new BorderLayout());
        add(background);

        new Blokje();
        repaint();


    }

    private void maakAchtergrond(){
        background = new JLabel(new ImageIcon("src/resources/achtergrond/spelveld_bg.png"));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.g2d = g;

        repaint();
    }

    public class OpslaanSpelData {

        private OpslaanSpelData(String[] args) {

            Computer c = new Computer();
           // String filePath = c.getFILEPATH() + "SpelData.bin";
            String filePath = "Speldata.bin";

            try {
                DataOutputStream output = new DataOutputStream(new FileOutputStream(filePath));
                output.writeUTF(String.valueOf(spelData));
                /*output.writeUTF(naam2);
                output.writeUTF(type1);
                output.writeUTF(type2);*/
                output.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                DataInputStream input = new DataInputStream(new FileInputStream(filePath));
                System.out.println(input.readUTF());
                System.out.println(input.readUTF());
                System.out.println(input.readUTF());
                System.out.println(input.readUTF());
                input.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
