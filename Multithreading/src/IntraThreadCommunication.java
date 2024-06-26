class ClassA extends Thread{
	int total=0;
	public void run() {
		synchronized(this) {//child thread got the locked.
			System.out.println("child thread started the calculation");//step -3
			
			for(int i=0;i<5;i++) {
				total+=i;
			}
			System.out.println("child thread giving notification to main thread");//step -4
			this.notify();// here ,child thread may or may(immidiately but release this is sure) not relases the lock so main thread go on one more waiting state for taking the lock from notification thread.
			//now notify method send the notification to waiting thread.
		}
	}
}
public class IntraThreadCommunication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ClassA c=new ClassA();
		c.start();//here two threads ->first main thead priority 5 and second child thread named Thread-0 priority 5.but main thread got prefrence.
	
		synchronized(c) {//main thread got locked.//step -1
			System.out.println("main thread calling wait method");
			c.wait();//here main thread go on waiting state and releases the lock for another thread.// step -2
			//main thread is waiting for releases the lock from other thread then it use total variable.
			System.out.println("main thread got notification ");//step -5
			System.out.println(c.total);// step -6
			
		}
	}

}
