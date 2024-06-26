class BipinThread extends Thread{
	String name=null;
	public void run() {
		synchronized(this) {//this thread got the lock and start its execution .
			System.out.println("Thread -0 add some string to name and done its work");
			for(int i=0;i<3;i++) {
				name+="bipin ";
			}
			System.out.println("give the notification to main thread");
			this.notify();//it send the the notification to waiting stated and releases the lock not immiiately .when it release the lock main thread starts its execution.
		}
		
	}
}

public class LaunchIntraThreadCommunication   {

	public static void main  (String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		BipinThread bt=new BipinThread();
		bt.start();/*two thread first main second child (Thread -0) but main thread got prefrence*/
		synchronized(bt) {//main thread got the object level lock
			System.out.println("main thread goes on waiting state");
			bt.wait();/*here main thread release the lock and gave it to anther thread */
			
			System.out.println("main thread got notification ");
			System.out.println(bt.name);
		}
		System.out.println("program terminate");
	}


}
