package Apartment;

import java.util.ArrayList;

public class Book {
	private String name;
	private int pubYear;
	
	public Book(String name, int pubYear) {
		this.name=name;
		this.pubYear=pubYear;
	}
	
	@Override
	public boolean equals(Object b) {
		if(b == this)
			return true;
		if(!(b instanceof Book)) {
			return false;
		}
		Book c = (Book) b;
		if(this.name.equals(c.name) && this.pubYear == c.pubYear) {
			return true;
		}
		
		return false;
		
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", pubYear=" + pubYear + "]";
	}
	
	
}
