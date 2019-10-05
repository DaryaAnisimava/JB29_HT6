package by.epam.les06.main;

import java.util.Random;
import java.util.Scanner;

public class Task15 {
	//Дана последовательность действительных чисел n a ,a , ,a 1 2  . Указать те ее элементы, которые
	//принадлежат отрезку [с, d].
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter c>");
		int c = sc.nextInt();
		
		System.out.println("Enter d>");
		int d = sc.nextInt();
			
	int size =20;
	int [] ar = new int [size];
	
	
	for (int i=0; i<= ar.length-1; i++) {
		Random rand = new Random();
		ar[i] = rand.nextInt(20);
		System.out.println(ar[i] + " ");
		}
	
	System.out.println("На отрезке [c;d]: ");
	for (int i=0; i<= ar.length-1; i++) {
		if ((ar[i]>=c)&&(ar[i]<=d)) {
		System.out.println(ar[i] + " ");
		}
	}
}
}