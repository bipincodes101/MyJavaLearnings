class Display{
	public   synchronized void displayNumbers() {//.object level lock
		for(int i=1;i<10;i++) {
			System.out.print(i+" ");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException ie) {
				
			}
		}
	}
	public static synchronized void displayCharacters() {//.class level lock
		for(int i=65;i<75;i++) {
			System.out.print((char)i+" ");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException ie) {
				
			}
		}
	}
}
class MyThread1 extends Thread{
	Display d;
	MyThread1(Display d){
		this.d=d;
	}
	public void run() {
		d.displayNumbers();
	}
	
}
class MyThread2 extends Thread{
	Display d;
	MyThread2(Display d){
		this.d=d;
	}
	public void run() {
		d.displayCharacters();
	}
}
public class SynchronizedConcept {
	public static void main(String []args) {
		Display d=new Display();
		MyThread1 mt1=new MyThread1(d);
		MyThread2 mt2=new MyThread2(d);
		mt1.start();
		mt2.start();
		
	}
}
