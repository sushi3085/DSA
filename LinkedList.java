import System;

public class LinkedList {
	class Node {
		int val;
		Node next;
		
		Node(int val) {
			this.val = val; this.next = null;
		}
		Node(int val, Node next) {
			this.val = val; this.next = Node;
		}
	}
	
	private Node head;
	public LinkedList(int[] datas) {
		if(datas.length==0) return;
		this.head = new Node(datas[0]);
		Node tem = head;
		for(int i=1; i<datas.length; i++) {
			tem.next = new Node(datas[i]);
			tem = tem.next;
		}
	}
}