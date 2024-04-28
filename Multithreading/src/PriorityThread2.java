//becoz cpu doesn't support currect priority algorithm so give result wrong.
//MIN_PRIORITY IS 1 
//MAX _PRIORITY IS 10
//NORMAL_PRIORITY IS 5.
class Enur extends Thread {
	public void run() {
//		Thread.currentThread().setPriority(10);
		for (int i = 0; i < 4; i++) {
			System.out.println("first child class is executed with priority : " + Thread.currentThread().getPriority());
		}
System.out.println(Thread.currentThread().MIN_PRIORITY);
	}
}

class Thor extends Thread {
	public void run() {
		Thread.currentThread().setPriority(1);
		for (int i = 0; i < 4; i++) {
			System.out
					.println("second child class is executed with priority : " + Thread.currentThread().getPriority());
		}
	}
}

public class PriorityThread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enur e = new Enur();
		e.start();
		e.setPriority(3);
		Thor n = new Thor();
		n.start();
		Thread.currentThread().setPriority(2);
		for (int i = 0; i < 4; i++) {
			System.out.println("main thread is executed with priority : " + Thread.currentThread().getPriority());
		}
	}

}

