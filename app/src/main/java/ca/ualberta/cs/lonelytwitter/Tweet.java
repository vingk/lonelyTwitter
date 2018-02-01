/*
 * Copyright 2018 James Cook
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE
 * AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a tweet.
 *
 * @author James Cook
 * @version 0.0
 * @see NormalTweet
 * @see ImportantTweet
 */
public abstract class Tweet implements Tweetable{

    private String message;
    private Date date;

    /**
     * Constructs a tweet
     */
    public Tweet(){

    }

    /**
     * Constructs a tweet
     *
     * @param message the tweet message
     */
    public Tweet(String message){
        this.message = message;
    }

    /**
     * Constructs a tweet object.
     *
     * @param message the tweet message
     * @param date the date the tweet was posted
     */
    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    /**
     * Get the tweet date.
     *
     * @return this.date the tweet date
     */
    public Date getDate(){
        return date;

    }

    /**
     * Get the tweet message.
     *
     * @return this.message the tweet message
     */
    public String getMessage(){
        return message;
    }

    /**
     * Sets the tweet message
     *
     * @param message the tweet message
     * @throws TweetTooLongException thrown if tweet exceeds 140 characters
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 160){
            // throw an error
            throw new TweetTooLongException();
        }

        this.message = message;
    }

    /**
     * Sets the tweet date
     *
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Returns true if tweet is important and false otherwise.
     *
     * @return important status
     */
    public abstract boolean isImportant();


    /**
     * Converts the class into a string
     *
     * @return a string representation of the class
     */
    @Override
    public String toString(){
        return message;
    }
}
