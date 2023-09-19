package CLI;

import java.util.Scanner;

public class TextUI {
	Scanner scanner;
	SimpleDictionary dictionary;
	
	
	public TextUI(Scanner scanner, SimpleDictionary dictionary) {
		this.scanner = scanner;
		this.dictionary = dictionary;
	}
	
	
	public void start() {
		String command;
		String word;
		String translation;
		
		while(true) {
			System.out.println("Enter command: ");
			command = scanner.nextLine();
			
			
			
			
			if(command.equals("search")){
				System.out.println("Word to search?");
				word = scanner.nextLine();
				String wordReturned = dictionary.translate(word);
				if(wordReturned == null) {
					System.out.println("No such word in here");
					continue;
				}
				System.out.println(wordReturned);
				continue;
			}
			
			if(command.equals("add")) {
				System.out.println("Word? ");
				word = scanner.nextLine();
				
				System.out.println("Translation? ");
				translation = scanner.nextLine();
				
				dictionary.add(word, translation);
				continue;
				
			}
			
			if(command.equals("end")) {
				System.out.println("Bye bye!");
				break;
			}
			else {
				System.out.println("Unknown command.");
			}
			
		}
		
	}
	
}
