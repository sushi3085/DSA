public class DisJointSet{
	public DisJointSet(int size){
		this.datas = new int[size];
		this.rank = new int[size];
		for(int i=0; i<size; i++)
			datas[i] = rank[i] = i;
	}

	public int find(int node){
		while(node!=datas[node])
			node = datas[node]
		return node
		/*
		* optimized version:
		if(node == datas[node]) return node;
		return datas[node] = find(datas[node])
		*/
	}

	public void connect(int a, int b){
		int rootX = find(a);
		int rootY = find(b);
		if(rootX != rootY){
			if(rank[rootX] > rank[rootY]){
				datas[rootY] = rootX;
			}
			else if(rank[rootX] < rank[rootY]){
				datas[rootX] = rootY;
			}
			else{
				rank[rootX]++;
				datas[rootY] = rootX;
			}
		}
	}

	private int[] datas;
	private int[] rank;
}