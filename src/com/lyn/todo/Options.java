package com.lyn.todo;

import java.util.Scanner;

// The Options class executes the logic depending on the user's choice, with choices given by the Prompter class.
public class Options {

	public static void giveChoices(ToDoList list) {
		Scanner userInput = new Scanner(System.in);
		int input = userInput.nextInt();

		// Check user's choice for viewing or adding to list.
		switch (input) {
		// View list.
		case 1:
			System.out.println("hi");
			list.getList();
			break;
		// Add to do.
		case 2:
			System.out.print("What would you like to add to your list? ");
			String toDoItem = userInput.next();
			list.addToDo(toDoItem);
			break;
		// Edit to do.
		case 3:
			list.getList();
			System.out.println("Which to do would you like to edit? ");
			int intOfToDo = userInput.nextInt();
			System.out.print("What would you like ");
			list.getItem(intOfToDo - 1);
			System.out.print(" changed to? ");
//			System.out.println("What would you like ");
			
			String editedToDo = userInput.next();
//			list.editToDo(Integer.parseInt(intOfToDo) - 1, editedToDo);
			list.editToDo(intOfToDo - 1, editedToDo);
			break;
		// Remove to do.
		case 4:
			list.getList();
			System.out.println("Which \"to do\" would you like to remove?");
			String removeInt = userInput.next();
			list.remove(removeInt);
			break;
		// Quit.
		case 5:
			System.out.println("Good-bye!");
			ToDo.progIsRunning(false); 
			userInput.close();
			break;
		default:
			System.out.println("I don't understand what you entered.");
			break;
		}
	}
}
