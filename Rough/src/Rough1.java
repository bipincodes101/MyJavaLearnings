class MyThread extends Thread{
	public void run() {
		
		
			for(int i=5;i<8;i++) {
				System.out.println("user-defined thread");
			}
		
		
	}
}
class Rough1{
	public static void main(String []args) throws InterruptedException {
		
		MyThread mt=new MyThread();
		Thread t=new Thread(mt);
		t.start();
		
		t.join();
		t.interrupt();
		System.out.println("main thrread");
		
		
	}
}
