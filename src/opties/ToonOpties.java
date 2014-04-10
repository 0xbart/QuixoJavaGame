package opties;

import utils.Task;

import javax.swing.*;

/**
 * Created by Bart on 10-4-2014.
 */
public class ToonOpties extends Task {

    private JFrame spelFrame;

    public ToonOpties(JFrame spelFrame) {

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

        spelFrame.setContentPane(new Opties(spelFrame));
        spelFrame.validate();
    }
}
