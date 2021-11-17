public class Solver{
	public static void main(String[] args){
		solve();
	}
	public static int solve(int[][] obs){
		int row = obs.length;
		int col = obs[0].length;
		
		for(int i=0; i<row; i++)
			for(int j=0; j<col; j++)
				if(obs[i][j]==1) obs[i][j] = -1;
		
		for(int i=0; i<row; i++)
			if(obs[i][0]==0) obs[i][0] = 1;
			else break;
		for(int j=1; j<col; j++)
			if(obs[0][j]==1) obs[0][j] = 1;
			else break;
		
		for(int i=1; i<row; i++)
			for(int j=1; j<col; j++){
				if(obs[i][j]==-1) continue;
				obs[i][j] += Math.max(obs[i-1][j], 0) + Math.max(obs[i][j-1], 0);
			}
		return obs[row-1][col-1];
	}
}