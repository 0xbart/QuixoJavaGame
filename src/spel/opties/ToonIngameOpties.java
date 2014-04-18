package spel.opties;

import utils.Task;

import javax.swing.*;

/**
 * Created by Bart on 17-4-2014.
 */
public class ToonIngameOpties extends Task {

    private JFrame spelFrame;

    String strSpeler1;
    String strSpeler2;
    String strTypeSpeler1;
    String strTypeSpeler2;
    int[] spelData;

    public ToonIngameOpties(JFrame spelFrame, String strSpeler1, String strSpeler2, String strTypeSpeler1, String strTypeSpeler2, int[] spelData){

        this.spelFrame = spelFrame;
        this.strSpeler1 = strSpeler1;
        this.strSpeler2 = strSpeler2;
        this.strTypeSpeler1 = strTypeSpeler1;
        this.strTypeSpeler2 = strTypeSpeler2;
        this.spelData = spelData;
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

        spelFrame.setContentPane(new IngameOpties(spelFrame, strSpeler1, strSpeler2, strTypeSpeler1, strTypeSpeler2, spelData));
        spelFrame.validate();
    }

}