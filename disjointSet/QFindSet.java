public class QFindSet{
	public QFindSet(int size){
		this.datas = new int[size];
		for(int i=0; i<size; i++)
			datas[i] = i;
	}

	public int find(int node){
		return datas[node];
	}

	public void connect(int a, int b){
		int rootX = find(a);
		int rootY = find(b);
		if(rootX!=rootY){
			for(int i=0; i<datas.length; i++)
				if(datas[i]==rootY) datas[i] = rootX;
		}
	}
	
	private int[] datas;
}