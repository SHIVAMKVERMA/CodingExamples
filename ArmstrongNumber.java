import java.util.*;
/*
 * A number is called armstrong number when 
 * it is equal to the sum of cubes of its digits
 * In this class ArmstrongNumber
 * we calculate whether the number is armstrong or not
*/
public class ArmstrongNumber {
	
	public static void main(String[] args) {
		System.out.println("Hello World!");

		//Scanner Class for user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check if it is armstrong number: ");		

		// Read the integer input
		int value = sc.nextInt();

		// Calling checkArmstrongNumber
		checkArmstrongNumber(value);
	}

	/*
	 * ReturnType void
	 * MethodType static
	 * Access_Modifier public
	 * Argument num the int
	 * checkArmstrongNumber
	*/
	public static void checkArmstrongNumber(int num) {
		int armNum = 0;
		int numCopy = num;
		int a = 0;

		while(num > 0) {
			a = num % 10;
			num = num / 10;
			armNum = armNum + (a * a * a);
		}


		if (numCopy == armNum) {
			System.out.println(numCopy + " is a Armstrong Number");
		} else {
			System.out.println(numCopy + " is not a Armstrong Number");
		}
	}
}

/*
Sample Output:
Hello World!
Enter number to check if it is armstrong number:
407
407 is a Armstrong Number

Hello World!
Enter number to check if it is armstrong number:
408
408 is not a Armstrong Number
*/