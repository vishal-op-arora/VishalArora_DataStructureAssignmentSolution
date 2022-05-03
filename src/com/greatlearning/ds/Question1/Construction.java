package com.greatlearning.ds.Question1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Construction {

	private static int noOfFloors = 0;
	private static ArrayList<Integer> constructedFloorPlan = null;
	private static Stack<Integer> constructedFloors = new Stack<Integer>();
	private static HashMap<Integer, LinkedList<Integer>> assemblePlan = null;
	
	/**
	 * Take user input for the floor to be constructed
	 */
	public static void floorConstructionInput() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the total no of floors in the building");
		noOfFloors = scan.nextInt();
		
		constructedFloorPlan = new ArrayList<Integer>();
		
		for(int day=1; day <= noOfFloors; day++ ){
			System.out.println("enter the floor size given on day " + day);
			constructedFloorPlan.add(scan.nextInt());
		}
		
		scan.close();
	}
	
	
	/**
	 * Generate per day assemble plan
	 */
	private static void generateAssemblePlan() {
		
		constructedFloors = new Stack<Integer>();
		assemblePlan = new HashMap<Integer, LinkedList<Integer>>();
		int topFloor = noOfFloors;
		int day = 1;
		
		for(int floor : constructedFloorPlan) {

			constructedFloors.add(floor);
			LinkedList<Integer> list = null;
			
			while(!constructedFloors.isEmpty() && topFloor == constructedFloors.peek()) {
				if(list ==  null) {
					list = new LinkedList<Integer>();
				}
				list.add(constructedFloors.pop());
				topFloor--;	
			}
			
			if(list != null) {
				assemblePlan.put(day, list);
			}
			
			day++;
		}
	}
	
	/**
	 * Display the per day assemble plan
	 */
	public static void dispalyAssemblePlan() {
		
		generateAssemblePlan();
		
		System.out.println("\nThe order of construction is as follows\n");
		
		for(int day = 1; day <= noOfFloors; day++) {
			System.out.println("Day: " + day);
			if(assemblePlan.containsKey(day)) {
				LinkedList<Integer> list = assemblePlan.get(day);
				
				while(!list.isEmpty()) {
					System.out.print(list.pollFirst() + " ");
				}
			}
			System.out.println();
		}	
	}
}
