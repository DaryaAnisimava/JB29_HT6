package by.epam.les06.main;

import java.util.Random;

public class Task9 {
	//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
	public static void main(String[] args) {
		int size = 10;
		
		int [] ar = new int [size];
		
		for (int i=0; i<= ar.length-1; i++) {
			Random rand = new Random();
			ar[i] = rand.nextInt(10);
			System.out.println(ar[i] + " ");
			}
		
		int max = findMax(ar);
		System.out.println("max=" +max);
		int min = findMin(ar);
		System.out.println("min=" +min);
		change(ar, min, max);

		for (int i=0; i<= ar.length-1; i++) {
			
			System.out.print(ar[i] + " ");
			}
	}
	public static void change(int[] ar, int min, int max) {
		int t;
		t = ar[min];
		ar[min] = ar[max];
		ar[max] = t;
		
	}
	public static int findMin(int[] ar) {
		int min = 0;
		for (int i=0; i<= ar.length-1; i++) {
			if (ar[i]<ar[min]) {
				ar[min]=ar[i];
			}
		}
		return ar[min];
	}

	public static int findMax(int [] ar) {
		int max = 0;
		for (int i=0; i<= ar.length-1; i++) {
			if (ar[i]>ar[max]) {
				ar[max]=ar[i];
			}
		}
		return ar[max];
	}
	
	
}
