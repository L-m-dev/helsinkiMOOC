package Chapter7;

public class Container {
	private int liquidInside;
	
	public static void main(String[] args) {
		Container c = new Container();
		System.out.println(c.toString());
		c.add(200);
		System.out.println(c.toString());

	}
	
	public Container() {
		this.liquidInside=0;
				
	}
	
	public int contains() {
		return liquidInside;
	}
	
	public void add(int amount) {
		this.liquidInside = Math.min(liquidInside+amount, 100);
	}
	
	public void remove(int amount) {
		this.liquidInside = Math.max(liquidInside-amount, 0);
	}

	@Override
	public String toString() {
		return "Container [liquidInside=" + liquidInside + "]";
	}
	
	
	
}
