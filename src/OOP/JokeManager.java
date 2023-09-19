package OOP;

import java.util.ArrayList;

public class JokeManager {
	private ArrayList<String> jokeList;

	public JokeManager() {
		this.jokeList = new ArrayList<>();

		
	}
	public void addJoke(String joke) {
		jokeList.add(joke);
	}
	
	public String drawJoke() {
		int listSize = this.jokeList.size();
		int randomNumber;
		randomNumber =(int)(Math.random()*listSize);
		return jokeList.get(randomNumber);
	}
	
	public void printJokes() {
		for (int i = 0; i < jokeList.size()-1; i++) {
			System.out.println(jokeList.get(i));
		}
	};
	
	public int one() {
		return 2;
	}

}
