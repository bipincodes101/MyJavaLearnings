class Thorphin extends Thread implements Runnable {
	public void run() {
		Thread.yield();//it paused current excuting thread and give the cpu time to other thread  which has same priority for executing and it goes on ready state
		for( int i=0;i<5;i++) {
			System.out.println("first child thread getting executed : ");
		}
		
	}
}
class Helga implements Runnable{
	public void run() {
		
		Thread.yield();
		for(int i=0;i<5;i++) {
			System.out.println("second child thread getting executed: ");
		}
	}
}
public class YieldMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thorphin th=new Thorphin();
		Thread t=new Thread(th);
		t.start();
	
		Helga h=new Helga();
		Thread t2=new Thread(h);
		t2.start();
		Thread.currentThread().setPriority(2);
	Thread.yield();
	
		for( int i=0;i<5;i++) {
			System.out.println("main thread is executed: ");
		}
		
	}

}
