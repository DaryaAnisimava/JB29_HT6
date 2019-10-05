package by.epam.les06.main;

import java.util.Random;

public class Task10 {
	//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
	public static void main(String[] args) {
		int size = 10;
		
		int [] ar = new int [size];
		
		for (int i=0; i<= ar.length-1; i++) {
			Random rand = new Random();
			ar[i] = rand.nextInt(10)-5;
			System.out.println(ar[i] + " ");
			}
		System.out.println("Числа с ai>i:");
		for (int i=0; i<= ar.length-1; i++) {
			if (ar[i]>i) {
				System.out.println(ar[i]);
			}
		}
	}
}
