class Pirates{
	public synchronized void  swim(String name) {//synchronized is used pause a thread.
		for(int i=0;i<5;i++) {
			System.out.print("which stolen the gold: ");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException ie) {
				System.out.println("interruption occur");
			}
			System.out.println(name);
		}
		
	}
}
class Boat extends Thread{
	Pirates p;//has -a realtionship.
	String name;
	Boat(Pirates p,String name){
		this.p=p;
		this.name=name;
	}
	Boat(String name){
		this.name=name;
	}
	public void run() {
		p.swim(name);
	}
}
public class SynchronizedKeyword {
	public static void main(String []args) {
		Pirates p=new Pirates();
		Boat mt1=new Boat(p,"Jack");
		Boat mt3=new Boat(p,"harry");
		mt1.start();
		mt3.start();
	}
	
	

}
