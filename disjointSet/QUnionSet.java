public class QUnionSet{
	public QUnionSet(int size){
		this.datas = new int[size];
		for(int i=0; i<size; i++)
			this.datas[i] = i;
	}

	public int find(int node){
		while(node != datas[node])
			node = datas[node]
		return node
	}

	public void connect(int a, int b){
		int rootX = find(a);
		int rootY = find(b);
		if(rootX != rootY){
			datas[rootY] = rootX;
		}
	}
	private int[] datas;
}