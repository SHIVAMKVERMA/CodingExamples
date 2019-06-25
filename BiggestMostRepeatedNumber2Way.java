import java.util.*;

/*
	In this class BubbleSort
	This is second way to find BiggestMostRepeatedNumber
	from given array
*/
public class BiggestMostRepeatedNumber2Way {
	
	public static void main(String[] args) {

		//Array 
		int[] array = {1,2,3,5,9,7,5,3,5,6,7,8,3,5};

		//Array Length
		int arrLength = array.length;

		//Method Call
		int result = findBiggestRepeatedNumber(array, arrLength);	

		//Printing the result
		System.out.println(result);
	}

	/*
		method name findBiggestRepeatedNumber
		MethodType static
	 	Access_Modifier public
	 	Argument array the int array
	 	Argument arrlength the int
	 	Return int
	*/
	public static int findBiggestRepeatedNumber(int[] array, int arrLength) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		int repeatCount = 1;

		for (int i = 0;i < arrLength ; i++) {
			for (int j = i + 1;j < arrLength ; j++) {
				if (array[i] == array[j]) {
					if(map.containsKey(array[i])) {
						map.put(array[i], 1 + repeatCount);
						repeatCount++;
					} else {
						map.put(array[i], repeatCount);
					}
				}
			}	
		}

		int[] arrNew = new int[map.size()];
		int i = 0;
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
		 	System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue()); 
		 	
		 		arrNew[i] = entry.getValue();
		 		i++;
		} 

        Arrays.sort(arrNew);

		return getKey(map,arrNew[arrNew.length - 1]);
	}

	/*
		Method name getkey
		MethodType static
		Access_Modifier
		Argument map the Map<K, V>
		Argument value the V
		Return <K, V> K
	*/
	public static <K, V> K getKey(Map<K, V> map, V value) {
		for (Map.Entry<K, V> entry : map.entrySet()) {
			if (value.equals(entry.getValue())) {
				return entry.getKey();
			}
		}
		return null;
	}
}