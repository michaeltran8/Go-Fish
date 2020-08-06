/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 */
public class GroupOfCards 
{
   
    //The group of cards, stored in an ArrayList
    private ArrayList <Card> cards;
    private int size;//the size of the grouping
    private String cardSuit;
    private int cardValue;
    private int cardsRemaining;

    public String getCardSuit()
    {
        return cardSuit;
    }

    public void setCardSuit(String suit)
    {
        this.cardSuit = cardSuit;
    }

    public int getCardValue()
    {
        return cardValue;
    }

    public void setValue(int cardValue)
    {
        this.cardValue = cardValue;
    }
    
    public GroupOfCards(int givenSize)
    {
        size = givenSize;
    }
    
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public ArrayList<Card> showCards()
    {
        return cards;
    }
    
    public void shuffle()
    {
        Collections.shuffle(cards);
    }

    public int getCardsRemaining()
    {
        return cardsRemaining;
    }

    public void setCardsRemaining(int cardsRemaining)
    {
        this.cardsRemaining = cardsRemaining;
    }
    
 

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }
    public String toString()
    {
        return null;
    }
    
}//end class
