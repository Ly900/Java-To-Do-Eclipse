package com.lyn.todo;

public class Prompter {
	public static void ask() {
		System.out.println("What would you like to do?\n");
		System.out.println("1. View To Do list.\n" + 
							"2. Add to To Do list.\n" + 
							"3. Remove a to do.\n" +
							"4. Quit.\n");
		System.out.print("Your choice: ");
	}
}
