package Recap;

import java.util.HashMap;
import java.util.HashSet;

public class Library {
	private HashMap<String, Book> repo;
	
	public Library(){
		this.repo = new HashMap<>();
	}
	
	public static String sanitizeString(Book book) {
		String newString = book.getName().toLowerCase();
		newString = newString.trim();
		return newString;
		
	}
	
	public void addBook(Book book) {
		String bookName = this.sanitizeString(book);
		
		if(repo.containsKey(bookName)) {
			System.out.println("Already has");
		}
		else {
		repo.put(bookName, book);
		}
}

	@Override
	public String toString() {
		return "Library [repo=" + repo + "]";
	}
	
	

}