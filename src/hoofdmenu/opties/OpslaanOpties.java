package hoofdmenu.opties;

import hoofdmenu.ToonHoofdmenu;
import utils.Computer;
import utils.Task;

import javax.swing.*;
import java.io.*;

/**
 * Created by Bart on 16-4-2014.
 */
public class OpslaanOpties extends Task {

    private JFrame spelFrame;
    private String achtergrond_menu, achtergrond_spel, geluid_menu, geluid_spel;

    private String[] optiesData = {achtergrond_menu, achtergrond_spel, geluid_menu, geluid_spel};

    public OpslaanOpties(JFrame spelFrame, String achtergrond_menu, String achtergrond_spel, String geluid_menu, String geluid_spel) {

        this.achtergrond_menu = achtergrond_menu;
        this.achtergrond_spel = achtergrond_spel;
        this.geluid_menu = geluid_menu;
        this.geluid_spel = geluid_spel;
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

        boolean validate = true;

        Computer c = new Computer();
        String filePath = c.getFILEPATH() + "opties.bin";

        try {
            PrintWriter output = new PrintWriter(filePath);
            output.println(achtergrond_menu);
            output.println(achtergrond_spel);
            output.println(geluid_menu);
            output.println(geluid_spel);
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return validate;
    }

    private void execute() {

        ToonHoofdmenu toonHoofdmenu = new ToonHoofdmenu(spelFrame, true);
        toonHoofdmenu.run();
    }
}
