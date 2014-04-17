package spel;

import profiel.Profiel;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Bart on 16-4-2014.
 */
public class SpelData {

    private Profiel strSpeler1, strSpeler2, strTypeSpeler1, strTypeSpeler2, spelData;
    private String type = "Rondje/Kruisje";





    /*private int [] spelData = {
            0, 0, 0, 0, 0,
            0, 0, 0, 0, 0,
            0, 0, 0, 0, 0,
            0, 0, 0, 0, 0,
            0, 0, 0, 0, 0
    };*/

    public SpelData(Profiel strSpeler1, Profiel strSpeler2, Profiel strTypeSpeler1, Profiel strTypeSpeler2, Profiel spelData) {
        this.strSpeler1 = strSpeler1;
        this.strSpeler2 = strSpeler2;
        this.strTypeSpeler1 = strTypeSpeler1;
        this.strTypeSpeler2 = strTypeSpeler2;
        this.spelData =  spelData;
    }




    //Spelerinformatie
   /*private String spelerX, spelerO;
    private int spelerType1, spelerType2;

    int kruisje = spelerType1;
    int rondje = spelerType2;



    public SpelData(String spelerX, String spelerO, int spelerType1, int spelerType2){
        this.spelerX = spelerX;
        this.spelerO = spelerO;
        this.spelerType1 = spelerType1;
        this.spelerType2 = spelerType2;
    }

    public String getSpelerX(){return spelerX;}

    public void setSpelerX(String spelerX){this.spelerX = spelerX;}

    public String getSpelerO(){return spelerO;}

    public void setSpelerO(String spelerO){this.spelerO = spelerO;}

    public int getSpelerType1(){return spelerType1;}

    public void setSpelerType1(int spelerType1){this.spelerType1 = spelerType1;}

    public int getSpelerType2(){return spelerType2;}

    public void setSpelerType2(int spelerType2){this.spelerType2 = spelerType2;}


    */


}
