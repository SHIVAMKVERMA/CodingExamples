import java.util.*;

/*
 * In this class FibonacciSeries
 * we calculate the fibonacci series with given number
 * with recursion method
*/
public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		//Scanner Class for user input
		// You can define the normal int for this as well.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input for fibonacci series calculation: ");
		// Read the integer input
		int num = sc.nextInt();
		System.out.println("Printing Fibonacci Series upto " + num + " numbers : ");

		// Calling the fibonacciSeries function for calculation.
		for (int i = 1; i <= num ; i++) {
			System.out.println(fibonacciSeries(i));	
		}
		
		sc.close();
	}

	/*
	 * ReturnType int
	 * MethodType static
	 * Access_Modifier public
	 * Argument n the int
	 * fibonacciSeries
	*/
	public static int fibonacciSeries(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}

		return fibonacciSeries(n-1) + fibonacciSeries(n-2);
	}
}

/*
Sample Output
Hello World!
Enter input for fibonacci series calculation:
20
Fibonacci Series upto 20 numbers :
1
1
2
3
5
8
13
21
34
55
89
144
233
377
610
987
1597
2584
4181
6765

*/