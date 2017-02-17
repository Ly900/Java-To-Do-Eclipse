package com.lyn.todo;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
	public List<String> toDoList;

	public ToDoList() {
		toDoList = new ArrayList<String>(); 
	}
	
	// Add to do's to the list.
	public void addToDo(String input) {
		this.toDoList.add(input);
		System.out.println(input + " added.\n"); 
	}
	
	// Prints out entire list.
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

	// Removes a to do from the list.
	public void remove(int removeInt) {
		this.toDoList.remove(removeInt - 1);
		
	}
	
	// Changes a to do to something else.
	public void editToDo(int index, String revisedToDo) {
		this.toDoList.set(index, revisedToDo);
	}

}
