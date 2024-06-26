/* lock is two type 
 * 1. (.class) level lock -> it happened when static synchronized is used.
 * 2.object level lock  -> it happened when synchronized is used.*/
class Mahabharat{
	public static synchronized void fight() {
		for(int i=0;i<5;i++) {
			System.out.print("fight ");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException ie) {
				
			}
			}
	}
	public  static synchronized void happiness() {
		for(int i=0;i<5;i++) {
			System.out.print("happy ");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException ie) {
				
			}
		}
		
		
	}
}
class BipinThread1 extends Thread{
	Mahabharat m;
	BipinThread1(Mahabharat m){
		this.m=m;
	}
	public void run() {
		m.fight();
	}
	
}
class BipinThread2 extends Thread{
	Mahabharat m;
	BipinThread2(Mahabharat m){
		this.m=m;
	}
	public void run() {
		m.happiness();
	}
}
public class ClassLevelLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mahabharat m=new Mahabharat();
		BipinThread1 b1=new BipinThread1(m);
		BipinThread2 b2=new BipinThread2(m);
		b1.start();
		b2.start();
	}

}
