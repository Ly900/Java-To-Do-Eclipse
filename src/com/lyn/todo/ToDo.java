package com.lyn.todo;

// This class starts the program.
public class ToDo {
	private static boolean appStarted = true;
	
	public static void main(String[] args) {

		System.out.println("Hello and welcome to your To Do App.");
		
		ToDoList list1 = new ToDoList();
		
		while (appStarted) {
			Prompter.ask();
			Options.giveChoices(list1);
		}
			
	}
	
	public static void progIsRunning(boolean state) {
		appStarted = state;
	}
	
}
