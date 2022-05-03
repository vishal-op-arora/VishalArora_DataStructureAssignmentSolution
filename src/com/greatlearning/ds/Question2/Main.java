package com.greatlearning.ds.Question2;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		// Node input value
		//int[] nodeValues = {30, 20, 10, 8, 12, 24, 22, 26, 40, 36, 34, 38, 50, 48, 60};
		int[] nodeValues = {50, 30, 60, 10, 55};
		
		// Create Binary Search Tree form the ArrayList
		Node root = BinarySearchTree.createBST(nodeValues);
		
		// Create In-order ArrayList from the Binary Search Tree
		ArrayList<Integer> inorderArrayList = BinarySearchTree.getArrayList(root);
		
		// Create Right Skewed Tree from ArrayList which has in-ordered 
		Node rightSkewedTree = SkewedTree.createRST(inorderArrayList);
		
		// Display value of Right Skewed Tree
		System.out.println("Output ");
		SkewedTree.displayRST(rightSkewedTree);

	}
}
