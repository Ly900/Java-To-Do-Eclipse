package com.lyn.todo;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
	public List<String> toDoList;

	public ToDoList() {
		toDoList = new ArrayList<String>(); 
	}
	
	public void addToDo(String input) {
		this.toDoList.add(input);
		System.out.println(input + " added.\n"); 
	}
	
	public void getList() {
		System.out.println("\nYour To Do List: \n");
		System.out.println("----------\n");
		if (this.toDoList.size() == 0) {
			System.out.println("Your to do list is empty.");
		}
		for (int i = 0; i < this.toDoList.size(); i++) {
			System.out.println((i + 1)  + ". " + toDoList.get(i));
		}
		System.out.println("\n----------\n");
	}

	public void remove(int removeInt) {
		this.toDoList.remove(removeInt - 1);
		
	}

}
