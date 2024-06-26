class Ratanpur extends Thread{
	int total =0;
	public void run() {
		synchronized(this) {
			System.out.println("child thread is started the calculation ");
			for(int i=0;i<5;i++) {
				total+=i;
			}
			System.out.println("child thread give the notificatio to main thread");
			this.notify();
		}
	}
}
public class WhySleepIsDanger {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Ratanpur r=new Ratanpur();
		r.start();
		Thread.sleep(2000);//main thread is waiting for notification thread but child thread already done its execution and go on dead state.//infinite wait
		synchronized(r) {
			System.out.println("main thread goes on waiting state");
			r.wait();
			System.out.println(r.total);
			
		}
		System.out.println("program is terminated");
	}

}
