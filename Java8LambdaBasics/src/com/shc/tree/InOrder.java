package com.shc.tree;

public class InOrder {

	public Node root;
	/**
	 * Printing the contents of the tree in an inorder way.
	 */
	public void printInorder(){
	  printInOrderRec(root);
	  System.out.println("");
	}

	/**
	 * Helper method to recursively print the contents in an inorder way
	 */
	private void printInOrderRec(Node currRoot){
	  if ( currRoot == null ){
	    return;
	  }
	  printInOrderRec(currRoot.left);
	  System.out.print(currRoot.value+", ");
	  printInOrderRec(currRoot.right);
	}
}
