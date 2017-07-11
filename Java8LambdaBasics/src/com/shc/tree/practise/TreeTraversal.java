package com.shc.tree.practise;

class Node1<T> {

	public int data;
	public Node1 left;
	public Node1 right;

	public Node1(int data) {
		this.data = data;
	}

}

public class TreeTraversal {
	public Node1 root;

	public void insert(int value) {
		Node1 node = new Node1<>(value);

		if (root == null) {
			root = node;
			return;
		}
		insertRecord(root, node);
	}

	private static void insertRecord(Node1 latestRoot, Node1 node) {
		if (latestRoot.data > node.data) {
			if (latestRoot.left == null) {
				latestRoot.left = node;
				return;
			}
		}
	}
}