package com.Bridgelabz;

public class BinarySearchTree {
	/*
	 * Created root of type Node
	 * Created Functions AddNode and PrintNode
	 * 
	 */
	Node root;
	
	public void addNode(int data) {
				Node node = new Node(data);
		node.data = data;
		node.left = null;
		node.right = null;
		
		if(root == null) {
			root = node;
			return;
		}
		else {
			Node parent = root;
			Node current = root;
			while(current != null) {
				parent = current;
				if(node.data > current.data) {
					current = current.right;
				}
				else {
					current = current.left;
				}
			}
			if(node.data > parent.data) {
				parent.right = node;
			}
			else {
				parent.left = node;
			}
		}
	}
	
	public class Node {
		/*
		 * With 3 variable data,left and right.
		 * left and right are of Node type variables.
		 * Created a Constructor passing integer data. 
		 */
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data = data;
		}
		

	}
	//To Print Tree its Function
	public void printTree(Node node) {
		if(node.left != null) {
			printTree(node.left);
		}
		System.out.println(node.data+" ");
		if(node.right != null) {
			printTree(node.right);
		}
	}

}