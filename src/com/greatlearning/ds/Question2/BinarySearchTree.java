package com.greatlearning.ds.Question2;

import java.util.ArrayList;

public class BinarySearchTree {
	
	static ArrayList<Integer> arrayList = new ArrayList<Integer>();
	/**
	 * if root node is null, set its value 
	 * if value is less than to the root node value than set value to the left node otherwise to the right node.
	 * @param root current root node
	 * @param value Node value
	 * @return Node
	 */
	public static Node insert(Node root, int value) {
		if(root == null) {
			root = new Node(value);
		}
		else if (value < root.value) {
			root.left = insert(root.left, value); 
		}
		else if (value > root.value) {
			root.right = insert(root.right, value);
		}
		return root;
	}
	
	/**
	 * Create Binary Search Tree  where node values is array of interger type
	 * @param nodeValues int Array
	 * @return Binary Search Tree
	 */
	public static Node createBST(int[] nodeValues){
		
		Node tree = null;
		
		for(int nodeValue : nodeValues) {
			if(tree == null) {
				tree = insert(tree, nodeValue);
			}
			else {
				insert(tree, nodeValue);
			}
		}
		return tree;
	}
	
	
	/**
	 * Add elements to Array List in ascending order
	 * @param root
	 */
	static void inorder(Node root) {
		if(root == null) {
			return;
		}
		else {
			inorder(root.left);
			arrayList.add(root.value);
			inorder(root.right);
		}
	}
	
	
	/**
	 * Return ArrayList which contains Binary Search Tree elements in ascending order
	 * @param root
	 * @return return ArrayList
	 */
	static ArrayList<Integer> getArrayList(Node root){

		inorder(root);
		
		return arrayList;
	}
}
