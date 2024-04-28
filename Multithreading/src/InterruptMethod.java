//in this case main thread interrupt child thread when it goes to sleep.
class Thorkil extends Thread{
	public void run() {
		try {
			for(int i=0;i<4;i++) {
				System.out.println("i am child thread : "+ i);
				Thread.sleep(2000);
			}
		}catch(InterruptedException ie) {
			System.out.println("please don't interrupt me : ");
		}
	}
}
public class InterruptMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thorkil th=new Thorkil();
		th.start();
		th.interrupt();
		for(int i=0;i<4;i++) {
			System.out.println("main thread is ending");
		}
	}

}
