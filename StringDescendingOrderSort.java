import java.util.*;

public class StringDescendingOrderSort {
	public static void main(String[] args) {
		String[] str = {"Ram,Desh", "Shyam,Sharma", "Saurabh,Chakra","Anubhav,Mishra"};	

		printSplitAndReverseStringArray(str);
	}

	public static void printSplitAndReverseStringArray(String[] array) {
		int arrLength = array.length;

		List<String> stringList = new ArrayList<String>();

		String[] str3 = new String[arrLength];

		for (String str: array) {
			stringList.add(str);
		}

		for (int i = 0; i < stringList.size(); i++) {
		
			String str1 = stringList.get(i);
			
			String[] str2 = str1.split(",");
			str3[i] = str2[str2.length - 1];
		}

		Arrays.sort(str3, Collections.reverseOrder());

		for (String sortedStr : str3) {
			System.out.println(sortedStr);
		}
	}
}
