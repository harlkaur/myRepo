package com.shc.tree.practise;

class BSTTraversal {

	public static void main(String[] args) {
		BSTTravel bSTTravel = new BSTTravel();
		bSTTravel.insert(100).insert(200).insert(20).insert(10).insert(45).insert(87).insert(49).insert(2);
		System.out.println("Inorder Traversal");
		bSTTravel.inOrder();
		bSTTravel.preOrder();
		bSTTravel.postOrder();
		System.out.println("Finding the maximum element");
		bSTTravel.maxElement();
		System.out.println("Finding the minimum element");
		bSTTravel.minElement();
	}

}

class BSTTravel {

	public Node14 root;

	public BSTTravel insert(int data) {
		Node14 node = new Node14<>(data);
		if (root == null) {
			root = node;
			return this;
		}
		insertRec(root, node);
		return this;
	}

	public void insertRec(Node14 latestRoot, Node14 node) {

		if (latestRoot.data > node.data) {
			if (latestRoot.left == null) {
				latestRoot.left = node;
			} else {
				insertRec(latestRoot.left, node);
			}

		} else if (latestRoot.right == null) {
			latestRoot.right = node;
		} else {
			insertRec(latestRoot.right, node);
		}
	}

	public void inOrder() {
		printInOrderRec(root);
		System.out.println("");
	}

	public void preOrder() {
		printPreOrderRec(root);
		System.out.println("");
	}

	public void postOrder() {
		printPostOrderRec(root);
		System.out.println("");
	}

	public void printInOrderRec(Node14 root) {
		if (root == null) {
			return;
		}
		printInOrderRec(root.left);
		System.out.println(root.data + ", ");
		printInOrderRec(root.right);
	}

	public void printPreOrderRec(Node14 root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data + ", ");
		printPreOrderRec(root.left);
		printPreOrderRec(root.right);
	}

	public void printPostOrderRec(Node14 root) {
		if (root == null) {
			return;
		}
		printPostOrderRec(root.left);
		printPostOrderRec(root.right);
		System.out.println(root.data + ", ");
	}

	public int maximumElement(Node14 root) {
		if (root == null) {
			return 0;
		}
		while (root.right != null) {
			root = root.right;
		}
		return root.data;
	}

	public int minimumElement(Node14 root) {
		if (root == null) {
			return 0;
		}
		while (root.left != null) {
			root = root.left;
		}
		return root.data;
	}

	public void maxElement() {
		int max = maximumElement(root);
		System.out.println(max);
	}

	public void minElement() {
		int min = minimumElement(root);
		System.out.println(min);
	}
}

class Node14<T> {

	public int data;
	public Node14 left;
	public Node14 right;

	public Node14(int data) {
		this.data = data;
	}
}
