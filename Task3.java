package by.epam.les06.main;
import java.util.Random;

public class Task3 {
	//Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается раньше -
	//положительное или отрицательное.
	public static void main(String[] args) {
		
		int [] array = {-12, -9, -6, -3, 0, 3, 6};
		
	
		int count = 0;
		int count1 =0;
		for (int i = 0; i <= array.length-1; i++) {
			
			if (array[i] > 0) {
				count = count +1;
			}
		
			if (array[i] < 0) {
				count1 = count1 + 1;
			}		
			
			
	}

		
		//System.out.println("число полож " + count);
		//System.out.println("число отриц " +count1);
		if (count > count1) {
			System.out.println("число положительных чисел больше");
		}
		if (count < count1) {
			System.out.println("число отрицательных чисел больше");
		}
		if (count == count1) {
			System.out.println("число положительных и отрицательных чисел равное");
		}
	}		
}