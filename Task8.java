package by.epam.les06.main;
import java.util.Scanner;
import java.util.Random;

public class Task8 {
	//Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
	//положительных и нулевых элементов.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N>");
		int n = sc.nextInt();
	
		int [] ar = new int [n];
		
		for (int i=0; i<= ar.length-1; i++) {
			Random rand = new Random();
			ar[i] = rand.nextInt(10)-5;
			System.out.println(ar[i] + " ");
			}
		
		int a = neg(ar);
		System.out.println("количество отрицательных элементов = "+ a);
		
		int b = pos(ar);
		System.out.println("количество положительных элементов = "+ b);
		
		int c = nul(ar);
		System.out.println("количество нулевых элементов = "+ c);
	}

	public static int nul(int[] ar) {
		int count = 0;
		for (int i=0; i<= ar.length-1; i++) {
			if (ar[i]==0) {
				count++;
			}
		}
		
		return count;
	}

	public static int pos(int[] ar) {
		int count = 0;
		for (int i=0; i<= ar.length-1; i++) {
			if (ar[i]>0) {
				count++;
			}
		}
		
		return count;
	}

	public static int neg(int[] ar) {
		int count = 0;
		for (int i=0; i<= ar.length-1; i++) {
			if (ar[i]<0) {
				count++;
			}
		}
		
		return count;
	}
}
