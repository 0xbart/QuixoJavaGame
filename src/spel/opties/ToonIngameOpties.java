package spel.opties;

import spel.ingamehelp.IngameHelp;
import utils.Task;

import javax.swing.*;

/**
 * Created by Bart on 17-4-2014.
 */
public class ToonIngameOpties extends Task {

    private JFrame spelFrame;

    public ToonIngameOpties(JFrame spelFrame){

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

        spelFrame.setContentPane(new IngameOpties(spelFrame));
        spelFrame.validate();
    }

}