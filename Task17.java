package by.epam.les06.main;

import java.util.Arrays;
import java.util.Random;
import java.util.Arrays;
public class Task17 {
	//Дана последовательность целых чисел  a1 ,a2 ,...,an. Образовать новую последовательность, выбросив из
	//исходной те члены, которые равны min( a1,a2 ,... ,an).
	public static void main(String[] args) {
		int n =20;

		int [] ar = new int [n];
		
		
		for (int i=0; i<= ar.length-1; i++) {
			Random rand = new Random();
			ar[i] = rand.nextInt(20);
			System.out.print(ar[i] + " ");
			}
		
		int [] m = deleteMinValue(ar);
		String str = Arrays.toString(m);
		System.out.println("New array without min element:");
		System.out.println(str);
	
	}

	public static int[] deleteMinValue(int[] array) {

        int count = 0;
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];

            }
        }

        for (int value : array) {
            if (value == min) {
                count++;
            }
        }

        int[] result = new int[array.length - count];

        int indexResult = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != min) {
                result[indexResult] = array[i];
                indexResult++;
            }
        }
        return result;
    }
}
