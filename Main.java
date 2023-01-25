package com.service;
import java.util.*;

public class Construction {
	private int totalFloor;
	List<Integer> floors = new ArrayList<>();
	Set<Integer> constructed = new HashSet<>();
	Queue<Integer>  maxHeap = new PriorityQueue<>(Collections.reverseOrder());
	Scanner sc = new Scanner(System.in);
	
	public void getData() {
		System.out.println("Enter the total number of floors in the building");
		totalFloor = sc.nextInt();
		for(int i = 0; i < totalFloor; i ++) {
			System.out.println("Enter the floor size given on day : " + (i + 1));
			floors.add(sc.nextInt());
		}
		for(int i = 0; i < totalFloor; i ++)
			maxHeap.add(floors.get(i));
	}
	
	public void assembledFloor() {
		System.out.println("The order of construction is as follows");
		for(int i = 0; i < totalFloor; i ++) {
			constructed.add(floors.get(i));
			System.out.printf("Day: %d\n", ( i + 1));
			while(constructed.contains(maxHeap.peek())) {
				System.out.printf("%d ",maxHeap.remove());
			}
			System.out.println();
		}
	}
}
