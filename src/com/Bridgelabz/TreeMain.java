package com.Bridgelabz;

import java.util.Scanner;

public class TreeMain {
	static boolean flag = true;
	public static void main(String[] args) {
	
		welcome();
		Scanner sc = new Scanner(System.in);
		BinarySearchTree tree = new BinarySearchTree();
		while(true) {
			System.out.println("\nSelect \n1.Add Element\n2.PrintTree \n3.Search Element \n4.Exit");
			int option = sc.nextInt();
			switch(option) {
			case 1:
				System.out.println("Please Enter Element:");
				tree.addNode(sc.nextInt());
				break;
			case 2:
				
				System.out.println("After Adding Remaining Elements into Tree");
				tree.printTree(tree.root);
				break;
			case 3 :
				System.out.println("Enter Element To Search :");
				int val = sc.nextInt();
				tree.searchNode(tree.root,val);
				if(flag) {
					System.out.println(val+" Element is Avilable");
				}
				else {
					System.out.println(val+" Element Not Available");
				}
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Invalid Option");	
			}
		}
	}
	
	//Welcome Function
	static void welcome() {
		System.out.println("Welcome to Binary Search Tree Program");
		
	}

}
