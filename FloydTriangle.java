import java.util.*;

/*
 * In this class FloydTriangle
 * we draw the Floyd Triangle with given user input
*/
public class FloydTriangle {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		//Scanner Class for user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to draw Floyd Triangle : ");

		// Read the integer input
		int number = sc.nextInt();

		// Calling printFloydTriangle
		printFloydTriangle(number);

		sc.close();
	}

	/*
	 * ReturnType boolean
	 * MethodType static
	 * Access_Modifier public
	 * Argument num the int
	 * printFloydTriangle
	*/
	public static void printFloydTriangle(int num) {
		int k = 1;

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k++ + " ");


			}

			System.out.println(" ");
		}
	}
}

/*
Sample Output:

Hello World!
Enter number to draw Floyd Triangle :
10
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
16 17 18 19 20 21
22 23 24 25 26 27 28
29 30 31 32 33 34 35 36
37 38 39 40 41 42 43 44 45
46 47 48 49 50 51 52 53 54 55
*/