package datastructure;

import java.util.List;

public class Graph{
	public static void main(String[] args){
		Node[] nodes = new Node[5];
		for(int i=0; i<nodes.length; i++){
			nodes[i] = new Node(i*2);
		}
		
	}
}

class Node{// this is a weighted node
	int val;
	List<int[]> neightbors;

	public Node(int x){
		this.val = x;
	}
	public Node(int x, List<int[]> nodes){
		this.neightbors = nodes;
	}
}