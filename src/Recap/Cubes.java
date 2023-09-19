package Recap;

public class Cubes {
	
	int number;
	
	
	
	public int getCube(int n) {
		return n*n*n;
	}
	
	public double getAverage(int[] arrayNumbers) {
		int counter=0;
		double sum=0;
		for(int n:arrayNumbers) {
			sum += 1.0*n;
			counter++;
		}
		double average = 1.0 * sum/counter;
		return average;
	}
	
	

}
