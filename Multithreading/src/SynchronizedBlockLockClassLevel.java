class University{
	public void study(String name) {
		synchronized(University.class) {//class level lock
			System.out.println(Thread.currentThread().getName()+": thread get chance");
			for(int i=0;i<5;i++) {
				System.out.print("BCA ");
				try {
					Thread.sleep(2000);
				}catch(InterruptedException ie) {
					
				}
				System.out.println(name);
				
			}
			System.out.println(Thread.currentThread().getName()+" thread release the lock");
		}
	}
}
class Thread1 extends Thread{
	University u;
	String name;
	Thread1(University u,String name){
		this.u=u;
		this.name=name;
	}
	public void run() {
		u.study(name);
	}
}
public class SynchronizedBlockLockClassLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		University u=new University();
		Thread1 m1=new Thread1(u,"Rama");
		Thread1 m2=new Thread1(u,"psit");
		m1.setName("Rama");
		m2.setName("psit");
		m1.start();
		m2.start();
	}

}
