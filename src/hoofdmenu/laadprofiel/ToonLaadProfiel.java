package hoofdmenu.laadprofiel;

import utils.Task;

import javax.swing.*;

/**
 * Created by Bart on 10-4-2014.
 */
public class ToonLaadProfiel extends Task {

    private JFrame spelFrame;

    public ToonLaadProfiel(JFrame spelFrame) {

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

        spelFrame.setContentPane(new LaadProfiel(spelFrame));
        spelFrame.validate();
    }

}
