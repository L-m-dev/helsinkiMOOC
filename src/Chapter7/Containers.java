package Chapter7;
import java.util.Scanner;

public class Containers {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		String command;
		int amount=0;
		int container1 = 0;
		int container2 = 0;
		
		while(true) {
			System.out.println("Container state:");
			System.out.println("1: "+container1);
			System.out.println("2: "+container2);
			System.out.println("Commands: ADD qty / MOVE qty / REMOVE qty / END");
			
			input = sc.nextLine();
			String[] parts = input.split(" ");
			command = parts[0];
			
			try {
			if(parts[1] != null) {
				amount = Integer.valueOf(parts[1]);
			}
			} catch(Exception e) {System.out.println("okay");
			}
			if(command.equals("ADD")) {
				container1 = container1 + amount;
				if(container1>100)
					container1 = 100;
			}
			
			if(command.equals("MOVE")) {
				container2 = container2 + amount;
				if(container2>100)
					container2=100;
				container1 -= amount;
				if(container1 < 0)
					container1= 0 ;
			}
			
			if(command.equals("REMOVE")) {
				container1 = container1 - amount;
				if(container1<0) {
					container1=0;
				}
			}
			
			
			if(command.equals("END")) {
				break;
			}
		}
			
	}
		
}
