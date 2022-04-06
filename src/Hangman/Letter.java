package Hangman;

import acm.graphics.GCompound;
import acm.graphics.GLabel;
import acm.graphics.GRect;

public class Letter extends GCompound {

        // if the player gets the letter wrong build a head

    public Letter(){
        // create a GRect
        GRect rect = new GRect(15 , 4);
        // create a GLabel
        GLabel label = new GLabel("");

        //add each of them to the compound
        add(rect, 0, 0);
        // the word is green if they guess the letter and got the letter wrong;
    }

}

