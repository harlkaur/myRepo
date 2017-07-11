package com.shc.tree;

public class PostOrder {

	public Node root;
	public void printPostorder() {
		  printPostOrderRec(root);
		  System.out.println("");
		}

		/**
		 * Helper method to recursively print the contents in a Postorder way
		 */
		private void printPostOrderRec(Node currRoot) {
		  if (currRoot == null) {
		    return;
		  }
		  printPostOrderRec(currRoot.left);
		  printPostOrderRec(currRoot.right);
		  System.out.print(currRoot.value + ", ");
		}
}
