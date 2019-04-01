import java.util.Arrays;
/*
 * In this class RemoveDuplicatesFromArray
 * we remove the duplicate int from given array.
*/
public class RemoveDuplicatesFromArray {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		// Array Declaration and Initialization.
		// Array can be made via user input using Scanner or Console
		int[] arr = {1,1,2,2,3,4,5};

		System.out.println("Array with duplicates: ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Array without duplicates: ");
		// Calling the removeDuplicates method with above array.
		System.out.println(Arrays.toString(removeDuplicates(arr)));
	}

	/*
	 * ReturnType void
	 * MethodType static
	 * Access_Modifier public
	 * Argument array the int array
	 * removeDuplicates
	*/
	public static int[] removeDuplicates(int[] array) {
		int arrLength = array.length;

		Arrays.sort(array);

		int[] newArr = new int[arrLength];

		int prev = array[0];

		newArr[0] = prev;

		for (int i = 1; i < arrLength; i++) {
			int a = array[i];

			if (prev != a) {
				newArr[i] = a;
			}
			prev = a;
		}

		return newArr;
	}
}