public class TicTacToeNewWinFirst
{
    public boolean checkWinFirst (char[] board)
    {
	if (board [0] != 'o' && board [0] != 'x' && ((board [1] == 'o' && board [2] == 'o') || (board [3] == 'o' && board [6] == 'o') || (board [4] == 'o' && board [8] == 'o')))
	    return true;
	else if (board [1] != 'o' && board [1] != 'x' && ((board [4] == 'o' && board [7] == 'o') || (board [0] == 'o' && board [2] == 'o')))
	    return true;
	else if (board [2] != 'o' && board [2] != 'x' && ((board [0] == 'o' && board [1] == 'o') || (board [2] == 'o' && board [5] == 'o') || (board [4] == 'o' && board [6] == 'o')))
	    return true;
	else if (board [3] != 'o' && board [3] != 'x' && ((board [4] == 'o' && board [5] == 'o') || (board [0] == 'o' && board [6] == 'o')))
	    return true;
	else if (board [4] != 'o' && board [4] != 'x' && ((board [1] == 'o' && board [7] == 'o') || (board [3] == 'o' && board [5] == 'o') || (board [0] == 'o' && board [8] == 'o') || (board [2] == 'o' && board [6] == 'o')))
	    return true;
	else if (board [5] != 'o' && board [5] != 'x' && ((board [3] == 'o' && board [4] == 'o') || (board [2] == 'o' && board [8] == 'o')))
	    return true;
	else if (board [6] != 'o' && board [6] != 'x' && ((board [0] == 'o' && board [3] == 'o') || (board [7] == 'o' && board [8] == 'o') || (board [2] == 'o' && board [4] == 'o')))
	    return true;
	else if (board [7] != 'o' && board [7] != 'x' && ((board [6] == 'o' && board [8] == 'o') || (board [1] == 'o' && board [4] == 'o')))
	    return true;
	else if (board [8] != 'o' && board [8] != 'x' && ((board [2] == 'o' && board [5] == 'o') || (board [6] == 'o' && board [7] == 'o') || (board [0] == 'o' && board [4] == 'o')))
	    return true;
	else
	    return false;
    }


    public int winFirst (char[] board)
    {
	if (board [0] != 'o' && board [0] != 'x' && ((board [1] == 'o' && board [2] == 'o') || (board [3] == 'o' && board [6] == 'o') || (board [4] == 'o' && board [8] == 'o')))
	    return 0;
	else if (board [1] != 'o' && board [1] != 'x' && ((board [4] == 'o' && board [7] == 'o') || (board [0] == 'o' && board [2] == 'o')))
	    return 1;
	else if (board [2] != 'o' && board [2] != 'x' && ((board [0] == 'o' && board [1] == 'o') || (board [2] == 'o' && board [5] == 'o') || (board [4] == 'o' && board [6] == 'o')))
	    return 2;
	else if (board [3] != 'o' && board [3] != 'x' && ((board [4] == 'o' && board [5] == 'o') || (board [0] == 'o' && board [6] == 'o')))
	    return 3;
	else if (board [4] != 'o' && board [4] != 'x' && ((board [1] == 'o' && board [7] == 'o') || (board [3] == 'o' && board [5] == 'o') || (board [0] == 'o' && board [8] == 'o') || (board [2] == 'o' && board [6] == 'o')))
	    return 4;
	else if (board [5] != 'o' && board [5] != 'x' && ((board [3] == 'o' && board [4] == 'o') || (board [2] == 'o' && board [8] == 'o')))
	    return 5;
	else if (board [6] != 'o' && board [6] != 'x' && ((board [0] == 'o' && board [3] == 'o') || (board [7] == 'o' && board [8] == 'o') || (board [2] == 'o' && board [4] == 'o')))
	    return 6;
	else if (board [7] != 'o' && board [7] != 'x' && ((board [6] == 'o' && board [8] == 'o') || (board [1] == 'o' && board [4] == 'o')))
	    return 7;
	else if (board [8] != 'o' && board [8] != 'x' && ((board [2] == 'o' && board [5] == 'o') || (board [6] == 'o' && board [7] == 'o') || (board [0] == 'o' && board [4] == 'o')))
	    return 8;
	else
	    return 0;
    }
}
