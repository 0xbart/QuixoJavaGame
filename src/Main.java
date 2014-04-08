import splashscreen.ToonSplashscreen;
import javax.swing.*;
import java.awt.*;

/**
 * Created by Bart on 1-4-2014.
 */
public class Main extends JFrame {

    public static void main (String[] args) {

        /**

            JAVA PROGRAMMEREN - IPSEN1 - Groep 4 - INF1G
            ============================================

            Bart Mauritz (projectleider)
            Axel Boesenach
            Joey Rentenaar
            Youri Kool

         */

        JFrame spelFrame = new JFrame();

        spelFrame.setTitle("Quixo - IPSEN1 - INF1G Groep 4");
        spelFrame.setSize(550, 550);
        spelFrame.setResizable(false);
        spelFrame.setLocationRelativeTo(null);
        spelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        spelFrame.setLayout(null);

        ToonSplashscreen toonSplashscreen = new ToonSplashscreen(spelFrame);
        toonSplashscreen.run();

        spelFrame.setVisible(true);

    }
}
