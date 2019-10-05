package by.epam.les06.main;

import java.util.Random;

public class Task14 {
	//Дан одномерный массив A[N]. Найти: max( a2, a4 ,... ,a2k )+ min( a1, a3 , ... , 2k+1)
	public static void main(String[] args) {
		int size = 10;
		int [] ar = new int [size];
		
		
		for (int i=0; i<= ar.length-1; i++) {
			Random rand = new Random();
			ar[i] = rand.nextInt(20);
			System.out.println(ar[i] + " ");
			}
		
		int max =evenMax(ar);
		int max1 = oddMax(ar);
		int s= max + max1;
		System.out.println("max=" +max);
		System.out.println("max1=" +max1);
		System.out.println("s=" +s);
	}

	public static int oddMax(int[] ar) {
		int max=0;
		for (int i=1; i<= ar.length-1; i++) {
			if ((ar[i]>ar[max])&&(ar[i] % 2==1)) {
				ar[max]=ar[i];
			}
		}
		return ar[max];
	}

	public static int evenMax(int[] ar) {
		int max =0;
		for (int i=0; i<= ar.length-1; i++) {
			if ((ar[i]>ar[max])&& (ar[i] % 2==0)) {
				ar[max]=ar[i];
			}
		}
		return ar[max];
	}
}
