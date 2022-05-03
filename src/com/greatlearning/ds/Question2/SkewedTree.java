package com.greatlearning.ds.Question2;

import java.util.ArrayList;


public class SkewedTree {
	
	/**
	 * Insert Value to Right Skewed Tree
	 * @param root
	 * @param value
	 * @return Node
	 */
	static Node insertRST(Node root, int value) {	
		
		if(root == null) {
			root = new Node(value);
		}
		else {
			root.right = insertRST(root.right, value);
		}
		return root;
	}
	
	/**
	 * Create Right Skewed Tree from ArrayList of Integer type
	 * @param inorderBST ArrayLisyt of Integer type
	 * @return Node
	 */
	static Node createRST(ArrayList<Integer> inorderBST) {
		
		Node root = null;
		
		for(int value : inorderBST) {
			if(root == null) {
				root = insertRST(root, value);
			}
			else {
				insertRST(root, value);
			}
		}
		return root;
	}
	
	/**
	 * Display Right Skewed Tree Elements
	 * @param root
	 */
	static void displayRST(Node root) {
		
		if(root == null) {
			return;
		}
		else {
			System.out.print(root.value + " ");
			displayRST(root.right);
		}
	}
	
	/**
	 * Insert Value to Left Skewed Tree
	 * @param root
	 * @param value
	 * @return Node
	 */
	static Node insertLST(Node root, int value) {	
		if(root == null) {
			root = new Node(value);
		}
		else {
			root.left = insertLST(root.left, value);
		}
		return root;
	}
	
	/**
	 * Create Left Skewed Tree from ArrayList of Integer type
	 * @param inorderBST ArrayLisyt of Integer type
	 * @return Node
	 */
	static Node createLST(ArrayList<Integer> inorderBST) {
		
		Node root = null;
		
		for(int value : inorderBST) {
			if(root == null) {
				root = insertLST(root, value);
			}
			else {
				insertLST(root, value);
			}
		}
		return root;
	}
	
	/**
	 * Display Left Skewed Tree Elements
	 * @param root Node
	 */
	static void displayLST(Node root) {
		
		if(root == null) {
			return;
		}
		else {
			System.out.print(root.value + " ");
			displayRST(root.left);
		}
	}
	
}
