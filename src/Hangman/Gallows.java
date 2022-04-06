package Hangman;

import acm.graphics.GCompound;
import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;

public class Gallows extends GCompound {

    public Gallows(){
        // make the base
            // make a GRect
            //add the GRect to the compound
        GRect base = new GRect(100, 1);
        add(base);
        // make the pole
        GRect pole = new GRect(1, 100);
        add(pole, base.getX(), base.getY() - pole.getHeight());
        // make the arm
        GRect arm= new GRect(100, 1);
        add(arm, pole.getX(), pole.getY());

        GRect rope = new GRect(1, 20);
        add(rope, arm.getX() + arm.getWidth(),arm.getY());

        // make the stickfigure
        GOval head = new GOval( 50,  50 );
        add(head, rope.getX(), rope.getY() + rope.getHeight());
        GRect line = new GRect (0, 50 );
        add(line, head.getX()+ head.getWidth() / 2 , head.getY() + head. getHeight());
    }

}