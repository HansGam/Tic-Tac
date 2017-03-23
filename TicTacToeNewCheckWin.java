public class TicTacToeNewCheckWin
{
    public boolean checkWinX (char[] board)
    {
	if ((board [0] == 'x' && board [1] == 'x' && board [2] == 'x') || (board [3] == 'x' && board [4] == 'x' && board [5] == 'x') || (board [6] == 'x' && board [7] == 'x' && board [8] == 'x'))
	    return true;
	else if ((board [0] == 'x' && board [3] == 'x' && board [6] == 'x') || (board [1] == 'x' && board [4] == 'x' && board [7] == 'x') || (board [2] == 'x' && board [5] == 'x' && board [8] == 'x'))
	    return true;
	else if ((board [0] == 'x' && board [4] == 'x' && board [8] == 'x') || (board [2] == 'x' && board [4] == 'x' && board [6] == 'x'))
	    return true;
	else
	    return false;
    }


    public boolean checkWinO (char[] board)
    {
	if ((board [0] == 'o' && board [1] == 'o' && board [2] == 'o') || (board [3] == 'o' && board [4] == 'o' && board [5] == 'o') || (board [6] == 'o' && board [7] == 'o' && board [8] == 'o'))
	    return true;
	else if ((board [0] == 'o' && board [3] == 'o' && board [6] == 'o') || (board [1] == 'o' && board [4] == 'o' && board [7] == 'o') || (board [2] == 'o' && board [5] == 'o' && board [8] == 'o'))
	    return true;
	else if ((board [0] == 'o' && board [4] == 'o' && board [8] == 'o') || (board [2] == 'o' && board [4] == 'o' && board [6] == 'o'))
	    return true;
	else
	    return false;
    }
}
