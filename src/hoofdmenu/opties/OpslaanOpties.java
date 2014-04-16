package hoofdmenu.opties;

import hoofdmenu.ToonHoofdmenu;
import utils.Task;

import javax.swing.*;

/**
 * Created by Bart on 16-4-2014.
 */
public class OpslaanOpties extends Task {

    private JFrame spelFrame;

    public OpslaanOpties(JFrame spelFrame) {

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

        return true;
    }

    private void execute() {

        ToonHoofdmenu toonHoofdmenu = new ToonHoofdmenu(spelFrame, true);
        toonHoofdmenu.run();
    }
}
