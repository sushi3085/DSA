public class ArrayQueue {
	private int[] datas;
	private int len;
	
	private int front, end;
	
	public ArrayQueue(int power) {
		this.datas = new int[1<<power];// size of datas can be changed
		this.len = datas.length;
		this.front = 0;
		this.end = 1;
	}
	
	public int peek() {
		return datas[(front+1)&len-1];
	}
	
	public void enque(int value) {
		if((front&len-1) == (end&len-1)) return;
		datas[end&len-1] = value;
		end++;
	}
	public Integer deque() {
		front++;
		if((front&len-1) == (end&len-1)) {
			front--;
			return null;
		}
		return new Integer(datas[front&7]);
	}
	
	public static void main(String[] args) {
		ArrayQueue q = new ArrayQueue(3);
		for(int i=0; i<10; i++) {
			q.enque(i);
		}
		for(int i=0; i<10; i++) {
			System.out.println(q.deque());
		}
	}
}