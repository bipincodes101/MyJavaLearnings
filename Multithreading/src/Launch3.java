//case 3
class Jack implements Runnable{
	public void run() {
		for(int  i=0;i<9;i++) {
			System.out.println("child thread");
		}
	}
	
}
public class Launch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jack j=new Jack();
		Thread t1=new Thread();
		Thread t2=new Thread(j);//internally Thread(java.lang.Runnable) is called.
		t2.run();//call user-defined run() method just normally call
		for(int i=0;i<6;i++) {
			System.out.println("main thread");
		}
	}
	}


