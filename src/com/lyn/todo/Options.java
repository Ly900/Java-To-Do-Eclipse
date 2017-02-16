package com.lyn.todo;

import java.util.Scanner;

public class Options {

	public static void giveChoices(ToDoList list) {
		Scanner userInput = new Scanner(System.in);
		int input = userInput.nextInt();

		// Check user's choice for viewing or adding to list.
		switch (input) {
		// View list.
		case 1:
			list.getList();
			break;
		// Add to do.
		case 2:
			System.out.println("You entered 2.\n");
			System.out.print("What would you like to add to your list? ");
			Scanner sc = new Scanner(System.in);
			String toDoItem = sc.nextLine();
			list.addToDo(toDoItem);
			break;
		// Remove to do.
		case 3:
			System.out.println("Which \"to do\" would you like to remove?");
			Scanner remove = new Scanner(System.in);
			int removeInt = remove.nextInt();
			list.remove(removeInt);
			break;
		// Quit.
		case 4:
			System.out.println("Good-bye!");
			ToDo.progIsRunning(false); 
			break;
		default:
			System.out.println("I don't understand what you entered.");
			break;
		}
	}
}