class Solution {
private:
	vector<vector<int>> grid;
	vector<vector<int>> directions = {{-1,0},{1,0},{0,-1},{0,1}};
	int row, col, answer;
	
	bool isWalked(int i, int j)
	{
		// cout << "check walk at ("<<i<<", "<<j<<")\n";
		for(auto arr : grid)
			for(int e : arr)
				if(!e) return 0;
		// cout << "successed\n";
		return 1;
	}
	
	void BFS(int i, int j)
	{
		if(i<0 || j<0 || i>=row || j>=col) return;
		if(grid[i][j] == 1) return;
		if(grid[i][j] == -1) return;
		if(grid[i][j] == 2)
			if(isWalked(i, j))
			{
				answer++;
				return;
			}
			else
				return;
// cout << i << ", " << j <<endl;
// cout << "and val is " << grid[i][j] << endl;
		// mark as walked
		grid[i][j] = 1;
		// add next step
		for(auto dir : directions)
			BFS(i+dir[0], j+dir[1]);
// cout << "=DONE=\n";
		grid[i][j] = 0;
	}
public:
	int uniquePathsIII(vector<vector<int>>& grid) {
		this->grid = grid;
		this->row = grid.size();
		this->col = grid[0].size();
		this->answer = 0;
		
		for(int i=0; i<row; i++)
			for(int j=0; j<col; j++)
				if(grid[i][j]==1)
				{
					this->grid[i][j] = 0;
					BFS(i, j);
					return answer;
				}
		return answer;
	}
};