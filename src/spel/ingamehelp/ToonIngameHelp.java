package spel.ingamehelp;

import utils.Task;

import javax.swing.*;

/**
 * Created by Bart on 17-4-2014.
 */
public class ToonIngameHelp extends Task {

    private JFrame spelFrame;

    public ToonIngameHelp(JFrame spelFrame){

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

        spelFrame.setContentPane(new IngameHelp(spelFrame));
        spelFrame.validate();
    }

}
