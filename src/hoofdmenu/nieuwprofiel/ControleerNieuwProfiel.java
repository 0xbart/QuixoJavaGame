package hoofdmenu.nieuwprofiel;

import utils.Task;

import javax.swing.*;

/**
 * Created by Bart on 10-4-2014.
 */
public class ControleerNieuwProfiel extends Task {

    private JFrame spelFrame;
    private String strSpelerNaam1;
    private String strSpelerNaam2;
    private String strTypeNaam1;
    private String strTypeNaam2;

    public ControleerNieuwProfiel(JFrame spelFrame, String strSpelerNaam1, String strSpelerNaam2, String strTypeNaam1, String strTypeNaam2) {

        this.spelFrame = spelFrame;
        this.strSpelerNaam1 = strSpelerNaam1;
        this.strSpelerNaam2 = strSpelerNaam2;
        this.strTypeNaam1 = strTypeNaam1;
        this.strTypeNaam2 = strTypeNaam2;
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

        System.out.println("Speler 1: " + strSpelerNaam1);
        System.out.println("Speler 2: " + strSpelerNaam2);
        System.out.println("Type speler 1: " + strTypeNaam1);
        System.out.println("Type speler 2: " + strTypeNaam2);
    }

}