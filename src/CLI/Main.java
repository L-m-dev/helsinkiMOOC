package CLI;
import java.util.Scanner;

import OOP.TodoList;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		TodoList list = new TodoList();
		list.add("Oieeee");
		list.add("Good morning");
		
		list.print();
		
	}
}
