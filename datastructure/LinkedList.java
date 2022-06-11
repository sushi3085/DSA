package datastructure;

public class LinkedList {
	private Node head;
	private int length;
	
	class Node {
		int val;
		Node next;
		
		Node(int val) {
			this.val = val; this.next = null;
		}
		Node(int val, Node next) {
			this.val = val; this.next = next;
		}
	}

	public LinkedList(int[] datas) {
		if(datas.length==0) return;
		this.length = 0;
		this.head = new Node(datas[0]);
		Node tem = head;
		for(int i=1; i<datas.length; i++, this.length++) {
			tem.next = new Node(datas[i]);
			tem = tem.next;
		}
	}
}