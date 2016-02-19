import java.util.ArrayDeque;
import java.util.Deque;


public class Alg1 {
	
	public static void main(String[] args) {
		Alg1 alg = new Alg1();
		//alg.divide(2147483647, 1);
		int divident = -2147483648;
		//divident = divident && 0;
		//divident = divident >>> 1;
		long divident2 = Math.abs(divident);
		//int count = alg.longestValidParentheses("()");
		
		String ss = "12";
		String[] aa = ss.split("\\.");
		System.out.println(aa[0]);
		
	}
	
    private class Pair{
        char value;
        int index;
        Pair(char value, int index){
            this.value = value;
            this.index = index;
        }
        int getIndex(){
        	return index;
        }
    }
    public int longestValidParentheses(String s) {
        Deque<Pair> que= new ArrayDeque<Pair>();
        int i = 0;
        int longest = 0;
        for(char c: s.toCharArray()){
            if(c == '('){
                que.push(new Pair(c, i));
            }else{
                if(que.peek() != null){
                    //que.pop();
                    longest = Math.max(longest, i - que.pop().getIndex() + 1);
                }
            }
            i ++;
        }
        return longest;
    }
	
        public int divide(int dividend, int divisor) {

            int ret = 0;
            boolean sign = dividend > 0 ^ divisor > 0;
            
            dividend = Math.abs(dividend);
            divisor = Math.abs(divisor);
            System.out.println(dividend + "," + divisor);
            int multiply = 0;
            int sum = 0;
            while(divisor < dividend){
                multiply = 1;
                sum = divisor;
                while(dividend >sum <<1){
                    sum = sum<<1;
                    multiply = multiply<<1;
                    System.out.println("sum:" + sum);
                }
                dividend -= sum;
                ret += multiply;
                System.out.println(dividend + "," + sum);
            }
            return sign ? ret : -ret;
        }

}
