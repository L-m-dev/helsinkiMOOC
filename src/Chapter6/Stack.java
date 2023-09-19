package Chapter6;
import java.util.ArrayList;
public class Stack {
	ArrayList<String> testList;
	
	public Stack() {
		this.testList = new ArrayList<>();
	}
	
	public boolean isEmpty() {
		if(this.testList.size()>=1) {
			return false;
		}
		return true;
	}
	
	public void add(String value) {
		if(!testList.contains(value)) {
			testList.add(value);
		}
	}
	
	public ArrayList<String> values(){
		return this.testList;
	}
	
	public String take() {
		String returnString;
		if(testList.size()>0) {
			  returnString = testList.get(testList.size()-1);
			testList.remove(testList.size()-1);
			return returnString;
		}
		return "none";
	}
}
