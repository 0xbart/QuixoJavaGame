import splashscreen.ToonSplashscreen;
import utils.Computer;
import utils.Task;

import javax.swing.*;

/**
 * Created by Bart on 16-4-2014.
 */
public class Start extends Task {

    private JFrame spelFrame;

    public Start(JFrame spelFrame) {

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

        Computer c = new Computer();

        return true;
    }

    private void execute() {

        ToonSplashscreen toonSplashscreen = new ToonSplashscreen(spelFrame);
        toonSplashscreen.run();
    }
}
