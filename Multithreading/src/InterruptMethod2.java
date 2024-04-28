class Scl extends Thread{
	public void run() {
		for(int i=4;i<7;i++) {
			System.out.println("i am working");
		}
		System.out.println("entering into sleeping state");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException ie) {//when this thread goes to sleeping at a time it interrupted.
			System.out.println(" i am again interrrupted");
		}
	}
}
public class InterruptMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scl s=new Scl();
		s.start();
		s.interrupt();
		for(int i=4;i<7;i++) {
			System.out.println("main thread");
		}
	}

}
