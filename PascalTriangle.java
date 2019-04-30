import java.util.*;

/*
 * In this class PascalTriangle
 * we print the pascal triangle with given input
 */
public class PascalTriangle {
	public static void main(String[] args) {

		System.out.println("Hello World!");
		
		System.out.println("Enter the value for pascal triangle creation: ");

		//Scanner Class for user input
		Scanner sc = new Scanner(System.in);

		// Read the integer input
		int num = sc.nextInt();

		for (int i = 0; i < num ; i++) {
		
			int n = 1;

			System.out.printf("%" + (num - i) * 2 + "s", "");

			for (int j = 0; j <= i; j++) {
				System.out.printf("%4d", n);
				n = n * (i - j) / (j + 1);
			}

			System.out.println();
		}

	}
}

/*
Sample Output:

Hello World!
Enter the value for pascal triangle creation:
6
               1
             1   1
           1   2   1
         1   3   3   1
       1   4   6   4   1
     1   5  10  10   5   1


*/