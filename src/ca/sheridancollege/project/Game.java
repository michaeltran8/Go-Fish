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

        ArrayList<ArrayList<String>> playerHands = new ArrayList<>(numOfPlayers);

        int[] playerPoints = new int[4];

        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        ArrayList<String> p4 = new ArrayList<>();

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

        turn(playerHands, sc, playerPoints);
        

    }

    private void turn(ArrayList<ArrayList<String>> playerHands, Scanner sc, int[] playerPoints)
    {
        for (int i = 0; i < numOfPlayers; i++)
        {
            int asking;
            int card;
            
            System.out.println("Player " + (i + 1) + "'s Turn");
            System.out.println(playerHands.get(i).toString());
            
            System.out.println("Which player do you want to ask");
            asking = sc.nextInt();
            
            System.out.println("Which card do you want to for");
            card = sc.nextInt();

            String cardHave = String.format("%c%c", 
                    playerHands.get(i).get(card - 1).charAt(0), 
                    playerHands.get(i).get(card - 1).charAt(1));

            for (String str : playerHands.get(asking - 1))
            {
                String cardAsking = String.format("%c%c", str.charAt(0), str.charAt(1));
            }
            
            switch (asking)
            {
                case 1:
                    for (String str : playerHands.get(0))
                    {
                        String cardask = String.format("%c%c", str.charAt(0), str.charAt(1));
                        if (cardHave.equals(cardask))
                        {
                            playerPoints[i] += 1;
                        }
                    }
                    break;
                    
                case 2:
                    for (String str : playerHands.get(1))
                    {
                        String cardask = String.format("%c%c", str.charAt(0), str.charAt(1));
                        if (cardHave.equals(cardask))
                        {
                            playerPoints[i] += 1;
                        }
                    }

                    break;
                    
                case 3:
                    for (String str : playerHands.get(2))
                    {
                        String cardask = String.format("%c%c", str.charAt(0), str.charAt(1));
                        if (cardHave.equals(cardask))
                        {
                            playerPoints[i] += 1;
                        }
                    }
                    break;
                    
                case 4:
                    for (String str : playerHands.get(3))
                    {
                        String cardask = String.format("%c%c", str.charAt(0), str.charAt(1));
                        if (cardHave.equals(cardask))
                        {
                            playerPoints[i] += 1;
                        }
                    }
                    break;
            }

        }
    }

    public ArrayList populateHand(ArrayList hand, Deck deck)
    {
        for (int j = 0; j < 5; j++)
        {
            hand.add(deck.cards.get(0).toString());
            deck.removeCard(0);
        }

        return hand;

    }

}
