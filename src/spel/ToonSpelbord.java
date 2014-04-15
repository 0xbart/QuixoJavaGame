package spel;

import utils.Task;

import javax.swing.*;
import java.util.ArrayList;

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

    //Axel Boesenach (nog lang niet af)

    private String spelerRondje, spelerKruisje;
    private int[] spelBord = {
        0, 0, 0, 0, 0,
        0, 0, 0, 0, 0,
        0, 0, 0, 0, 0,
        0, 0, 0, 0, 0,
        0, 0, 0, 0, 0,
    };

    ArrayList<SpelBord> Bord  = new ArrayList<SpelBord>();

    public int[] getSpelBord() {
        return spelBord;
    }

    public void setSpelBord(int[] spelBord) {
        this.spelBord = spelBord;
    }
}
