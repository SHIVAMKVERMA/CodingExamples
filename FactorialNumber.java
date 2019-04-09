import java.util.*;

/*
 * In this class FactorialNumber
 * we calculate the factorial of a number with given input
 * via recursion method
*/
public class FactorialNumber {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		//Scanner Class for user input
		// You can define the normal int for this as well.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for factorial calculation: ");
		// Read the integer input
		int num = sc.nextInt();

		System.out.println("Factorial For : " + num + " via recursion");
		// Calling the calcFactorial function for calculation.
		System.out.println(calcFactorial(num));
	}

	/*
	 * ReturnType int
	 * MethodType static
	 * Access_Modifier public
	 * Argument n the int
	 * calcFactorial
	*/
	public static int calcFactorial(int n) {
		if(n == 0) {
			return 1;
		}

		return n*calcFactorial(n-1);
	}
}

/*
Sample Output:

Hello World!
Enter number for factorial calculation:
7
Factorial For : 7 via recursion
5040
*/