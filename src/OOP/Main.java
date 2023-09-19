package OOP;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		TodoList list = new TodoList();
		Scanner sc = new Scanner(System.in);
		UserInterface ui = new UserInterface(list, sc);
		 
		JokeManager jm = new JokeManager();
		
		jm.addJoke("Jonny is good");
		jm.addJoke("David is sad");
		jm.addJoke("Marcus is not");
		
		System.out.println(jm.drawJoke());
		System.out.println(jm.drawJoke());

		jm.printJokes();
		
	}
}
