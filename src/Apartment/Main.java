package Apartment;
import java.util.ArrayList;
public class Main {
	
	public static void main(String[] args) {
		
		Apartment dallas = new Apartment(4, 26, 2500);
		Apartment vermont = new Apartment(2, 18, 2400);
		Apartment newYork = new Apartment (3, 40, 5000);
		
		SongEquals song1 = new SongEquals("Mastered EQ");
		SongEquals song2 = new SongEquals("Mastered EQ");
		 
		Book book1 = new Book("Hours Later", 1990);
		Book book2 = new Book("Hours Later", 1990);
		Book book3 = new Book("Manadas", 1997);
		ArrayList<Book> books = new ArrayList<>();
		 
		books = Main.addToList(book2, books);
		books = Main.addToList(book1, books);

		books = Main.addToList(book3, books);
		
		System.out.println(books.toString());
	}
	
	
	


	public static ArrayList<Book> addToList(Book a, ArrayList<Book> b){
		boolean isHere = false;
		ArrayList<Book> newList = b;
		for(int i=0; i<newList.size(); i++) {
			if(a.equals(newList.get(i))){
				isHere=true;
			}
				
			
			
			}
		if(!isHere) {
			newList.add(a);
		}
		return newList;

	
	}
}
	
	
 