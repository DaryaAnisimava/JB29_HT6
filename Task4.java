package by.epam.les06.main;
import java.util.Random;
public class Task4 {
	//Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей.
	public static void main(String[] args) {
		
		
		int [] a = {-2, -1, 0, 1, 2, 3, 0, 4, 5, 6, 7};
			
		for (int i=0; i<= a.length-1; i++) {
		
		System.out.print(a[i] + " ");
		}
		boolean f=true;
		for (int i=1; i<=a.length-1; i++) {
		if (a[i]<=a[i-1]) {
		 
		   f=false;
		   break;
		}
		}
		if (f) {
			System.out.println("Возрастающая последовательность");
		}
			else {
				System.out.println("Не возрастающая последовательность");
		}
		
}
}