package Chapter7b;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeList {
	private ArrayList<Integer> gradeList;
	private int grade;
	private int passingGrade;
	
	public GradeList() {
		this.gradeList = new ArrayList<>();
		this.passingGrade = 50;
	}
	
	public void addGrade(int gradeToAdd) {
		if(!(gradeToAdd > 100 || gradeToAdd <0)) {
			gradeList.add(gradeToAdd);
			return;
		}
		System.out.println("Invalid grade.");
	}

	@Override
	public String toString() {
		return "GradeList [gradeList=" + gradeList + ", grade=" + grade + "]";
	}
	
	public double getAverage() {
		double average;
		int counter=0;
		int total=0;
		for(int grade:this.gradeList) {
			total += grade;
			counter++;
		}
		average = 1.0 *total/counter;
		return average;
	}
	
	public double getAverageAboveGrade() {
		double averageAbove;
		int counter=0;
		int total=0;
		for(int grade:this.gradeList) {
			if(grade>this.passingGrade) {
			total += grade;
			counter++;
			}
		}
		averageAbove = 1.0*total/counter;
		return averageAbove;
	}
	
	public int evalGrade(int grade) {
		//return 0-5
		
		if(grade<50)
			return 0;
		if(grade<60)
			return 1;
		if(grade<70)
			return 2;
		if(grade<80)
			return 3;
		if(grade<90)
			return 4;
		if(grade>=90 && grade <=100)
			return 5;
		else
			return 0;
	}
	
	public void gradeDistribution() {
		int[] stars = new int[6];
		for(int grade:this.gradeList) {
			stars[evalGrade(grade)]++;
		}
		System.out.println(Arrays.toString(stars));
	}
	
}
