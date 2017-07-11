package com.shc.tree;

public class PreOrder {

	public Node root;
	public void printPreorder() {
		  printPreOrderRec(root);
		  System.out.println("");
		}

		/**
		 * Helper method to recursively print the contents in a Preorder way
		 */
		private void printPreOrderRec(Node currRoot) {
		  if (currRoot == null) {
		    return;
		  }
		  System.out.print(currRoot.value + ", ");
		  printPreOrderRec(currRoot.left);
		  printPreOrderRec(currRoot.right);
		}
}
