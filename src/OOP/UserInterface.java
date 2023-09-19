package OOP;

import java.util.Scanner;

public class UserInterface {
	TodoList list;
	Scanner scanner;
	
		public UserInterface(TodoList list, Scanner scanner) {
			this.list=list;
			this.scanner=scanner;
		}
		
		public void start() {
		String input;
			while(true) {
				System.out.println("Commands available: \n ADD\n REMOVE\n LIST\n STOP");
				System.out.println("Insert command: ");
				input = scanner.nextLine();
				
				if(input.equalsIgnoreCase("stop"))
					break;
				
				else if(input.equalsIgnoreCase("add")) {
					System.out.println("What task you want to add?");
					input = scanner.nextLine();
					list.add(input);
				}
				
				else if(input.equalsIgnoreCase("list")) {
					list.print();
					}
				else if(input.equalsIgnoreCase("remove")) {
					System.out.println("Remove which number?");
					list.print();
					int listIndex = Integer.valueOf(scanner.nextLine());
					list.remove(listIndex);
				}
				
				else
					System.out.println("no such command");
				
				
				
				
				
			}
		}
}
