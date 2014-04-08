/*package splashscreen;

import utils.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Created by Bart on 7-4-2014.

public class ToonSplashscreen extends Task {

    private JFrame gameFrame;

    private Timer timer;
    private Splashscreen splashscreen;

    public ToonSplashscreen(JFrame gameFrame){

        this.gameFrame = gameFrame;
        run();

        TimeListener tm = new TimeListener();
        timer = new Timer(3000, tm);
        timer.start();

    }

    private void run() {
        new Splashscreen(gameFrame);
        gameFrame.add(new JLabel("ddd"));
    }

    class TimeListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            System.out.println("test");

        }
    }

}
*/
