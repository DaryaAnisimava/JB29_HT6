package by.epam.les06.main;
import java.util.Arrays;
import java.util.Random;

public class Task5 {
	//Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой
	//последовательности. Если таких чисел нет, то вывести сообщение об этом факте.
	public static void main(String[] args) {
		int size = 10;
		
		int [] ar = new int [size];
		
		for (int i=0; i<= ar.length-1; i++) {
			Random rand = new Random();
			ar[i] = rand.nextInt(10);
			System.out.println(ar[i] + " ");
			}
		
		int [] z = evenAr(ar);
		String str = Arrays.toString(z);
		System.out.println(str);
	}
	public static int[] evenAr(int[] array) {
        int[] tmp = new int[array.length];
        int count = 0;
        for (int n : array)
            if (n % 2 == 0)
                tmp[count++] = n;
        if (count != 0)
            return Arrays.copyOf(tmp, count);
        System.out.println("Четных чисел нет");
        return null;
    }

}
