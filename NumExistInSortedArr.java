/*
 * Given the function: "bool numExists( int array[], int array_len, int num )"
 * where "array" is a sorted array of integers.  Determine if "num" exists in the
 * array.
 */
public class NumExistInSortedArr {
	
	static boolean numExists(int array[], int num){
		return numExists(array, 0, array.length -1, num);
	}
	
	// time complexity: O(log n)
	// space complexity: O(1)
	static boolean numExists(int array[], int startIndex, int endIndex, int num){
		if(endIndex < startIndex){
			return false;
		}
		int midPosition = startIndex + (endIndex - startIndex)/2;
		if(array[midPosition] == num){
			return true;
		}else{
			if(num > array[midPosition]){
				return numExists(array, midPosition + 1, endIndex, num);
			}else{
				return numExists(array, startIndex, midPosition - 1, num);
			}
		}
	}
	
	public static void main(String[] args){
		int[] sortedNums = {1, 3, 5, 10, 43, 54, 100, 444, 700};
		if(numExists(sortedNums, 444)){
			System.out.println("exist");
		}else{
			System.out.println("not exist");
		}
	}
}
