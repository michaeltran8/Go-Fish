
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *
 * @author josh_
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int numOfPlayers = 0;
        Game game = new Game();

        Scanner sc = new Scanner(System.in);

        do
        {
            //prompts user to enter answer number
            System.out.print("How many players are there?\n"+
                    "(2,3, or 4 Any other number quits)\n");

            numOfPlayers = sc.nextInt();
        }
        while (numOfPlayers <= 2 && numOfPlayers >= 4);

        switch (numOfPlayers)
            {
                case 2:
                    game.play(numOfPlayers);
                    break;
                case 3:
                    game.play(numOfPlayers);
                    break;
                case 4:
                    game.play(numOfPlayers);
                    break;
                default:
                    break;
            }
        // tells user they are exiting program
        System.out.println("\nExiting...");
    }
    
}
