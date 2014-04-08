package splashscreen;

import hoofdmenu.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 * Created by Bart on 7-4-2014.
 */
public class toonSplashscreen {

    private Timer timer;
    private Splashscreen splashscreen;

    public toonSplashscreen(){

        splashscreen = new Splashscreen();

        TimeListener tm = new TimeListener();
        timer = new Timer(3000, tm);
        timer.start();

    }

    class TimeListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            splashscreen.setVisible(false);
            new toonHoofdmenu();
            timer.stop();

        }
    }
}
