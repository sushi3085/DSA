#include <bits/c++std>

class Board
{
	private:
	int[][] board;
	public:
	Board(int[][] board)
	{
		this->board = board;
	}
	
	void getSurroundRegion(int[][] board)
	{
		this->board = board;
	}

	void flip(int[][] board)
	{
		int row=board.size(), col = board[0].size();
		for(int i=0; i<row; i++)
			for(int j=0; j<col; j++)
				if(board[i][j]=='Z') board[i][j] = 'O';
	}

	void BFS()
	{
		for(int[] diff : {{-1,0},{1,0},{0,-1},{0,1}})
		{
			if()
		}
	}
}

