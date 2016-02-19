import java.util.HashMap;
import java.util.Map;

/*
 * Give an array of 100 random integers. Write an algorithm to find the the
 * closest 2 integers (closest by position) in the array that add up to 100.
 */
public class ClosestPosition {
	
	// time complexity: O(n)
	// space complexity: O(n)
	static int[] getClosestIntegers(int[] nums){
		int[] results = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		int shortest = nums.length;
		for(int i = 0; i < nums.length; i ++){
			if(map.get(100 - nums[i]) != null){
				if(i - map.get(100 - nums[i]) < shortest){
					shortest = i - map.get(100 - nums[i]);
					results[0] = 100 - nums[i];
					results[1] = nums[i];
				}
			}
			
			map.put(nums[i], i);
		}
		return results;
	}
	
	public static void main(String[] args){
		int[] nums = {1, 2, 3, 4, 85, 1, 2, 3, 40, 5, 1, 2, 3, 60, 15};
		int[] results = getClosestIntegers(nums);
		System.out.println(results[0]);
		System.out.println(results[1]);
	}
}
