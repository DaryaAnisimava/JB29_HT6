package by.epam.les06.main;

import java.util.Random;

public class Task18 {
	//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
	//чисел несколько, то определить наименьшее из них.
	public static void main(String[] args) {
	int n =20;

	int [] ar = new int [n];
	
	
	for (int i=0; i<= ar.length-1; i++) {
		Random rand = new Random();
		ar[i] = rand.nextInt(20);
		System.out.print(ar[i] + " ");
		}
	
	int z = getNumber(ar);
	System.out.println("наиболее часто встречающееся число = " + z);
	
	
}

	private static int getNumber(int[] ar) {
		int[] p = new int[ar.length];

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    p[i]++;
                }
            }
        }

        int rez = ar[0];
        int pr = p[0];
        for (int i = 0; i < p.length; i++) {
            if (p[i] > pr) {
                pr = p[i];
                rez = ar[i];
            }
            if ((pr== p[i]) && (ar[i] < rez)) {
                rez = ar[i];
            }
        }
        return rez;
	
	}
}