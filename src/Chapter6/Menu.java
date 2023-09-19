package Chapter6;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
    	if(!meals.contains(meal))
    	meals.add(meal);
    }
    
    public void printMeals() {
    	for (String m: meals) {
    		System.out.println(m);
		}
    }
    
    public void clearMenu() {
    	this.meals.clear();
    }
}