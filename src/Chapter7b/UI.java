package Chapter7b;

import java.util.Scanner;

public class UI {
	Scanner scanner;
	GradeList gradeList;
	String command;
	public UI(Scanner scanner, GradeList gradeList) {
		this.gradeList = gradeList;
		this.scanner = scanner;

	}

	public void start() {
		while(true) {
			System.out.println("add notes: type 'ADD'");

			command = scanner.nextLine();

			if(command.equalsIgnoreCase("add")) {
				this.add(gradeList);
  			}
			
			System.out.println(gradeList.toString());
			
			System.out.println("Average: "+ gradeList.getAverage());
			
			gradeList.gradeDistribution();

			
			if(command.equalsIgnoreCase("end"))
				break;


		}
		

	}
	
	public void add(GradeList gradeList) {
		while(true) {
			System.out.println("Insert grades 0-100");

			int number = Integer.valueOf(scanner.nextLine());

			if(number == -1) {
				break;
			} else {
				gradeList.addGrade(number);
			}
		}
		
	}
	
	


}
