/*
 * You have a ladder n-steps in height.  You can either take one step or two
 * steps up the ladder at a time.  How can you find out all the different
 * combinations up the ladder?  Then figure out an algorithm that will actually
 * print out all the different ways up the ladder.  ie: 1,1,2,1,2,2... etc...
 */

import java.util.ArrayList;
import java.util.List;


public class LadderSteps {

	// time complexity: O(n*n)
	// space complexity: O(n*n)
	static List<List<Integer>> getSteps(int number){
		
		List<List<Integer>> stepsList = new ArrayList<List<Integer>>();
		List<Integer> firstList= new ArrayList<Integer>();
		firstList.add(1);
		stepsList.add(firstList);
		
		for(int i = 2; i <= number; i ++){
			int length = stepsList.size();
			for(int j = 0; j < length; j ++){
				
				if(stepsList.get(j).get(stepsList.get(j).size() - 1) == 1){				
					List<Integer> newList = new ArrayList<Integer>(stepsList.get(j));
					newList.set(newList.size() - 1, 2);
					stepsList.add(newList);
				}
				stepsList.get(j).add(1);

			}
		}
		return stepsList;	
	}
	
	public static void main(String[] args){
		List<List<Integer>> stepsList = getSteps(6);
		for(int i = 0; i < stepsList.size(); i ++){
			StringBuilder ss = new StringBuilder("");
			for(int j = 0; j < stepsList.get(i).size(); j ++){
				ss.append(stepsList.get(i).get(j) + ", ");
			}
			System.out.println(ss);
		}
		
	}
}
