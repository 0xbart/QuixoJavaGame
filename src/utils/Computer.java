package utils;

import java.io.File;
import java.io.IOException;

/**
 * Created by Bart on 4-4-2014.
 */
public class Computer {

    private static String HOMEDIR;
    private static String SP = "/";

    /**
        Linux => /
        Windows => \
     */

    public static void Computer(){

        File currentDirectory = new File(new File(".").getAbsolutePath());

        try {
            HOMEDIR = currentDirectory.getCanonicalPath();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (HOMEDIR.indexOf(SP) < 0)
        {
            //Windows applicatie
            SP = "\\";
        }

        if(SP == "/") { System.out.println("lINUX DISTRIBUTIE GESELECTEERD"); }
        if(SP == "\\") { System.out.println("WINDOWS DISTRIBUTIE GESELECTEERD"); }

    }

}
