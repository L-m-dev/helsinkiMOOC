package Chapter6;

public class Main {

	public static void main(String[] args) {
		
		Suitcase sc = new Suitcase();
		
		Item item1 = new Item("Panela", 25.0);
		Item item2 = new Item("Pratos", 18.0);
		Item item3 = new Item("Panela", 25.0);
		sc.add(item1);
		sc.add(item2);
		sc.add(item3);
		
 		
		sc.getAll();
		
		double result = sc.averageWeight();
		
	}
}
