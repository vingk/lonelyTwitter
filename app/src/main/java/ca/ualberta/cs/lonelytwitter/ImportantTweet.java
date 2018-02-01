package ca.ualberta.cs.lonelytwitter;

/**
 * Created by sajediba on 1/17/18.
 */

import java.util.Date;

/**
 * Represents an important tweet.
 *
 * @author James Cook
 * @version 0.0
 * @see NormalTweet
 * @see Tweet
 */
public class ImportantTweet extends Tweet{

    /**
     * Construct an important tweet
     *
     * @param message the tweets message
     */
    public ImportantTweet(String message){
        super(message);
    }

    /**
     * Construct an important tweet
     *
     * @param message the tweets message
     * @param date the tweets date
     */
    public ImportantTweet(String message, Date date){
       super(message,date);
    }


    /**
     * Returns true since tweet is important
     *
     * @return true
     */
    @Override
    public boolean isImportant(){
        return true;
    }
}
