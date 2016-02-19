
public class ThreadsTest {

	static class TestRunnable implements Runnable{
		int num;
		public TestRunnable(int num){
			this.num = num;
		}
		public void run() {
			for(int i = 0; i < 10000000; i ++){
				if(i%10000000 == 0)
					System.out.println(num);
			}
			for(int i = 0; i < 10000000; i ++){
				if(i%10000000 == 0)
					System.out.println(num);
			}
		}		
	}
	
	private static Runnable testRunnable = new Runnable(){

		public void run() {
			for(int i = 0; i < 10000000; i ++){
				if(i%10000000 == 0)
					System.out.println(Thread.currentThread().getId());
			}
			for(int i = 0; i < 10000000; i ++){
				if(i%10000000 == 0)
					System.out.println(Thread.currentThread().getId());
			}
		}
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread threads[] = new Thread[10];
		for(int i = 0; i < 10; i ++){
			threads[i] = new Thread(new TestRunnable(i));
			threads[i].setPriority(i+1);
		}
		for(int i = 0; i < 10; i ++){
			threads[i].start();
		}
		System.out.println("-------------------------------");
	}

}
