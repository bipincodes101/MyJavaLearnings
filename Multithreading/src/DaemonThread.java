class Android extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().isDaemon());
			System.out.println("android is running");
		}
	}
}
public class DaemonThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main thread getting started");
		Android a=new Android();
		a.setDaemon(true);//here child thread is Daemon thread or supporting or helping thread so main thread is going on dead because main thread is hero so no work for helping thread.
		a.start();
		System.out.println("program terminated");
	}

}
