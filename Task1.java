package by.epam.les06.main;
import java.util.Scanner;
import java.util.Random;
public class Task1 {
	//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int size = 10;
	int [] A = new int[size];
	int s = 0;
	Random rand = new Random();
	for (int i =0; i<=A.length-1; i++) {
	
		A[i] = rand.nextInt(10);
		System.out.println(A[i] + " ");
	}
	System.out.println("Введите K ");
	int K = sc.nextInt();
	
	for (int i=0; i< A.length; i++){
		if (A[i] % K==0) {
			s = s + A[i];
		}
		
	}	
	System.out.println("s=" + s);
	}	
}
