package by.epam.les06.main;

import java.util.Random;

public class Task16 {
	//Даны действительные числа 𝑎1, 𝑎2, … , 𝑎2𝑛. Найти
	//max( a1+a2n+1,a2+a2n-1 , , an+an+1)
	public static void main(String[] args) {
	int n =10;

	int [] ar = new int [2*n];
	
	
	for (int i=0; i<= 2 * n-1; i++) {
		Random rand = new Random();
		ar[i] = rand.nextInt(20);
		System.out.println(ar[i] + " ");
		}
	int max = ar[0] + ar[2*n-1];
	
	
    for (int i = 1; i<=n; i++) {
  
       int curr = ar[i] + ar[2*n -1 - i];
       if (curr > max) {
       
            max = curr;
       }
    }
    System.out.println("max= " +max);
	}
	}
