class Pappu{
	public void wish(String name) {
		
		;;;;;;
		synchronized(this) {//synchronized block lock current object.
			System.out.println(Thread.currentThread().getName()+" : get chance");
			for(int i=0;i<5;i++) {
				System.out.print("good morning :");
				try {
					Thread.sleep(2000);
				}catch(InterruptedException ie) {
					
				}
				System.out.println(name);
			}
		System.out.println("thread which releasing the lock :"+Thread.currentThread().getName()); 
				;;;;;;;;;;
				
			}
		}
	}

class Rangvaz extends Thread{
	Pappu d;//has -a relationship
	String name;
	Rangvaz(Pappu d,String name){
		this.d=d;
		this.name=name;
	}
	public void run() {
		d.wish(name);
	}
}

public class SynchronizedBlock {

	public static void main(String[] args) {
		Pappu d=new Pappu();
		Rangvaz mt1=new Rangvaz(d,"bipin");
		Rangvaz mt2=new Rangvaz(d,"aditya");
		// TODO Auto-generated method stub
//		Pappu d1=new Pappu();
//		Pappu d2=new Pappu();
//		Rangvaz mt1=new Rangvaz(d1,"bipin");//it gives irregular output becoz two thread is working on two different objects.
//		Rangvaz mt2=new Rangvaz(d2,"aditya");
		mt1.setName("bipin thread");
		mt2.setName("aditya thread");
		mt1.start();
		mt2.start();

	}

}
