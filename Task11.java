package by.epam.les06.main;

import java.util.Random;
import java.util.Scanner;

public class Task11 {
	//Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток от деления на М равен L (0 < L
	//< М-1).
	public static void main(String[] args) {
		int size = 10;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter M>");
		int m = sc.nextInt();
		
		System.out.println("Enter L : 0<L<M-1>");
		int l = sc.nextInt();
		
		
		int [] ar = new int [size];
		
		
		for (int i=0; i<= ar.length-1; i++) {
			Random rand = new Random();
			ar[i] = rand.nextInt(20);
			System.out.println(ar[i] + " ");
			}
		
		if ((l<0) || (l>m-1)) {
			System.out.println("Not valid L");
	
		}
	
		System.out.println("mod = L:");
		for (int i=0; i<= ar.length-1; i++) {
			if (ar[i] % m ==l) {
				System.out.println(ar[i]);
			}
		}
		
	}
}
