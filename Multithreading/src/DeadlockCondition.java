class A{
	public synchronized void d1(B b) {//this is executed by main thread
		System.out.println("thread -1 starts exeution of d1() ");
		try {
			Thread.sleep(3000);
		}catch(InterruptedException ie) {
			
		}
		System.out.println("thread try to call b last()");
		b.last();
		
	}
	public synchronized void last() {
		System.out.println("inside a last() method");
	}
}
class B{
	public  synchronized void d2(A a) {//this is executed by child thread.
		System.out.println("thread 2 starts execution of d2()");
		try {
			Thread.sleep(3000);
		}catch(InterruptedException ie) {
			
		}
		System.out.println("thread try to call a last()");
		a.last();
	}
	public synchronized void last() {
		System.out.println("inside b last() method");
	}
}
public class DeadlockCondition extends Thread{
	A a=new A();
	B b=new B();
	//here current object is Thread Object.
	public void m1() {
		this.start();
		a.d1(b);//it executed by main thread.
	}
	public void run() {
		b.d2(a);//it is executed by child thread.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeadlockCondition dc=new DeadlockCondition();
		dc.m1();
	}

}
