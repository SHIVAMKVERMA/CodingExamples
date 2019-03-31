/*
 *In this class ReverseIntArray
 * reverse the given array and prints on console.
*/
public class ReverseIntArray {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		// Array Declaration and Initialization.
		// Array can be made via user input using Scanner or Console
		int[] arr = {6,	10,20,3, 50, 9, 6};
		//Static method which prints the reversed array
		// From given array
		reverseArray(arr);
	}

	public static void reverseArray(int[] a) {
		int[] newArray = new int[a.length];
		int arrLength = a.length;
		
		for (int i=0;i<a.length ;i++ ) {
			newArray[arrLength - (i + 1)] = a[i];
		
		}

		for (int k=0;k < arrLength;k++ ) {
			System.out.println(newArray[k]);
		}
	}
}