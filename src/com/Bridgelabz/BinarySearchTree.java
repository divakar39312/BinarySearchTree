package com.Bridgelabz;

public class BinarySearchTree {
	/*
	 * Created root of type Node
	 * 
	 */
	Node root;
	boolean flag = true;
	
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
	//To Print Tree its Function
	public void printTree(Node node) {
		if(node.left != null) {
			printTree(node.left);
		}
		System.out.print(node.data+" ");
		if(node.right != null) {
			printTree(node.right);
		}
	}
	
	public class Node {
				int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data = data;
		}
		

	}
	//To Search Node Function
	public void searchNode(Node node, int value) {
		if(root == null) {
			System.out.println("Tree is Empty");	
			return;
		}
		else {
			if(node.data == value) {
				flag = true;
				return;
			}
			if(flag == false && node.left != null) {
				searchNode(node.left, value);
			}
			if(flag == false && node.right != null) {
				searchNode(node.right, value);
			}
		}
		
	}

}