package Other;

public class Main {
	public static void main(String[] args) {
		Money m1 = new Money(10,20);
		System.out.println(m1.toString());
		
		Money m2 = new Money(20,5);
		m2.plus(m1);
		m2.plus(m1);
		System.out.println(m2.toString());
		Money m3 = m2;
		m3 = m2.plus(m1);
		System.out.println(m3.toString());
	}
	
}
