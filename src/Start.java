import hoofdmenu.opties.Opties;
import splashscreen.ToonSplashscreen;
import utils.Computer;
import utils.Task;

import javax.swing.*;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Bart on 16-4-2014.
 */
public class Start extends Task {

    private JFrame spelFrame;

    public Start(JFrame spelFrame) {

        this.spelFrame = spelFrame;
    }

    public void run() {

        boolean validate = validate();

        if(validate == true)
        {
            execute();
        }
    }

    private boolean validate() {

        Computer c = new Computer();
        String filePath = c.getFILEPATH() + "opties.bin";

        Opties opties = new Opties(spelFrame);

        try{
            DataInputStream input = new DataInputStream(new FileInputStream(filePath));
            opties.setStrGeluidAchtergrondMenu(input.readUTF());
            opties.setStrGeluidAchtergrondSpel(input.readUTF());
            opties.setStrGeluidMenu(input.readUTF());
            opties.setStrGeluidSpel(input.readUTF());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }

    private void execute() {

        ToonSplashscreen toonSplashscreen = new ToonSplashscreen(spelFrame);
        toonSplashscreen.run();
    }
}
