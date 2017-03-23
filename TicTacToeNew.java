import java.util.Scanner;
import java.util.Random;

public class TicTacToeNew
{
    public static void main (String[] args)
    {
	Scanner Keyboard = new Scanner(System.in);
	char[] board = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
	int turn = 1;
	boolean win = false;

	Random myRandom = new Random ();
	TicTacToeNewBlock myBlock = new TicTacToeNewBlock ();
	TicTacToeNewCheckWin myWin = new TicTacToeNewCheckWin ();
	TicTacToeNewWinFirst myFirst = new TicTacToeNewWinFirst ();

System.out.println ("           |   |");
	System.out.println ("        _" + board [0] + "_|_" + board [1] + "_|_" + board [2] + "_");
	System.out.println ("           |   |");
	System.out.println ("        _" + board [3] + "_|_" + board [4] + "_|_" + board [5] + "_");
	System.out.println ("           |   |");
	System.out.println ("         " + board [6] + " | " + board [7] + " | " + board [8] + " ");
	System.out.println ();        do
	{
	    win = myWin.checkWinX (board);
	    win = myWin.checkWinO (board);

	    System.out.print ("Please pick a square... ");
	    int choice = Keyboard.nextInt ();

	    if (board [choice - 1] == 'x' || board [choice - 1] == 'o')
	    {
		System.out.println ("Stop cheating moff!");
	    }

	    else
	    {
		board [choice - 1] = 'x';
		turn++;

		if (myFirst.checkWinFirst (board))
		{
		    board [myFirst.winFirst (board)] = 'o';
		    win = myWin.checkWinO (board);
		}

		else if (myBlock.checkBlock (board))
		    board [myBlock.block (board)] = 'o';

		else if (choice == 1 || choice == 3 || choice == 7 || choice == 9)
		{
		    if (turn == 2)
			board [4] = 'o';
		    else
			for (int q = 0 ; q < 100000 ; q++)
			{
			    int cpuchoice = myRandom.nextInt (9);
			    if ((cpuchoice == 2 || cpuchoice == 4 || cpuchoice == 6 || cpuchoice == 8) && board [cpuchoice - 1] != (int) 'x' && board [cpuchoice - 1] != (int) 'o')
			    {
				board [cpuchoice - 1] = 'o';
				q = 100000;
			    }
			    else if (q >= 100 && board [cpuchoice] != 'x' && board [cpuchoice] != 'o')
			    {
				board [cpuchoice - 1] = 'o';
				q = 100000;
			    }
			}
		}

		else if (choice == 2 || choice == 4 || choice == 6 || choice == 8)
		{
		    for (int q = 0 ; q < 100000 ; q++)
		    {
			int cpuchoice = myRandom.nextInt (9);
			if ((cpuchoice == 1 || cpuchoice == 3 || cpuchoice == 7 || cpuchoice == 9) && board [cpuchoice - 1] != (int) 'x' && board [cpuchoice - 1] != (int) 'o')
			{
			    board [cpuchoice - 1] = 'o';
			    q = 100000;
			}
			else if (q >= 100 && board [cpuchoice] != 'x' && board [cpuchoice] != 'o')
			{
			    board [cpuchoice - 1] = 'o';
			    q = 100000;
			}
		    }
		}

		else if (choice == 5)
		{
		    for (int q = 0 ; q < 100000 ; q++)
		    {
			int cpuchoice = myRandom.nextInt (8) + 1;
			if (board [cpuchoice - 1] != 'x' && board [cpuchoice] != 'o' && (cpuchoice == 1 || cpuchoice == 3 || cpuchoice == 7 || cpuchoice == 9))
			{
			    board [cpuchoice - 1] = 'o';
			    q = 100000;
			}
			else if (q >= 100 && board [cpuchoice] != 'x' && board [cpuchoice] != 'o')
			{
			    board [cpuchoice - 1] = 'o';
			    q = 100000;
			}
		    }
		}
		turn++;
System.out.println ("           |   |");
	System.out.println ("        _" + board [0] + "_|_" + board [1] + "_|_" + board [2] + "_");
	System.out.println ("           |   |");
	System.out.println ("        _" + board [3] + "_|_" + board [4] + "_|_" + board [5] + "_");
	System.out.println ("           |   |");
	System.out.println ("         " + board [6] + " | " + board [7] + " | " + board [8] + " ");
	System.out.println ();            }
	}
	while (turn <= 9 && win == false);

	if (myWin.checkWinX (board))
	    System.out.println ("You won! Probably by cheating somehow...");
	else if (myWin.checkWinO (board))
	    System.out.println ("Ouch! You just lost.");
	else
	    System.out.println ("Cat's game!");
    }
}
