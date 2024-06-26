class Demo{
	public void happy(String name) {
		for(int i=0;i<5;i++) {
			System.out.print("happy anniversary :");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException ie) {
				
			}
			System.out.println(name);
		}
	}
}
class MyThread extends Thread{
	Demo d;//Has - a relationship
	String name;
	
		//creating the constructor 
		MyThread(Demo d,String name){
			this.d=d;
			this.name=name;
		}
		public void run() {
			d.happy( name);
		}
	}

public class ImportantConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Demo d=new Demo();
 MyThread t1= new MyThread(d,"Parents");
 MyThread t2=new MyThread(d,"mummydaddy");
 t1.start();
 t2.start();
	}

}
