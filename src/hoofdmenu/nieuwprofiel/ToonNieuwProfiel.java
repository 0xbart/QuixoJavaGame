package hoofdmenu.nieuwprofiel;

import utils.Task;

import javax.swing.*;

/**
 * Created by Bart on 10-4-2014.
 */
public class ToonNieuwProfiel extends Task {

    private JFrame spelFrame;

    public ToonNieuwProfiel(JFrame spelFrame) {

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

        spelFrame.setContentPane(new NieuwProfiel(spelFrame));
        spelFrame.validate();
    }

}
