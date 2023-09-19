package Chapter6;

public class Item {
	private String name;
	private double weight;
	
	public Item(String  name, double weight) {
		this.name=name;
		this.weight=weight;
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ", weight=" + weight + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public boolean equals(Object compared) {
		if(compared == this) {
			return true;
		}
		if(!(compared instanceof Item))
			return false;
		Item c =   (Item) compared;
		
		if(this.name == c.name && this.weight == c.weight) {
			return true;
		}
		return false;
}
}