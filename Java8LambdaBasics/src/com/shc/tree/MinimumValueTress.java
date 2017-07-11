package com.shc.tree;

public class MinimumValueTress {

	public Node root;
	public int findMinimum(){
		  if ( root == null ){
		    return 0;
		  }
		  Node currNode = root;
		  while(currNode.left != null){
		    currNode = currNode.left;
		  }
		  return currNode.value;
		}
	
	public int findMaximum(){
		  if ( root == null){
		    return 0;
		  }

		  Node currNode = root;
		  while(currNode.right != null){
		    currNode = currNode.right;
		  }
		  return currNode.value;
		}
}
