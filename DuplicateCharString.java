import java.util.*;
/*
 * In this class DuplicateCharString
 * calculate the duplicate characters in given string
*/
public class DuplicateCharString {
	public static void main(String[] args) {

		System.out.println("Hello World!");

		//Scanner Class for user input
		// You can define the normal string for this as well.
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String For Duplicate Character Calculation: ");
		//Read the String Input
		String scString = sc.next();
		//Original String Input
		System.out.println("Original String: " + scString);
		// String Length
		int strLength = scString.length();
		//Calling printDuplicateCharacterFromString method
		printDuplicateCharacterFromString(scString, strLength);

		
		sc.close();
	}

	/*
	 * ReturnType void
	 * MethodType static
	 * Access_Modifier public
	 * Argument str the String
	 * Argument strLength the int
	 * printDuplicateCharacterFromString
	*/
	public static void printDuplicateCharacterFromString(String str, int strLength) {
		char[] arr = str.toCharArray();
		for (int i=0; i < strLength; i++) {
			for (int j = i + 1; j < strLength; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}
}