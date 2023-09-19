package Chapter7;

import java.util.Arrays;

public class MainProgram {

	public static void main(String[] args) {
		int[] arrayInt = {5,7,8,2,1,9,16};
		System.out.println(Arrays.toString(arrayInt));
		Arrays.sort(arrayInt);
		System.out.println(Arrays.toString(arrayInt));

 	}
	
	public static int smallest(int[] array) {
		int smallest = 0;
 		for(int i=0; i<array.length;i++) {
			if(array[i]<smallest) {
				smallest = array[i];
			}
		}
		return smallest;
	}
	
	public static int indexSmallest(int[] array) {
		int smallest = 0;
		int indexSmallest=0;
 		for(int i=0; i<array.length;i++) {
			if(array[i]<smallest) {
				smallest = array[i];
				indexSmallest = i;
			}
		}
		return indexSmallest;
	}
	
	public static int indexSmallestFrom(int[] array, int index) {
		int indexSmallest = index;
		int smallest = array[index];
		for(int i = index; i<array.length;i++) {
			if(array[i]<array[indexSmallest]) {
				smallest = array[i];
				indexSmallest = i;
			}
		}
		return indexSmallest;
	}
	
	public static void swap(int[] array, int index1, int index2) {
		int helper;
		helper = array[index2];
		array[index2] = array[index1];
		array[index1] = helper;
		
	}
	
	public static void sort(int[] array) {
		System.out.println(array.toString());
		for(int i = 0; i< array.length;i++) {
			int smallest = MainProgram.indexSmallestFrom(array, i);
			System.out.println(smallest);
			if(array[smallest]<array[i]){
				swap(array, i, smallest);
			}
			System.out.println(Arrays.toString(array));

		}

	}
	
	
	
	
	
	
}
