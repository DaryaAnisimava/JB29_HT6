package by.epam.les06.main;
import java.util.Random;
import java.util.Scanner;

public class Task12 {
	//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
	//являются простыми числами.
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter N>");
	int n = sc.nextInt();
	double sum = 0;

	double [] ar = new double [n];
	
	for (int i=0; i<= n-1; i++) {
		Random rand = new Random();
		ar[i] = rand.nextDouble();
		System.out.println(ar[i] + " ");
		}
	
	for (int i = 0; i < ar.length-1; i++) {
        if (isPrime(i)) {
            sum+=ar[i];
        }
    }
    System.out.println("Summ: " + sum);

}

public static boolean isPrime(int x) {
    if (x < 2) return false;
    int temp;
    for (int i = 2; i <= x / 2; i++) {
        temp = x % i;
        if (temp == 0) {
            return false;
        }
    }
    return true;
}
	}

