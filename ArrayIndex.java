/*
 * Given an array of integers, write a method that returns an array of the
 * same size where each index is the product of all integers except itself, i.e.
 * given array {1,2,3,4} return {24,12,8,6} explicitly {2*3*4,1*3*4,1*2*4,1*2*3}.
 */
public class ArrayIndex {
	// time complexity: O(2n)
	// space complexity: O(n)
	static int[] getProducts(int[] nums){
		int[] products = new int[nums.length];
		int productstotal = 1;
		for(int i = 0; i < nums.length; i ++){
			productstotal *= nums[i];
		}
		for(int i = 0; i < nums.length; i ++){
			products[i] = productstotal/nums[i];
		}	
		return products;
	}
	
	public static void main(String[] args){
		int[] nums = {1, 2, 3, 4};
		int[] products = getProducts(nums);
		for(int i = 0; i < nums.length; i ++){
			System.out.println(products[i]);
		}
	}

}
