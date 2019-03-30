/*
 * In this class DuplicateNumberOnIntArray
 * calculate the duplicate elements in given array
*/
public class DuplicateNumberOnIntArray {
	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		// Array Declaration and Initialization.
		// Array can be made via user input using Scanner or Console
		int[] array = {1,4,9,8,8,7,9,1,7};
		//Static method which prints the duplication elements
		// From given array
		printRepeatingElement(array);

	}

	/*
	 * ReturnType void
	 * MethodType static
	 * Access_Modifier public
	 * Argument arr the int array
	 * printRepeatingElement
	*/
	public static void printRepeatingElement(int[] arr) {

		if (arr.length > 0) {
			for (int i=0;i < arr.length;i++) {
				for (int j=i+1;j < arr.length ;j++) {
					if (arr[i] == arr[j]) {
						System.out.println(arr[i] + " ");
					}
				}
			}
		} else {
			System.out.println("Array is empty");
		}
	}
}