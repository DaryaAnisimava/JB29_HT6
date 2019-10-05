package by.epam.les06.main;
import java.util.Arrays;
public class Task2 {
	//В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.
	public static void main(String[] args) {
		//int size = 1000; 
		int [] array = {1, 0, 9, 11, 0, 8, 9, 0 ,7};
	  
		int[] z = getZero(array);
		 System.out.println(Arrays.toString(z));
		
}

	private static int[] getZero(int[] array) {
		
		int count = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == 0) {
            	count=count + 1;
            }
        }

        int[] newArray = new int[count];
        count =0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == 0) {
            	newArray[count] = i;
            	count ++;
            }
           
        }
		return newArray;
  
	}
}