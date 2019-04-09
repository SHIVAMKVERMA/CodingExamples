import java.util.*;

/*
 * In this class BubbleSort
 * we sort the given array
*/
public class BubbleSort {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		// given array for bubble sort
		int[] array = new int[]{3,5,1,2,4};
		
		// calling the bubbleSort method
		bubbleSort(array);
	}

	/*
	 * ReturnType void
	 * MethodType static
	 * Access_Modifier public
	 * Argument numbers the int array
	 * bubbleSort
	*/
	public static void bubbleSort(int[] numbers) {
		int arrLength = numbers.length;
		for (int i = 0; i < arrLength; i++) {
			for (int j = arrLength - 1; j > i; j--) {
				if(numbers[j] < numbers[j-1]) {
					swap(numbers, j, j-1);
				}
			}
		}

		//print the sorted array
		System.out.println(Arrays.toString(numbers));
	}

	/*
	 * ReturnType void
	 * MethodType static
	 * Access_Modifier public
	 * Argument numArr the int array
	 * Argument from the int
	 * Argument to the int
	 * swap
	*/
	public static void swap(int[] numArr, int from, int to ) {
		int temp = numArr[from];
		numArr[from] = numArr[to];
		numArr[to] = temp;
	}
}

/*
Sample Output:

Hello World!
[1, 2, 3, 4, 5]
*/