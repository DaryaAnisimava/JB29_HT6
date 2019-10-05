package by.epam.les06.main;

import java.util.Random;

public class Task6 {
	//Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти
	//числа.
	public static void main(String[] args) {
		int size = 10;
		
		int [] ar = new int [size];
		
		for (int i=0; i<= ar.length-1; i++) {
			Random rand = new Random();
			ar[i] = rand.nextInt(10)-5;
			System.out.println(ar[i] + " ");
			}
		
		int max = findMax(ar);
	
		int min = findMin(ar);
	
		int r = Math.abs(max-min);
		System.out.println("r=" +r);
	}

	public static int findMin(int[] ar) {
		int min = 0;
		for (int i=0; i<= ar.length-1; i++) {
			if (ar[i]<min) {
				min=ar[i];
			}
		}
		return min;
	}

	public static int findMax(int [] ar) {
		int max = 0;
		for (int i=0; i<= ar.length-1; i++) {
			if (ar[i]>max) {
				max=ar[i];
			}
		}
		return max;
	}
}