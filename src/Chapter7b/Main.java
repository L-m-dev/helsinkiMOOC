package Chapter7b;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeList gradeList = new GradeList();
		UI ui = new UI(scanner, gradeList);
		
		ui.start();
		
		
		
		
	}
}
