/*
 * Write an algorithm to calculate the square root of a number.
 */
public class SquareRoot {
	
	// time complexity: O(log n)
	// space complexity: O(1)
	static double getSquareRoot(double number){
		double guess = number/2;
		double standard = 0.00001;
		while(Math.abs(guess - number/guess) > standard){
			guess = Math.abs(guess - number/guess)/2;
		}
		return guess;
	}
	
	public static void main(String[] args){
		System.out.println(getSquareRoot(99));
	}

}
