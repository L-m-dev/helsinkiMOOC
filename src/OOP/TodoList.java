package OOP;

import java.util.ArrayList;

public class TodoList {
	ArrayList<String> list;
	
	public TodoList() {
		this.list = new ArrayList<>();
	}
	
	public void add(String task) {
		list.add(task);
		
	}
	
	public void print() {
		for(int i=0; i<list.size();i++){
			System.out.println(i+"-"+list.get(i));
		}
		
	}
	
	public void remove(int number) {
		list.remove(number);
		
	}
}