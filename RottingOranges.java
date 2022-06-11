// // BUG ある
// public class RottingOranges{
// 	int rowL, colL;
// 	int[][] datas;

// 	public void solve(int[][] grid) {
// 		this.datas = grid;
// 		rowL = grid.length;
// 		colL = grid[0].length;
		
// 		int answer = 0;
//         for(int i=0; i<grid.length; i++)
//             for(int j=0; j<grid[i].length; j++)
//                 if(datas[i][j]==2) {
//                     datas[i][j] = 1;
//                     answer = rotting(i, j);
//                 }
//         for(int[] arr : datas)
//             for(int e : arr)
//                 if(e==1) return -1;
//         return answer-1;
// 	}

// 	private int BFS(int i, int j) {
// 		if(i<0 || j<0 || i>=rolL || j>=colL) return 0;
// 		if(datas[i][j] == 0) return 0;
// 		datas[i][j] = 0;

// 		return Math.max(
// 			Math.max(BFS(i-1, j), BFS(i+1, j)),
// 			Math.max(BFS(i, j-1), BFS(i, j+1))
// 		);
// 	}
// }