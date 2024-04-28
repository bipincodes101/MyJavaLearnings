class Mariya extends Thread{
	public void run() {
		try {
			for(int i=0;i<4;i++) {
				System.out.println("child thread :"+ i);
				
			}
		}catch(Exception ie) {//without sleep we can't call interrupt method its compile time error
			System.out.println("hey please sleeping me");
		}
	}
}
public class InterruptMethod1 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Mariya m=new Mariya();
		m.start();
		m.interrupt();
		for(int i=0;i<3;i++) {
			System.out.println("main thread");
		}
	}

}
