package splashscreen;

import hoofdmenu.ToonHoofdmenu;
import utils.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Bart on 9-4-2014.
 */
public class ToonSplashscreen extends Task {

    private JFrame spelFrame;
    private Timer timer;
    private boolean validate = true;

    public ToonSplashscreen(JFrame spelFrame){

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

        new Computer();
        return true;
    }

    private void execute() {

        spelFrame.setContentPane(new Splashscreen(spelFrame));

        TimeListener tm = new TimeListener();
        timer = new Timer(300, tm);
        timer.start();

        validate = true;
    }

    class TimeListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            ToonHoofdmenu toonHoofdmenu = new ToonHoofdmenu(spelFrame, validate);
            toonHoofdmenu.run();
            timer.stop();
        }
    }
}