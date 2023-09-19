package SimpleDateExercise;

public class Main {
	public static void main(String[] args) {
		SimpleDate d = new SimpleDate(30, 12, 2012);
		System.out.println(d.toString());
		d.advance();
		System.out.println(d.toString());
		d.advance();

		
		System.out.println(d.toString());

		d.advance(30);
		System.out.println(d.toString());
		d.advance(120);

		
		System.out.println(d.toString());

		d.advance(1660);

		System.out.println(d.toString());
		
		SimpleDate cloned = d.afterNumberOfDays(200);
		
		System.out.println(d.toString());
		System.out.println(cloned.toString());

		
	}
}
