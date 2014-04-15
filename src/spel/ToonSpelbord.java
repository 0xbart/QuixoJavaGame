package spel;

import utils.Task;

import javax.swing.*;

/**
 * Created by Bart on 15-4-2014.
 */
public class ToonSpelbord extends Task {

    private JFrame spelFrame;

    public ToonSpelbord(JFrame spelFrame){

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

        spelFrame.setContentPane(new SpelBord(spelFrame));
        spelFrame.validate();
    }

}
