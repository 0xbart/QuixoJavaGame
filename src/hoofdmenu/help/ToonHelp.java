package hoofdmenu.help;

import utils.*;

import javax.swing.*;

/**
 * Created by Bart on 10-4-2014.
 */
public class ToonHelp extends Task {

    private JFrame spelFrame;

    public ToonHelp(JFrame spelFrame){

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

        spelFrame.setContentPane(new Help(spelFrame));
        spelFrame.validate();
    }

}
