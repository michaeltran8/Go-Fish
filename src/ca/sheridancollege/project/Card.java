/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author michael, chunantai, Joshua 2020
 */
public class Card 
{
    //default modifier for child classes
    public enum Suit
    {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, 
    };
    public enum Value
    {
        DIAMONDS, SPADES, CLUBS, HEARTS 
    };
    private final Suit suit;
    private final Value value;
    
        public Card(Suit s, Value val)
        {
            suit = s;
            value = val;
        }
        public Value getValue()
        {
            return value;
        }
        public Suit getSuit()
        {
         return suit;   
        }
    
    
    /**
     * Students should implement this method for their specific children classes 
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    
}
