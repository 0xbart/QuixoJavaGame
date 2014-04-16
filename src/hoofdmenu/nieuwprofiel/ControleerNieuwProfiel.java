package hoofdmenu.nieuwprofiel;

import profiel.Profiel;
import spel.ToonSpelbord;
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

        boolean validate = false;

        if(strSpelerNaam1.isEmpty() || strSpelerNaam2.isEmpty() || strTypeNaam1 == null || strTypeNaam2 == null) {
            JOptionPane.showMessageDialog(null, "Niet alle velden zijn ingevuld!", "Oops.. een foutje", JOptionPane.INFORMATION_MESSAGE);
        } else if(strSpelerNaam1.equals(strSpelerNaam2)){
            JOptionPane.showMessageDialog(null, "De profielnamen moeten verschillend zijn.", "Oops.. een foutje", JOptionPane.INFORMATION_MESSAGE);
        } else if(strTypeNaam1.equals(strTypeNaam2)){
            JOptionPane.showMessageDialog(null, "Het is niet mogelijk om biede met een '"+ strTypeNaam1 + "' te spelen", "Oops.. een foutje", JOptionPane.INFORMATION_MESSAGE);
        } else {
            validate = true;
        }

        return validate;
    }

    private void execute() {

        Profiel p = new Profiel();
        p.setStrSpeler1(strSpelerNaam1);
        p.setStrSpeler2(strSpelerNaam2);
        p.setStrTypeSpeler1(strTypeNaam1);
        p.setStrTypeSpeler2(strTypeNaam2);

        ToonSpelbord toonSpelbord = new ToonSpelbord(spelFrame);
        toonSpelbord.run();
    }

}