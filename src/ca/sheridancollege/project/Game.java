package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author josh_
 */
public class Game
{

    private int numOfPlayers;

    public Game()
    {

    }

    public Game(int numOfPlayers)
    {
        setNumOfPlayers(numOfPlayers);
        play(numOfPlayers);
    }

    public int getNumOfPlayers()
    {
        return numOfPlayers;
    }

    public void setNumOfPlayers(int numOfPlayers)
    {
        this.numOfPlayers = numOfPlayers;
    }

    public void play(int numOfPlayers)
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Card>> playerHands = new ArrayList<ArrayList<Card>>(numOfPlayers);

        ArrayList<Card> p1 = new ArrayList<Card>();
        ArrayList<Card> p2 = new ArrayList<Card>();
        ArrayList<Card> p3 = new ArrayList<Card>();
        ArrayList<Card> p4 = new ArrayList<Card>();

        Deck deck = new Deck();

        deck.makeDeck();

        deck.shuffle();

        switch (numOfPlayers)
        {
            case 2:
                playerHands.add(populateHand(p1, deck));
                playerHands.add(populateHand(p2, deck));
                break;
            case 3:
                playerHands.add(populateHand(p1, deck));
                playerHands.add(populateHand(p2, deck));
                playerHands.add(populateHand(p3, deck));
                break;
            case 4:
                playerHands.add(populateHand(p1, deck));
                playerHands.add(populateHand(p2, deck));
                playerHands.add(populateHand(p3, deck));
                playerHands.add(populateHand(p4, deck));
                break;
        }

        for (int i = 0; i < numOfPlayers; i++)
        {
            int asking;
            System.out.println("Player " + (i + 1) + "'s Turn");
            System.out.println(playerHands.get(i).toString());

            System.out.println("Which player do you want to ask");
            asking = sc.nextInt();
            switch (asking)
            {
                case 1:
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }

        }

    }

    private void turn(ArrayList players)
    {
        for (int i = 0; i < numOfPlayers; i++)
        {
            for (int j = 0; j < players.size(); j++)
            {
                System.out.print(players.get(j) + " ");
            }
            System.out.println();
        }
    }

    public ArrayList populateHand(ArrayList hand, Deck deck)
    {
        for (int j = 0; j < 5; j++)
        {
            hand.add(deck.cards.get(0));
            deck.removeCard(0);
        }

        return hand;

    }

}
