package Chapter6;

import java.util.ArrayList;
import java.util.Iterator;

public class Suitcase {
	private int numItems;
	private double totalWeight;
	private ArrayList<Item> itemList;
	
	public Suitcase() {
		itemList = new ArrayList<>();
	}
	
	public boolean hasItem(Item x) {
		
		if(itemList.size()>0) {
			for(Item a: itemList) {
				if(x.equals(a))
					return true;
			}
		}
		return false;
	}
	
	public void add(Item x) {
		if(!this.hasItem(x)) {
			itemList.add(x);
		}
	}
	
	public void remove(Item x) {
		if(this.hasItem(x)) {
			itemList.remove(x);
		}
		
	}
	
	public void clear() {
		itemList.clear();
		
	}
	
	public void getAll() {
		for(int i=0;i<itemList.size();i++) {
			System.out.println(itemList.get(i));
		}
	}
	
	public double averageWeight() {
		int counter = 0;
		double sumWeight = 0;
		
		for(Item i: itemList) {
			sumWeight +=i.getWeight();
			counter++;
		}
		return 1.0*(sumWeight/counter);
	}

}
