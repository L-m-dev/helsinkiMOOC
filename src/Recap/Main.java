package Recap;
import java.util.HashMap;
public class Main {
		
	public static void main(String[] args) {
		Library repo = new Library();
 		Book book = new Book("Pride and Prejudice", "it started this way...", 1990);
 		Book book2 = new Book("Kooon", "It went like this", 1948);
 		Book book3 = new Book("Kooon", "lol", 1550);
		repo.addBook(book);
		repo.addBook(book2);
		repo.addBook(book3);
		System.out.println(repo.toString());
	}
	
}
