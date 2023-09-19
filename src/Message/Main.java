package Message;

public class Main {
	public static void main(String[] args) {
		
		Message m1 = new Message("J", "k");
		Message m2 = new Message("L","M");
		Message m3 = new Message("L","LGTS");

		MessagingService ms = new MessagingService();
		ms.add(m1);
		ms.add(m2);
		ms.add(m3);
		
		System.out.println(ms.toString());
		
	}
}
