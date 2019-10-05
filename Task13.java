package by.epam.les06.main;

import java.util.Random;
import java.util.Scanner;

public class Task13 {
	//Определить количество элементов последовательности натуральных чисел, кратных числу М и
	//заключенных в промежутке от L до N.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter M>");
		int m = sc.nextInt();
		
		System.out.println("Enter L> ");
		int l = sc.nextInt();
		
		System.out.println("Enter N> ");
		int n = sc.nextInt();
		int k =0;
		int size = 100;
		int [] ar = new int [size];
	
	for (int i=0; i<= ar.length-1; i++) {
		Random rand = new Random();
		ar[i] = rand.nextInt(100);
		System.out.println(ar[i] + " ");
		}
	
	  
	  for (int i=1; i<=ar.length-1; i++) {
	  
	      
	      if ((ar[i]>=l) && (ar[i]<=n) && ((ar[i] % m)== 0)) {
	        k++;
	      }
	  }
	 
	  System.out.println("k=" + k);
	}
}
