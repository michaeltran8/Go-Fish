/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author josh_
 */
public class Deck
{
    ArrayList<Card>cards = new ArrayList<>();
    
    public ArrayList<String> makeDeck()
    {
        ArrayList<String> deck = new ArrayList<>();
        
        for(int i = 0; i < Card.Suit.values().length; i++)
        {
            for(int j = 0; j < Card.Value.values().length; j++)
            {
                Card card = new Card(Card.Suit.getSuit(i), Card.Value.getValue(j));
                cards.add(card);
            }
        }
        
        for(Card card : cards)
        {
            deck.add(card.toString());
        }
        
        return deck;          
    
    }
    
    public void removeCard(int index)
    {
        cards.remove(index);
    }
    
    public void shuffle()
    {
        Collections.shuffle(cards);
        Collections.shuffle(cards);
    }
    
    public void getCard(Deck deck)
    {
        cards.add(deck.cards.get(0));
        deck.removeCard(0);
        
    }
    
    public int getDeckSize()
    {
        return cards.size();
    }
}
