import java.util.*;

/*
 * In this class PalindromeNumber
 * we check the if a number is palindrome or not
*/
public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		// Declaring and checking the palindrome
		int value = 121;
		System.out.println("Number " + value + " is palindrome: " + isNumberPalindrome(value));
		int value2 = 221;
		System.out.println("Number " + value2 + "  is palindrome: " + isNumberPalindrome(value2));
		
		//Scanner Class for user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input for palindrome : ");
		// Read the integer input
		int num = sc.nextInt();
		System.out.println("Number " + num + "  is palindrome : " + isNumberPalindrome(num));


		sc.close();		
	}

	/*
	 * ReturnType boolean
	 * MethodType static
	 * Access_Modifier public
	 * Argument num the int
	 * isNumberPalindrome
	*/
	public static boolean isNumberPalindrome(int num) { 
		int palindrome = num; 
		int revNum = 0;

		while(palindrome != 0) { 
			int rem = palindrome % 10; 
			revNum = revNum * 10 + rem; 
			palindrome = palindrome / 10; 
		}

		if (num == revNum) {
			return true;
		}
		return false;
	}
}

/*
Sample Output:

Hello World!
Number 121 is palindrome: true
Number 221  is palindrome: false
Enter the input for palindrome :
1221
Number 1221  is palindrome : true
*/