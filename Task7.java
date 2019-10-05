package by.epam.les06.main;
import java.util.Scanner;


public class Task7 {
	//Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z,
	//этим числом. Подсчитать количество замен.
	public static void main(String[] args) {
		//int size = 10;
	
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Z>");
		int z = sc.nextInt();
		int [] ar = {-1, 9, -10, 7, -4, -8, 6, 0, 8, 19} ;
				
		
		change(ar, z);
		for (int i=0; i<= ar.length-1; i++) {
		System.out.print(ar[i] + " ");
		
		}
	}
	public static void change(int[] ar, int z) {
		int count = 0;
		for (int i=0; i<= ar.length-1; i++) {
			if (ar[i]>z){
				ar[i]=z;
				 
				count++;
			}
			
				
		}
		System.out.println("количество замен=" + count);
		
	}
}
