package Recap;

import java.util.HashMap;

public class Abbreviations {
	
	private HashMap<String, String> abbr;
		
	public void addAbbreviation(String abbreviation, String explanation) {
		abbr.put(abbreviation, explanation);
		
	}
	
	public boolean hasAbbreviation(String abbreviation) {
		return abbr.containsKey(abbreviation);
	}
	
	public String findExplanationFor(String abbreviation) {
		if(abbr.containsKey(abbreviation)) {
			String returnedExpl = abbr.get(abbreviation);
		
			return returnedExpl;
	}
		return "";
	

}
	
}
