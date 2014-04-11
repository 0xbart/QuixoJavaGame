package hoofdmenu;

import utils.Task;

import javax.swing.*;

/**
 * Created by Bart on 9-4-2014.
 */
public class ToonHoofdmenu extends Task {

    private JFrame spelFrame;
    private boolean validate;

    public ToonHoofdmenu(JFrame spelFrame, boolean validate){

        this.spelFrame = spelFrame;
        this.validate = validate;
    }

    public void run() {

        boolean validate = validate();
        if(validate == true)
        {
            execute();
        }
    }

    private boolean validate() {

        if(validate == true) {
            return true;
        } else {
            return true;
        }
    }

    private void execute() {

        spelFrame.setContentPane(new Hoofdmenu(spelFrame));
        spelFrame.validate();
    }

}

/* Fix voor IntelliJ Joey */

