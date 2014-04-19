 package spel;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by Youri on 19-4-2014.
 */

// ALEEN DE METHODES MOETEN NOG GESCHREVEN WORDEN VOOR LOOP: SCHUIVEN

/* Methode voor oude plaats(!) moet worden meegegeven aan methode BlokjeVerzetten() :
1   2  3  4  5
6   7  8  9 10					        Plaats 12 bijvoorbeeld meegeven aan de methode.
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
*/

public class BlokjeVerzetten {

    private ArrayList SteenRij;
    private int[] schuifStenen = new int[5];           // ArrayList voor Steenrij (5 selecteren)
    private Thread lijn;                               // Lijn is het draadje
    private int richting;                              // Richting variabel.
    private boolean verschuiven;                       // Gaan ze verschuiven? Ja of nee.


    public void ZetBlokje( int plaatsOude, int plaatsNieuwe ) {
    /* Plaats 12 wordt meegegeven. Plaats 12 wordt omgezet in rij 3, kolom 2.*/

        int rijOude 	= plaatsOude / 5;                 // Oude rij van blokje.
        int kolomOude 	= plaatsOude % 5;                 // Oude kolom van blokje.
        int rijNieuwe	= plaatsNieuwe / 5;               // Nieuwe rij na het verzetten van blokje
        int kolomNieuwe = plaatsNieuwe % 5;               // Nieuwe kolom na het verzetten van blokje


        if ( rijOude == rijNieuwe ) // Check: Of oude rij gelijk is aan de nieuwe rij. (3 == 3) |
                                    // Dit gaat om de HORIZONTALE VERSCHUIVING!
        {


            if (kolomOude < kolomNieuwe)        // LINKS
                                                // Links of rechts d.m.v. kolom vergelijking. Als de
            {                                   // nieuwe waarde kleiner is. Dan gaat die naar links.

                int k = 0;        // Voor waarde op te hogen.
                for () {


                    // Verdere code voor posities te geven.


                }
                startRichting(1);
            }

            else if (kolomOude > kolomNieuwe)    // RECHTS
            {                                    // Links of rechts d.m.v. kolom vergelijking. Als de
                                                 // nieuwe waarde kleiner is. Dan gaat die naar rechts.

                int k = 0;        // Voor waarde op te hogen.
                for () {


                    // Verdere code voor posities te geven.


                }
                startRichting(2);
            }

        else System.out.println("Terminal: Geen zet gemaakt.");


        }

        else if (kolomOude == kolomNieuwe )	 // Check: Of oude rij gelijk is aan de nieuwe rij. (2 == 2) |
        {                                    // Dit gaat om de VERTICALE VERSCHUIVING!


            if (rijOude < rijNieuwe)            // OMLAAG
                                                // Omhoog of omlaag d.m.v. kolom vergelijking. Als de
            {                                   // nieuwe waarde kleiner is. Dan gaat die omlaag.


                int k = 0;        // Voor waarde op te hogen.
                for () {


                    // Verdere code voor posities te geven.


                }
                startRichting(3);
            }

            else if( rijOude > rijNieuwe)            // OMHOOG
                                                     // Omhoog of omlaag d.m.v. kolom vergelijking. Als de
            {                                        // nieuwe waarde kleiner is. Dan gaat die omlaag.

                 int k = 0;        // Voor waarde op te hogen.
                 for () {


                     // Verdere code voor posities te geven.


                 }
                 startRichting(4);


            }

            else (System.out.println("Er is een illigale set gemaakt. Afbreken");

            }
        }

   public void startVerplaatsen() {	            // Start het verplaatsen van de stenen en loopt door tot 58
                                                // De main unit voor het plaatsen van de stenen.
        int m = 0;
        while( verschuiven )
        {

            switch( richting )
            {
                case 1: // schuifstenen naar links
                    for( SteenRij view : schuifStenen )
                    {
                        if( view != null )
                            view.setLocation( view.getX()-1, view.getY() );
                    }

                    break;

                case 2: // schuifstenen naar rechts
                    for( SteenRij view : schuifStenen )
                    {
                        if( view != null )
                            view.setLocation( view.getX()+1, view.getY() );
                    }

                    break;

                case 3: // schuifstenen omlaag
                    for( SteenRij view : schuifStenen )
                    {
                        if( view != null )
                            view.setLocation( view.getX(), view.getY()-1 );
                    }

                    break;

                case 4: // schuifstenen omhoog
                    for( SteenRij view : schuifStenen )
                    {
                        if( view != null )
                            view.setLocation( view.getX(), view.getY()+1 );
                    }

                    break;

                default:
                    stop();
            }
            m++;
            if( m >= 58 )   // Berekening. Dan hoort het schuiven te stoppen.
                stop();
        }
   }


    public void startRichting (int richting) // De richting bepalen.
    {
        this.richting = richting;
        lijn.start();
        verschuiven = true;
    }

    public void stop()  					 // Stop het verplaatsen van de stenen.
    {
        for( int i = 0; i < schuifStenen.length; i++ )
        {
            schuifStenen[i] = null;
        }
        lijn = null;
        verschuiven = false;
    }

 }


// Nodig?
/*
    private void draaiSteen( SteenRij view )
     /*
    {
        if( view.getSteen().getStatus() == Steen.NULL )
        {
            if( thema.equals("zwart/wit") )
            {
                if( beurt == Steen.X )
                {
                    view.getSteen().setStatus( Steen.X );
                    ImageIcon img = new ImageIcon( "images/Spel/steenXWit.png" );
                    view.getLabel().setIcon( img );
                }
                else if( beurt  == Steen.O )
                {
                    view.getSteen().setStatus( Steen.O );
                    ImageIcon img = new ImageIcon( "images/Spel/steenOWit.png" );
                    view.getLabel().setIcon( img );
                }
            }
            else if( thema.equals("wit/zwart") )
            {
                if( beurt == Steen.X )
                {
                    view.getSteen().setStatus( Steen.X );
                    ImageIcon img = new ImageIcon( "images/Spel/steenXZwart.png" );
                    view.getLabel().setIcon( img );
                }
                else if( beurt  == Steen.O )
                {
                    view.getSteen().setStatus( Steen.O );
                    ImageIcon img = new ImageIcon( "images/Spel/steenOZwart.png" );
                    view.getLabel().setIcon( img );
                }
            }
        }
    }

*/
